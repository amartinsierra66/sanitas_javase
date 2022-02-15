package principal;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		//solicita por teclado la introducción de un texto, y muestra el total
		//de vocales que hay en dicho texto
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce un texto:");
		String texto=scanner.nextLine();
		System.out.println("Total de vocales: "+contarVocales(texto));
		
		//-------------------------Respresentación de literales de texto
		String cad="select * from datos where nombre='paco'";
		String cad2="select * from datos where nombre=\"paco\"";
		String cad3="""
					select * from datos where nombre="paco"
				"""; //desde Java 15

	}
	static int contarVocales(String texto) {
		texto=texto.toLowerCase();
		int cont=0;
		for(int i=0;i<texto.length();i++) {
			switch(texto.charAt(i)) {
				case 'a','e','i','o','u':
					cont++;
				}
		}
		return cont;
	}

}
