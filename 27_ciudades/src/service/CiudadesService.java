package service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Ciudad;

public class CiudadesService {
	List<Ciudad> ciudades=List.of(new Ciudad("ciudad 1",200000,20.5),
			new Ciudad("ciudad 2",3000000,11.8),
			new Ciudad("ciudad 3",1800000,22.0),
			new Ciudad("ciudad 4",700000,30.1),
			new Ciudad("ciudad 5",2200000,19.8));
	
		//Devuelve la ciudad con mayor número de habitantes
	
		public Ciudad ciudadMasPoblada() {
			return ciudades.stream()
					.max(Comparator.comparing(c->c.getHabitantes()))
					.orElse(null);
		}
		
		//Devuelve la ciudad cuyo nombre coincida con el valor recibido
		public Ciudad ciudadPorNombre(String nombre) {
			return ciudades.stream()
					.filter(c->c.getNombre().equals(nombre))
					.findFirst()
					.orElse(null);
		}
		//Devuelve la temperatura media de todas ciudades
		public double mediaTemperatura() {
			/*return ciudades.stream()
					.mapToDouble(c->c.getTemperatura())
					.average()
					.orElse(0);*/
			return ciudades.stream()
					.collect(Collectors.averagingDouble(c->c.getTemperatura()));
		}
		
		//devuelve la lista de ciudades, que tengan más habitantes que el valor recibido como parámetro
		
		public List<Ciudad> ciudadesMasHabitantes(int habitantes){
			return ciudades.stream()
					.filter(c->c.getHabitantes()>habitantes)
					.collect(Collectors.toList());
					
		}
		
		
}
