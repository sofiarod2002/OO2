package oo2.ejer22Builder;

public class CadenaComida {
	private ConstructorSandwich constructor = new SandwichClasico();
	
    public Sandwich creaUnSandwich() {
        this.constructor.agregarPan();
        this.constructor.agregarAderezo();
        this.constructor.agregarPrincipal();
        this.constructor.agregarAdicional();
        return constructor.devolverSandwich();
    }
    
    public void setConstructorConcreto(ConstructorSandwich constructor) {
    	this.constructor = constructor;
    }

}