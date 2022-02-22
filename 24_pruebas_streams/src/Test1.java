import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(20,-3,6,3,11,8,11,-9,3,17,-8);
		//System.out.println(stream.count());
		//stream.forEach(n->System.out.println(n));
		
		//¿cuantos números distintos hay?
		System.out.println(stream
								.distinct()
								.count());
		
	}

}
