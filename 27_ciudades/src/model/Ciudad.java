package model;

public class Ciudad {
	private String nombre;
	private long habitantes;
	private double temperatura;
	public Ciudad(String nombre, long habitantes, double temperatura) {
		super();
		this.nombre = nombre;
		this.habitantes = habitantes;
		this.temperatura = temperatura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(long habitantes) {
		this.habitantes = habitantes;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
}
