import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(20,-3,6,20,3,11,8,11,-9,3,17,-8);
		//mostrar los positivos no duplicados
		stream
			.filter(n->n>=0)
			.distinct()
			.forEach(System.out::println);

	}

}
