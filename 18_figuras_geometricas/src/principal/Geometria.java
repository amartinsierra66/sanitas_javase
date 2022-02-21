package principal;

import geometria.Circulo;
import geometria.Figura;
import geometria.Triangulo;

public class Geometria {

	public static void main(String[] args) {
		//creamos una figura de cada tipo y mostramos su color y área
		/*Sin polimorfismo
		Circulo circulo=new Circulo("Naranja",4);
		Triangulo triangulo=new Triangulo("Azul", 7, 3);
		System.out.println("Color: "+circulo.getColor());
		System.out.println("Superficie: "+circulo.superficie());
		System.out.println("Color: "+triangulo.getColor());
		System.out.println("Superficie: "+triangulo.superficie());*/
		
		//con polimorfismo
		mostrarDatos(new Circulo("Naranja",4));
		mostrarDatos(new Triangulo("Azul", 7, 3));
		
		
		//Object ob=new String("Hola");
		Object ob=100;
		System.out.println(ob.toString());
	}
	static void mostrarDatos(Figura figura) {
		System.out.println("Color: "+figura.getColor());
		System.out.println("Superficie: "+figura.superficie());
	}
	
	static Figura crearFigura() {
		return new Circulo("verde",7);
	}

}
