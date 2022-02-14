package principal;

public class Resultados {
	static int [] notas= {8,2,4,1,7,5,2,9,4};
	public static void main(String[] args) {
		//dado un array con las notas de los alumnos de un curso
		//indicar, para cada nota, si es suspenso, aprobado, notable o sobresaliente
		
		for(int nota:notas) {
			resultado(nota);
			
		}
		//calcule el número de aprobados y la nota media
		System.out.println("Total aprobados "+aprobados());
		System.out.println("Media "+media());
	}
	static int aprobados() {
		int res=0;
		for(int n:notas) {
			if(n>=5) {
				res++;
			}
		}
		return res;
	}
	static int media () {
		int res=0;
		for(int n:notas) {
			res+=n;
		}
		return res/notas.length;
	}
	
	static void resultado(int nota) {
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
