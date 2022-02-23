package service;

import java.util.stream.Collectors;

import locator.AlumnosLocator;

public class AlumnosService {
	//nota media del curso recibido como parámetro
	
	public double mediaCurso(String curso) {
		return AlumnosLocator.getStream() //Stream<Alumno>
				.filter(a->a.getCurso().equals(curso))
				.collect(Collectors.averagingDouble(a->a.getNota()));
	}
	
	//lista de alumnos del curso recibido como parámetro
	
	
	//alumno con la nota más alta
	
	
	//lista con los nombres de todos los cursos
	
	
	
}
