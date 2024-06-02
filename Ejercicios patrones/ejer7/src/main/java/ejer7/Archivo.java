package ejer7;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends FyleSystem{
	private int tamanio;
	
	public Archivo(String nombre, LocalDate fechaCreacion, int tamanio) {
		super(nombre, fechaCreacion);
		this.tamanio = tamanio;
	}

	public int tamanioTotalOcupado() {
		return tamanio;
	}

	public Archivo archivoMasGrande() {
		return this;
	}

	public Archivo archivoMasNuevo() {
		return this;
	}

	public Archivo buscar(String nombre) {
		return nombre == super.getNombre()?this:null;
	}

	public String listadoDeContenido() {
		return super.getNombre();
	}
	
	

}
