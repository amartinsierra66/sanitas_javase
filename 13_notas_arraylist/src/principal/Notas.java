package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		//haz un programa que solicite 5 notas
		//las guardar en una lista y después, elimina los suspensos
		//y nos muestra lo que queda en la colección
		ArrayList<Double> notas=new ArrayList<Double>();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.println("Introduce nota: ");
			notas.add(sc.nextDouble());
		}
		//eliminamos suspensos
		for(int i=0;i<notas.size();i++) {
			if(notas.get(i)<5) {
				notas.remove(i);
			}
		}
		System.out.println("---------------------Notas restantes:------------");
		//mostramos lo que queda
		for(Double nota:notas) {
			System.out.println(nota);
		}

	}

}
