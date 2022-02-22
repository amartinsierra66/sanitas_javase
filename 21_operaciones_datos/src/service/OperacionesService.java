package service;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OperacionesService {
	
	/*public int sumaPares(List<Integer> lista) {
		int suma=0;
		for(Integer num:lista) {
			if(num%2==0) {
				suma+=num;
			}
		}
		return suma;
	}
	public int sumaNegativos(List<Integer> lista) {
		int suma=0;
		for(Integer num:lista) {
			if(num<0) {
				suma+=num;
			}
		}
		return suma;
	}*/
	public int suma(List<Integer> lista, Predicate<Integer> criterio) {
		int suma=0;
		for(Integer num:lista) {
			if(criterio.test(num)) {
				suma+=num;
			}
		}
		/*lista.forEach(n->{
			if(criterio.test(n)) {
				suma+=n; //no se pueden modificar variables locales en la expresi�n lambda
			}
		});
		*/
		return suma;
	}
	
	
	////m�todo que, dada una lista de n�meros, procese los n�meros que
	//cumplan con el criterio del predicado
	public void procesar(List<Integer> numeros,
			Predicate<Integer> criterio,
			Consumer<Integer> proceso) {
				for(Integer num:numeros) {
					if(criterio.test(num)) {
						proceso.accept(num);
					}
				}
	}
	
	
	//m�todo que, dada una lista de n�meros recibida como par�metro, aquellos n�meros que 
	//cumplan el criterio, ser�n transformados en otro dato(String) junto con un valor entero obtenido de un Supplier,
	//tambi�n recibido como par�metro. El resultado de esa tranformaci�n ser� procesado por el consumer
	//recibido tambi�n como par�metro
	public void operacion(List<Integer> numeros,
			  Predicate<Integer> criterio,
			  BiFunction<Integer,Integer,String> tx,
			  Supplier<Integer> valor,
			  Consumer<String> proceso) {
		
		for(Integer num:numeros) {
			if(criterio.test(num)) {
				proceso.accept(tx.apply(num, valor.get()));
			}
		}
		
	}
	
}
