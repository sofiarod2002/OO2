package oo2.parial;

public class Etiqueta extends ElementoSimple {
	
	public Etiqueta(String texto, String estiloActual) {
		super(texto, estiloActual);
	}

	@Override
	public void aplicarEstilo(ConfiguracionEstilo configuracion) {
		this.setEstiloActual(configuracion.getEstiloEtiqueta());
		
	}

	@Override
	public String imprimir() {
		return "Etiqueta: " + this.toString();
	}

}
