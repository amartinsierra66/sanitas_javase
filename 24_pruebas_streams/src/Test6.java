import java.util.stream.Stream;

public class Test6 {

	public static void main(String[] args) {
		Stream<Integer> notas=Stream.of(5,8,7,6,3,4,5);
		//De todos los suspensos, indica cual ha sido la nota más alta
		notas
			.filter(n->n<5)
			.mapToInt(n->n)
			.max()
			.ifPresentOrElse(n->System.out.println(n), ()->System.out.println("No hay resultado"));

	}

}
