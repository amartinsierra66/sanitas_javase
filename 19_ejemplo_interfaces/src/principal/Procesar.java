package principal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import service.Muestra;

//Crear una clase que, para cualquier objeto que implemente la interfaz
//Muestra, aplique el método pintar a los números devueltos por el generador
public class Procesar {
	public void operator(Muestra muestra) {
		List<Integer> numeros=muestra.generador();
		for(Integer num:numeros) {
			muestra.pintar(num);
		}
	}
	
	/*Crear un método que, dada una lista de cadenas y una cadena auxiliar, devuelva
	un conjunto de cadenas formado por aquellas cadenas de la lista
	que contengan la cadena auxiliar*/
	
	public Set<String> transformar(List<String> cadenas, String aux){
		Set<String> resultado=new HashSet<String>();
		for(String cad:cadenas) {
			if(cad.contains(aux)) {
				resultado.add(cad);
			}
		}
		return resultado;
	}
	
}
