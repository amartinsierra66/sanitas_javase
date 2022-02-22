import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(20,-3,6,20,3,11,8,11,-9,3,17,-8);
		//mostrar los cinco primeros números no repetidos
		stream
			.distinct()
			.limit(5)
			.forEach(System.out::println);

	}

}
