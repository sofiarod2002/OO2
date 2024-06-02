package ejer13;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Sugerencia {
	
	public List<Pelicula> sugerirPeliculas(List<Pelicula> peliculas,  List<Pelicula> reproducidas) {
		return 	getPeliculas(peliculas, reproducidas).stream()
				  .filter(peli-> !reproducidas.contains(peli))
				  .sorted(this.comparador())
				  .limit(3)
				  .collect(Collectors.toList());
	}
	
	abstract List<Pelicula> getPeliculas(List<Pelicula> peliculas,  List<Pelicula> reproducidas);
	
	abstract Comparator<Pelicula> comparador();

}
