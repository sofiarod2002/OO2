package ejer7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends FyleSystem{
	private List<FyleSystem> contenido = new ArrayList<FyleSystem>();

	public Directorio(String nombre, LocalDate fechaCreacion, List<FyleSystem> directorios ) {
		super(nombre, fechaCreacion);
		this.contenido = directorios;
	}

	public int tamanioTotalOcupado() {
		return contenido.stream()
				 .mapToInt(dir-> dir.tamanioTotalOcupado())
				 .sum() + 32; 
	}

	public Archivo archivoMasGrande() {
		return contenido.stream() 
		          .map(d -> d.archivoMasGrande())       
		           .max((d1, d2)-> Double.compare(
		        		 d1.tamanioTotalOcupado(), d2.tamanioTotalOcupado()))
		         .orElse(null);
	}


	public Archivo archivoMasNuevo() {
		return  contenido.stream() 
		          .map(d -> d.archivoMasNuevo())       
		          .max(Comparator.comparing(Archivo::getFechaCreacion))
		         .orElse(null);
	}

	@Override
	public FyleSystem buscar(String nombre) {
		if (super.getNombre().equals(nombre))
			return this;
		else
			return contenido.stream()
				.map(dir -> dir.buscar(nombre))       
				.filter(r -> r != null)
				  .findFirst().orElse(null);
	}
	
	public List<FyleSystem> buscarTodos(String nombre) {
		return contenido.stream() 
		.filter(cont-> cont.getNombre() == nombre)
		  .collect(Collectors.toList()); 
	}

	public String listadoDeContenido() {
		return contenido.stream() 
		        .map(dir -> dir.getNombre() + "/")       
		        .collect(Collectors.joining(" "));
	}
	
	private String exportar(FyleSystem cont) {
		String separator = System.lineSeparator();
		return "/" + cont.getNombre() + "/" + separator;
	}
	
	public String listadoDeContenido2() {
		String separator = System.lineSeparator();
		StringBuilder buffer = new StringBuilder();
		contenido.forEach(cont -> {
			buffer.append(this.exportar(cont))
				.append(separator);
		});
		return buffer.toString();
	}

}
