package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public abstract class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();

	public SortedSet<String> getLineas() {
		return lineas;
	}
	
	public abstract String obtenerNumeroLibre();

    public void setLineas(SortedSet<String> lineas) {
		this.lineas = lineas;
	}

	public String obtenerNumero(){
        String linea = this.obtenerNumeroLibre();
    	borrarLinea(linea);
		return linea;
	}

    public void borrarLinea(String linea) {
		getLineas().remove(linea);
	}
    

    public boolean agregarNumeroTelefono(String numeroNuevo) {
		if (encontreNumero(numeroNuevo)) 
			return false;
		else 
			return agregarNumero(numeroNuevo);
    }	

    private boolean agregarNumero(String numeroNuevo){
        this.getLineas().add(numeroNuevo);
		return true;
    }

	private boolean encontreNumero(String numeroNuevo){
	    return this.getLineas().contains(numeroNuevo);
	}
    
}
