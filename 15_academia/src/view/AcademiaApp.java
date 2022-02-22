package view;

import java.util.HashSet;
import java.util.Scanner;

import model.Alumno;
import service.AlumnosService;

public class AcademiaApp {

	public static void main(String[] args) {
		var service=new AlumnosService();
		var sc=new Scanner(System.in);
		var option=0;
		String nombre,curso;
		double nota;
		do {
			menu();
			option=Integer.parseInt(sc.nextLine());
			switch(option) {
				case 1:
					System.out.println("Nombre:");
					nombre=sc.nextLine();
					System.out.println("Curso:");
					curso=sc.nextLine();
					System.out.println("Nota:");
					nota=Double.parseDouble(sc.nextLine());
					Alumno alumno=new Alumno(nombre, curso, nota);
					service.agregarAlumno(alumno);
					break;
				case 2:
					System.out.println("Media: "+service.media());
					break;
				case 3:
					System.out.println("Curso:");
					curso=sc.nextLine();
					HashSet<Alumno> alumnos=service.alumnosCurso(curso);
					/*for(Alumno al:alumnos) {
						//System.out.println(al.getNombre()+"-"+al.getNota());
						System.out.println(al.toString());
					}*/
					alumnos.forEach(al->System.out.println(al.toString()));
			}		
		}while(option!=4);
	}
	
	static void menu() {
		System.out.println("1. Nuevo alumno");
		System.out.println("2. Media");
		System.out.println("3. Alumnos de curso");
		System.out.println("4. Salir");
	}

}
