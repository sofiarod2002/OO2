package ar.edu.unlp.info.oo2.facturacion_llamadas;



public class GestorNumeroDisponibleUltimo extends GestorNumerosDisponibles{
	
	public String obtenerNumeroLibre() {
		return getLineas().last();
	}

}
