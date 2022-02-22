package principal;

import java.util.stream.Stream;

public class Generador {

	public static void main(String[] args) {
		// Generar una combinación de los números de la primitiva
		//Math.random() : genera un número aleatorio entre 0.0 y 0.99999
		//(int)(Math.random()*49+1)
		Stream.generate(()->(int)(Math.random()*49+1))
			.distinct()
			.limit(6)
			.sorted()
			.forEach(System.out::println);
	}

}
