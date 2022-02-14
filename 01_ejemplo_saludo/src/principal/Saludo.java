package principal;

public class Saludo {
	int m;//variable atributo
	//var k=10; //no se puede utilizar con atributos
	public static void main(String[] args) {
		int v;//local
		for(v=1;v<=10;v++) {
			System.out.println("Saludo "+v);
		}
		//ojo, solo válido a partir de Java 10
		var p=10; //int
		var s='@'; //char
		var b=true; //boolean
		var w=0.0; //double
		
		//var mv; //error, obligatorio asignar un valor para poder inferir el tipo
	}

}
