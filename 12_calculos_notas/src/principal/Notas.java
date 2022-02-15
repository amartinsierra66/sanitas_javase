package principal;

public class Notas {
	public static void main(String[] args) {
		/*String n="23p";
		int num=Integer.parseInt(n);*/
		
		String notas="3.5,4.6,2.3,7.8,5.9,4.3";
		//calcular la nota media
		String[] valores=notas.split(",");
		double media=0;
		for(String nota:valores) {
			media+=Double.parseDouble(nota);
		}
		System.out.println("Media: "+media/valores.length);
	}
}
