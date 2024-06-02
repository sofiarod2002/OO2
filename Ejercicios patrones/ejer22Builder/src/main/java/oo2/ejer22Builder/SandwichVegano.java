package oo2.ejer22Builder;


public class SandwichVegano extends ConstructorSandwich {

    public void agregarPan() {
        this.setPan(new IngredienteConcreto("Pan integral", 100));
    }


    public void agregarAderezo() {
       this.setAderezo(new IngredienteConcreto("Salsa criolla", 20));
    }

    public void agregarAdicional() {
    	this.setAdicional(new IngredienteNull());
    }

    public void agregarPrincipal() {
       this.setPrincipal(new IngredienteConcreto("Milanesa de girgolas", 500));
    }


}