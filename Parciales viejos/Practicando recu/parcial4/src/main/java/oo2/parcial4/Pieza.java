package oo2.parcial4;

public abstract class Pieza {
	private String nombre;
	
	public Pieza(String nombre) {
		this.nombre = nombre;
	}
	
	public String informacionCompleta() {
		return this.nombre + this.darInformacion();
	}
	
	
	public abstract double calcularBateria();
	public abstract double calcularPotencia();
	public abstract String darInformacion();
}
