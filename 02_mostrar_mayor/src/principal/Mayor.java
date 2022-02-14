package principal;

public class Mayor {

	public static void main(String[] args) {
		//dados dos números, mostrar el cuadrado del mayor
		int a=6,b=3;
		int cuadrado;
		/*if(a>b) {
			cuadrado=a*a;
		}else {
			cuadrado=b*b;
		}*/
		cuadrado=a>b?a*a:b*b;
		System.out.println(cuadrado);
	}

}
