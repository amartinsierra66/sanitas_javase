package model;

import com.google.gson.annotations.SerializedName;

public class Pais {
	@SerializedName("name")
	private String nombre;
	@SerializedName("region")
	private String continente;
	private String capital;
	@SerializedName("population")
	private long habitantes;
	@SerializedName("flag")
	private String bandera;
	public Pais(String nombre, String continente, String capital, long habitantes, String bandera) {
		super();
		this.nombre = nombre;
		this.continente = continente;
		this.capital = capital;
		this.habitantes = habitantes;
		this.bandera = bandera;
	}
	public Pais() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContinente() {
		return continente;
	}
	public void setContinente(String continente) {
		this.continente = continente;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public long getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(long habitantes) {
		this.habitantes = habitantes;
	}
	public String getBandera() {
		return bandera;
	}
	public void setBandera(String bandera) {
		this.bandera = bandera;
	}
	
}
