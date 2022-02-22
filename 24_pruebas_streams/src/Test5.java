import java.util.stream.Stream;

public class Test5 {

	public static void main(String[] args) {
		Stream<Integer> notas=Stream.of(5,8,3,6,9,7,5);
		//calcula la nota media
		System.out.println(notas
		.mapToInt(n->n)
		.average()
		.getAsDouble());
	}

}
