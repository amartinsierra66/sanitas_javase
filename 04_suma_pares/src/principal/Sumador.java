package principal;

public class Sumador {

	public static void main(String[] args) {
		int n1=20;
		int n2=12;
		//calcula la suma de todos números pares, comprendidos entre ambos extremos
		//si uno de los números es 16, la suma finalizará
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
