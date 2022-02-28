package locator;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Arrays;
import java.util.stream.Stream;

import com.google.gson.Gson;

import model.Pais;

public class PaisesLocator {
	private final static String URL="https://restcountries.com/v2/all";
	
	public static Stream<Pais> getPaises(){
		
		HttpRequest request=HttpRequest.newBuilder()
				.uri(URI.create(URL))
				.GET()
				.build();
		HttpClient client=HttpClient.newBuilder()
				.version(Version.HTTP_1_1)
				.build();
		try {
			HttpResponse<String> response=client.send(request, BodyHandlers.ofString());
			String cuerpoRespuesta=response.body();
			//convertir esa cadena JSON que viene el cuerpo de la respuesta
			//en un Stream de objetos Pais
			Gson gson=new Gson();
			return Arrays.stream(gson.fromJson(cuerpoRespuesta, Pais[].class)).parallel();		
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
			return Stream.empty();
		}
	}
}
