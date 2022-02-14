package principal;

public class SumaMil {

	public static void main(String[] args) {
		//¿Hasta que número tendremos que sumar, empezando por 1, hasta alcanzar o superar
		//el valor 1000?
		int suma=0, contador=0;
		final int MAX=1000;
		while(suma<MAX) {
			contador++;
			suma+=contador;
		}
		System.out.println("Para alcanzar "+MAX+" hay que sumar hasta "+contador);

	}

}
