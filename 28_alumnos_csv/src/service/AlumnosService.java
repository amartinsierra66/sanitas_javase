package service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import locator.AlumnosLocator;
import model.Alumno;

public class AlumnosService {
	//nota media del curso recibido como parámetro
	
	public double mediaCurso(String curso) {
		return AlumnosLocator.getStream() //Stream<Alumno>
				.filter(a->a.getCurso().equals(curso))
				.collect(Collectors.averagingDouble(a->a.getNota()));
	}
	
	//lista de alumnos del curso recibido como parámetro
	public List<Alumno> alumnosCurso(String curso){
		return AlumnosLocator.getStream() //Stream<Alumno>
				.filter(a->a.getCurso().equals(curso))
				.collect(Collectors.toList());
	}
	
	//alumno con la nota más alta
	public Alumno alumnoNotaAlta() {
		return AlumnosLocator.getStream()
				.max(Comparator.comparing(a->a.getNota()))
				.orElse(null);
	}
	
	//lista con los nombres de todos los cursos
	public List<String> nombresCurso(){
		return AlumnosLocator.getStream()
				.map(a->a.getCurso())
				.distinct()
				.collect(Collectors.toList());
	}
	
	
}
