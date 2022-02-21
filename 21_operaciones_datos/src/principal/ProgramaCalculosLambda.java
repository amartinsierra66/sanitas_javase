package principal;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import service.OperacionesService;

public class ProgramaCalculosLambda {

	public static void main(String[] args) {
		List<Integer> lista=List.of(6,3,4,1,11,-19,-7);
		var oper=new OperacionesService();
		System.out.println("Suma de pares: "+oper.suma(lista, t->t%2==0));
		System.out.println("Suma de negativos: "+oper.suma(lista, t->t<0));
		
		//imprime los pares
		oper.procesar(lista,t->t%2==0 ,t->System.out.println(t));
	}

}

	