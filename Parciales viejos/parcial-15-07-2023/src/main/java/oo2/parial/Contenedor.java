package oo2.parial;

import java.util.List;
import java.util.stream.Collectors;

public class Contenedor implements ComponenteFramework{
	private List<ComponenteFramework> elementos;

	public Contenedor(List<ComponenteFramework> elementos) {
		this.elementos = elementos;
	}

	@Override
	public void aplicarEstilo(ConfiguracionEstilo configuracion) {
		elementos.stream().forEach(elemento -> elemento.aplicarEstilo(configuracion));
	}

	@Override
	public String imprimir() {
	    return "Contenedor: " + elementos.stream()
        .map(elemento -> elemento.imprimir())
        .collect(Collectors.joining(", ")) 
        	+ " Fin contenedor";
	}

}
