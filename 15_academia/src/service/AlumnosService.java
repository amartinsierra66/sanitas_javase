package service;

import java.util.ArrayList;
import java.util.HashSet;

import model.Alumno;

public class AlumnosService {
	private ArrayList<Alumno> alumnos=new ArrayList<>();
	//recoge alumno y lo guarda
	   public void agregarAlumno (Alumno alumno) {
		   alumnos.add(alumno);
	    }
	    public void agregarAlumno (String nombre, String curso, double nota) {
	        Alumno alumno = new Alumno(nombre, curso, nota);
	        agregarAlumno(alumno);
	    }
	    //devuelve la nota media global
	    public double media() {
	        double media = 0;
	        for (Alumno alumno:alumnos) {
	            media+=alumno.getNota();
	        }
	        return media/alumnos.size();
	    }
	    public HashSet<Alumno> alumnosCurso(String curso){
	        HashSet<Alumno> alumnosC = new HashSet<Alumno>();
	        for(Alumno alumno:alumnos) {
	            if(alumno.getCurso().equals(curso)) {
	                alumnosC.add(alumno);
	            }
	        }
	        return alumnosC;
	    }
}
