package principal;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import service.OperacionesService;

public class ProgramaCalculos {

	public static void main(String[] args) {
		List<Integer> lista=List.of(6,3,4,1,11,-19,-7);
		var oper=new OperacionesService();
		System.out.println("Suma de pares: "+oper.suma(lista, new Pares()));
		System.out.println("Suma de negativos: "+oper.suma(lista, new Negativos()));
		
		//imprime los pares
		oper.procesar(lista, new Pares(), new Imprimir());
	}

}
class Pares implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		return t%2==0;
	}
	
}
class Negativos implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		return t<0;
	}
	
}
class Imprimir implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
	
}