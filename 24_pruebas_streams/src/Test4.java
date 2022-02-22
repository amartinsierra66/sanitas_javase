import java.util.stream.Stream;

public class Test4 {

	public static void main(String[] args) {
		Stream<String> nombres=Stream.of("Carlos","Juan","Marta","Marcos","Maria");
		//muestra el número de caracteres de cada nombre que comience por M
		/*nombres
		.filter(n->n.startsWith("M"))
		.map(s->s.length()) //genera stream de números Stream<Integer>
		.forEach(System.out::println);*/
		
		//suma el total de caracteres de todos los nombres que comiencen por M
		System.out.println(nombres
					.filter(n->n.startsWith("M"))
					.mapToInt(s->s.length()) //IntStream
					.sum());

	}

}
