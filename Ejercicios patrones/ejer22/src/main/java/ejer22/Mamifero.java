package ejer22;

import java.time.LocalDate;

public abstract class Mamifero {

	abstract public String getIdentificador();
	abstract public void setIdentificador(String unId); 
	abstract public String getEspecie(); 
	abstract public void setEspecie(String unaEspecie);
	abstract public LocalDate getFechaDeNacimiento();
	abstract public void setFechaDeNacimiento(LocalDate unaFecha);
	abstract public Mamifero getPadre(); 
	abstract public void setPadre(Mamifero unPadre); 
	abstract public Mamifero getMadre(); 
	abstract public void setMadre(Mamifero unaMadre); 
	abstract public Mamifero getAbueloMaterno(); 
	abstract public Mamifero getAbuelaMaterna(); 
	abstract public Mamifero getAbuelaPaterna(); 
	abstract public Mamifero getAbueloPaterno(); 
	abstract public boolean tieneComoAncestroA(Mamifero unMamifero);
	abstract protected boolean lineaMadre(Mamifero unMamifero); 
	abstract protected boolean lineaPadre(Mamifero unMamifero); 
	
}
	


