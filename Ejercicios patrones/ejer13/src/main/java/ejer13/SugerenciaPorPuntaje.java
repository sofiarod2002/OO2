package ejer13;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaPorPuntaje extends Sugerencia{

//	@Override
//	public List<Pelicula> sugerirPeliculas(List<Pelicula> peliculas,  List<Pelicula> reproducidas) {
//		return super.sugerirPeliculas(this.ordenarPeliculas(peliculas), reproducidas);
//	}
//
//	private List<Pelicula> ordenarPeliculas(List<Pelicula> peliculas){
//	    return peliculas.stream() 
//	                  .sorted(Comparator.comparing(Pelicula::getPuntaje).reversed())
//	                  .collect(Collectors.toList());
//	}

	@Override
	List<Pelicula> getPeliculas(List<Pelicula> peliculas, List<Pelicula> reproducidas) {
		// TODO Auto-generated method stub
		return peliculas;
	}

	@Override
	Comparator<Pelicula> comparador() {
		// TODO Auto-generated method stub
		return Comparator.comparing(Pelicula::getPuntaje).reversed();
	}
	
	

}
