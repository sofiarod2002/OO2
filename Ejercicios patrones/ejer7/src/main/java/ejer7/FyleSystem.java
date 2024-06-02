package ejer7;

import java.time.LocalDate;
import java.util.List;

public abstract class FyleSystem {
	private String nombre;
	private LocalDate fechaCreacion; 
	
	public FyleSystem(String nombre, LocalDate fechaCreacion) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}
	
	abstract public int tamanioTotalOcupado();
	abstract public Archivo archivoMasGrande();
	abstract public Archivo archivoMasNuevo();
	abstract public FyleSystem buscar(String nombre);
	//abstract public List<Archivo> buscarTodos(String nombre);
	abstract public String listadoDeContenido();

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	

}
