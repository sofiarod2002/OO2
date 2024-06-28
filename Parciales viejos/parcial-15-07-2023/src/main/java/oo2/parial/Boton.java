package oo2.parial;

public class Boton extends ElementoSimple {
	private String accion; 
	
	public Boton(String texto, String estiloActual, String accion) {
		super(texto, estiloActual);
		this.accion = accion;
	}

	@Override
	public void aplicarEstilo(ConfiguracionEstilo configuracion) {
		this.setEstiloActual(configuracion.getEstiloBoton());
		
	}

	@Override
	public String imprimir() {
		return "Boton: " + this.toString() + accion;
	}

}
