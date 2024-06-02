package oo2.ejer22Builder;


public abstract class ConstructorSandwich {
	private Ingrediente pan;
	private Ingrediente aderezo;
	private Ingrediente principal;
	private Ingrediente adicional;

    abstract public void agregarPan();
    abstract public void agregarAderezo();
    abstract public void agregarAdicional();
    abstract public void agregarPrincipal();
	

	public void setPan(Ingrediente pan) {
		this.pan = pan;
	}

	public void setAderezo(Ingrediente aderezo) {
		this.aderezo = aderezo;
	}

	public void setPrincipal(Ingrediente principal) {
		this.principal = principal;
	}

	public void setAdicional(Ingrediente adicional) {
		this.adicional = adicional;
	}
	
	public Sandwich devolverSandwich() {
		return new Sandwich(pan,aderezo,principal,adicional);
	}
    
    

}