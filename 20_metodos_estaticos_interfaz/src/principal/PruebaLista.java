package principal;

import java.util.ArrayList;
import java.util.List;

public class PruebaLista {

	public static void main(String[] args) {
		//crea una lista con cuatro n�meros enteros cualquiera
		List<Integer> lista=new ArrayList<>();
		lista.add(20);
		lista.add(7);
		lista.add(11);
		lista.add(42);
		//lo mismo pero con m�todo estatico de List
		//colecci�n inmutable
		List<Integer> lista2=List.of(20,7,11,42);
		
	}

}
