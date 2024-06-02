package oo2.ejer22Builder;

public class IngredienteConcreto implements Ingrediente {
	private String nombre;
	private double precio;
	
	public IngredienteConcreto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public double getPrecio() {
		return this.precio;
	}
}
