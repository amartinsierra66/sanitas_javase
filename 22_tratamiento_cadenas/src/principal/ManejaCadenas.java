package principal;

import java.util.List;
import java.util.Set;

import service.CadenasService;

public class ManejaCadenas {
	public static void main(String[] args) {
		var service=new CadenasService();
		var textos=Set.of("hola","adios","hello","by","end");
		var numeros=List.of(5,11,2,8,6);
		//Mostrar las cadenas que empiecen por "a"
		service.procesarCadenas(textos, c->c.startsWith("a"), System.out::println);
		//Mostrar las cadenas que tengan más de tres caracteres
		service.procesarCadenas(textos, c->c.length()>3, System.out::println);
		//Indicar cuantas cadenas del conjunto tienen un número par de caracteres
		System.out.println(service.contarCadenas(textos, c->c.length()%2==0));
		
		//Mostrar el resultado de concatenar a cada cadena su correspondiente número de la lista
		service.procesarListas(List.copyOf(textos), numeros, (a,b)->a+b, System.out::println);
		
	}
}
