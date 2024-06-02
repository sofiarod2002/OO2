package ejer13;

import java.util.*;

public class Decodificador {
	private List<Pelicula> grilla;
	private List<Pelicula> reproducidas;
	private Sugerencia tipoDeSugerencia;
	
	public Decodificador(Sugerencia sug, List<Pelicula> grilla, List<Pelicula> reproducidad) {
		this.grilla = grilla;
		this.reproducidas = reproducidad;
		this.tipoDeSugerencia = sug;
	}
	
	public List<Pelicula> sugerirPeliculas(){
		return this.tipoDeSugerencia.sugerirPeliculas(grilla,reproducidas);
	}
	
	public void cambiarConfiguracion (Sugerencia nuevaSugerencia) {
		this.tipoDeSugerencia = nuevaSugerencia;
	}

}
