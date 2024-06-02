package ejer22;

import java.time.LocalDate;

public class MamiferoConcreto extends Mamifero {

	private String id;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	

	public MamiferoConcreto(String id) {
		super();
		this.id = id;
		this.padre = new MamiferoNull();
		this.madre = new MamiferoNull();
	}
	public String getIdentificador() {
		return id;
	}
	public void setIdentificador(String unId) {
		id = unId;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String unaEspecie) {
		especie = unaEspecie;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate unaFecha) {
		fechaNacimiento = unaFecha;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero unPadre) {
		padre = unPadre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero unaMadre) {
		madre = unaMadre;
	}
	
	public Mamifero getAbueloMaterno() {
		return madre.getPadre();
	}
	public Mamifero getAbuelaMaterna() {
		return madre.getMadre();
 	}
	public Mamifero getAbuelaPaterna() {
		return padre.getMadre();
	}
	public Mamifero getAbueloPaterno() {
		return padre.getPadre();
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return this.lineaMadre(unMamifero) || this.lineaPadre(unMamifero);
		}
	
	protected boolean lineaMadre(Mamifero unMamifero) {
		if (madre == unMamifero) {
				return true;
		}
		return madre.tieneComoAncestroA(unMamifero);
		
	}
	
	protected boolean lineaPadre(Mamifero unMamifero) {
		if (padre == unMamifero) {
				return true;
		}
		return padre.tieneComoAncestroA(unMamifero);
		
	}
	
}