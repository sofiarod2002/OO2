package ejer22;

import java.time.LocalDate;

public class MamiferoNull  extends Mamifero{

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdentificador(String unId) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getEspecie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEspecie(String unaEspecie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LocalDate getFechaDeNacimiento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFechaDeNacimiento(LocalDate unaFecha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mamifero getPadre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPadre(Mamifero unPadre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mamifero getMadre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMadre(Mamifero unaMadre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mamifero getAbueloMaterno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mamifero getAbuelaMaterna() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mamifero getAbuelaPaterna() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mamifero getAbueloPaterno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean lineaMadre(Mamifero unMamifero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean lineaPadre(Mamifero unMamifero) {
		// TODO Auto-generated method stub
		return false;
	}

}
