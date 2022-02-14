package principal;

public class Examen {

	public static void main(String[] args) {
		//dada una nota numérica almacena en una variable,
		//indicar si es suspenso (0-4), aprobado(5-6), notable(7-8), sobresaliente(9-10)
		int nota=7;
		switch(nota) {
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("suspenso");
				break;
			case 5:
			case 6:
				System.out.println("aprobado");
				break;
			case 7,8: //desde Java 13
				System.out.println("notable");
				break;
			case 9,10: //desde Java 13
				System.out.println("sobresaliente");
				break;
			default:
				System.out.println("Nota no válida");
			
		}

	}

}
