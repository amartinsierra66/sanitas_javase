package service;

import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CadenasService {
	//devuelve el número de cadenas que cumplen el criterio
	public int contarCadenas(Set<String> cadenas,Predicate<String> criterio) {
		var contador=0;
		for(String cad:cadenas) {
			if(criterio.test(cad)) {
				contador++;
			}
		}
		return contador;
	}
	//procesa las cadenas que cumplen el criterio
	public void procesarCadenas(Set<String> cadenas,Predicate<String> criterio, Consumer<String> procesar) {
		
		for(String cad:cadenas) {
			if(criterio.test(cad)) {
				procesar.accept(cad);
			}
		}
		
	}
	//procesa el resultado de trasformar cada número de la lista y cada texto de otra lista
	//en un string
	public void procesarListas(List<String> textos, List<Integer> numeros, BiFunction<String,Integer,String> tx, Consumer<String> procesar) {
		for(int i=0;i<textos.size();i++) {
			procesar.accept(tx.apply(textos.get(i), numeros.get(i)));
		}
	}
}
