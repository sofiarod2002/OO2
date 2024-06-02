package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.Random;

public class GestorNumeroDisponibleRandom extends GestorNumerosDisponibles{
	
	public String obtenerNumeroLibre() {
		return new ArrayList<String>(getLineas())
				.get(new Random().nextInt(getLineas().size()));
	}

}
