package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	public List<Llamada> llamadas;
	private String nombre;
	private String numeroTelefono;


	public Cliente(String nombre) {
		this.llamadas = new ArrayList<Llamada>();
		this.nombre = nombre;
	}
	
	public abstract double getDescuento();
	

	public String getNombre() {
		return nombre;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	
	public void setNumeroTelefono(String telefono) {
		this.numeroTelefono = telefono;
	}
	
	public void agregarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}
	
	public double calcularMontoTotalLlamadas() {
		return llamadas.stream()
	            .mapToDouble(l -> l.getPrecioMasIVA() * (1 - this.getDescuento()))
	            .sum();
	}
	
}
