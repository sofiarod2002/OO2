package oo2.ejer22Builder;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
	private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	
	public Sandwich(Ingrediente pan, Ingrediente aderezo, Ingrediente principal, Ingrediente adicional) {
		ingredientes.add(pan);
		ingredientes.add(aderezo);
		ingredientes.add(principal);
		ingredientes.add(adicional);
	}

	public double devolverPrecio() {
		return ingredientes.stream()
				 .mapToDouble(ingrediente -> ingrediente.getPrecio())
				 .sum();
	}

}