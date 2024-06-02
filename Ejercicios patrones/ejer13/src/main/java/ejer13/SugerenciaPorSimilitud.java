package ejer13;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaPorSimilitud extends Sugerencia{

//	@Override
//	public List<Pelicula> sugerirPeliculas(List<Pelicula> peliculas,List<Pelicula> reproducidas) {
//		return super.sugerirPeliculas(this.ultimaPelicula(reproducidas), reproducidas);
//	}
//	
//	private List<Pelicula> ultimaPelicula(List<Pelicula> reproducidas){
//		return reproducidas.get(reproducidas.size()-1).getPeliculasSimilares();
//	}

	@Override
	List<Pelicula> getPeliculas(List<Pelicula> peliculas, List<Pelicula> reproducidas) {
		// TODO Auto-generated method stub
		return peliculas.stream().flatMap(p -> p.getPeliculasSimilares().stream()).toList();
	}

	@Override
	Comparator<Pelicula> comparador() {
		// TODO Auto-generated method stub
		return Comparator.comparing(Pelicula::getAnio).reversed();
	}
	

}
