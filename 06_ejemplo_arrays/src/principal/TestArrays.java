package principal;

public class TestArrays {

	public static void main(String[] args) {
		int[] numeros=new int[5];//array de cinco números enteros
		/*numeros[0]=20;
		numeros[1]=3;
		numeros[2]=5;
		numeros[3]=11;
		numeros[4]=14;*/
		//numeros[5]=3;
		
		//sumar el contenido del array
		int suma=0;
		for(int i=0;i<numeros.length;i++) {
			suma+=numeros[i];
		}
		System.out.println("La suma es "+suma);
	}

}
