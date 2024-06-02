package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class GestorNumeroDisponiblePrimero extends GestorNumerosDisponibles{
	
	public String obtenerNumeroLibre() {
		return getLineas().first();
		}


}
