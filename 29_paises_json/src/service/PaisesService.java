package service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import locator.PaisesLocator;
import model.Pais;

public class PaisesService {
	
	//lista de continentes
	public List<String> continentes(){
		return PaisesLocator.getPaises()
				.map(p->p.getContinente())
				.distinct()
				.collect(Collectors.toList());
	}
	
	//paises por continente
	public List<Pais> paisesPorContinente(String continente){
		return PaisesLocator.getPaises()
				.filter(p->p.getContinente().equals(continente))
				.collect(Collectors.toList());
	}
	
	//pais más poblado
	public Pais paisMasPoblado() {
		return PaisesLocator.getPaises()
				.max(Comparator.comparing(p->p.getHabitantes()))
				.orElse(null);
	}
	
	//poblacion total por continente
	public double poblacionContinente(String continente) {
		return PaisesLocator.getPaises()
				.filter(p->p.getContinente().equals(continente))
				//.mapToDouble(p->p.getHabitantes())
				//.sum();
				.collect(Collectors.summingLong(p->p.getHabitantes()));
	}
	
}
