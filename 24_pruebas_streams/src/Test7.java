import java.util.List;
import java.util.stream.Stream;

public class Test7 {

	public static void main(String[] args) {
		List<Integer> nums=List.of(20,100,80,25);
		Stream<Integer> pst=nums.parallelStream();		
		pst.sorted().sequential().forEach(s->System.out.println(s));


	}

}
