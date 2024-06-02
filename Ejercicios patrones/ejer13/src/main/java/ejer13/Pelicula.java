package ejer13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private LocalDate anio;
	private double puntaje;
	private List<Pelicula> peliculasSimilares = new ArrayList<Pelicula>();
	
	public Pelicula(String titulo, LocalDate anio, double puntaje){
		this.titulo = titulo;
		this.anio = anio;
		this.puntaje = puntaje;
	}
	
	public List<Pelicula> getPeliculasSimilares(){
		return this.peliculasSimilares;
	}
	
	public void agregarPeliculasSimilares(Pelicula p){
		this.peliculasSimilares.add(p);
	}

	public LocalDate getAnio() {
		return anio;
	}


	public double getPuntaje() {
		return puntaje;
	}


	
 
}
