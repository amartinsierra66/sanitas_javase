package principal;

import service.Calculadora;

public class MiCalculadora {

	public static void main(String[] args) {
		int a=7,b=10;
		//muestra la suma, multiplicación y división de esos números
		Calculadora calc=new Calculadora();
		calc.establecerNumeros(a, b);
		System.out.println("Suma: "+calc.sumar());
		System.out.println("Multiplicar: "+calc.multiplicar());
		System.out.println("Dividir: "+calc.dividir());
		
		int n=4;
		System.out.println("Factorial: "+Calculadora.factorial(n));
	}

}
