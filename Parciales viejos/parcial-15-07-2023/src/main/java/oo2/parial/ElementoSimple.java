package oo2.parial;

public abstract class ElementoSimple implements ComponenteFramework{
	private String texto;
	private String estiloActual;
	
	public ElementoSimple(String texto, String estiloActual) {
		this.texto = texto;
		this.estiloActual = estiloActual;
	}
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getEstiloActual() {
		return estiloActual;
	}
	public void setEstiloActual(String estiloActual) {
		this.estiloActual = estiloActual;
	}
	
	@Override
	public String toString() {
		return "Elemento Simple texto " + texto + ", estilo actual " + estiloActual;
	}
	
}
