package principal;

import java.util.Scanner;

public class Sumador {

	public static void main(String[] args) {
		//creamos objeto Scanner para leer del teclado
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce el primer n�mero:");
		int n1=scanner.nextInt();
		System.out.println("Introduce el segundo n�mero:");
		int n2=scanner.nextInt();
		//calcula la suma de todos n�meros pares, comprendidos entre ambos extremos
		//si uno de los n�meros es 16, la suma finalizar�
		int mayor,menor;
		var suma=0;
		mayor=n1>n2?n1:n2;
		menor=n1<n2?n1:n2;
		for(int i=menor;i<=mayor;i++) {
			if(i%2==0) { //preguntamos si es par
				suma+=i;
				if(i==16) {
					break;
				}
			}
		}
		System.out.println("La suma de los pares es "+suma);

	}

}
