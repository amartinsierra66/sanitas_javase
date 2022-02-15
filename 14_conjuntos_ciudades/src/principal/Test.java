package principal;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<String> ciudades=new HashSet<>();
		ciudades.add("Madrid");
		ciudades.add("Valencia");
		ciudades.add("Zaragoza");
		ciudades.add("Ávila");
		ciudades.add("Valencia");
		for(String ciudad:ciudades) {
			System.out.println(ciudad);
		}

	}

}
