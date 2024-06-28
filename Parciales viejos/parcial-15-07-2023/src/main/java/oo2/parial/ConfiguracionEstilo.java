package oo2.parial;

public class ConfiguracionEstilo {
	private String estiloBoton;
	private String estiloEtiqueta;
	private ComponenteFramework componente;
	
	
	public ConfiguracionEstilo(String estiloBoton, String estiloEtiqueta, ComponenteFramework componente) {
		this.estiloBoton = estiloBoton;
		this.estiloEtiqueta = estiloEtiqueta;
		this.componente = componente;
	}

	public String getEstiloBoton() {
		return estiloBoton;
	}

	public String getEstiloEtiqueta() {
		return estiloEtiqueta;
	}

	public void aplicarEstilo() {
		this.componente.aplicarEstilo(this);
	}
	
	public String imprimir() {
		return this.componente.imprimir();
	}
	
}

