package service;

public class Calculadora {
	private int numero1;
	private int numero2;
	
	//metodos de la calculadora
	public int sumar() {
		return numero1+numero2;
	}
	public int multiplicar() {
		return numero1*numero2;
	}
	public int dividir() {
		return numero1/numero2;
	}
	public void establecerNumeros(int n1, int n2) {
		numero1=n1;
		numero2=n2;
	}
	
	public static int factorial(int n) {
		int resultado=1;
		for(int i=1;i<=n;i++) {
			resultado*=i;
		}
		return resultado;
	}
}
