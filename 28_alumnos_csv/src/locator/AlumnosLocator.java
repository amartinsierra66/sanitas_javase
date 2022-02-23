package locator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import model.Alumno;

public class AlumnosLocator {
	private static String dir="c:\\tempo\\alumnos.csv";
	public static Stream<Alumno> getStream(){
		try {
			return Files.lines(Path.of(dir))//Stream<String>
					.map(s->convertirAlumno(s));
		}catch(IOException ex) {
			return Stream.empty();
		}
	}
	
	private static Alumno convertirAlumno(String cad) {
		String[] datos=cad.split(",");
		return new Alumno(datos[0],datos[1],datos[2],Double.parseDouble(datos[3]));
	}
}
