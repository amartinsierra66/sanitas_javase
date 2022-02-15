package principal;

public class BuscarCodigos {

	public static void main(String[] args) {
		String cods="MA123,SE45,BA44,VA290,MA14,AV89,SE300";
		//cuantos registros son de Madrid (MA)?
		String [] codigos=cods.split(",");
		int contador=0;
		for(String cod:codigos) {
			if(cod.startsWith("MA")) {
				contador++;
			}
		}
		System.out.println("Códigos encontrados: "+contador);
	}

}
