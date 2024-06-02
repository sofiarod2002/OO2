package oo2.ejer22Builder;


public class SandwichVegetariano extends ConstructorSandwich {

    public void agregarPan() {
        this.setPan(new IngredienteConcreto("Pan de semillas", 120));
    }


    public void agregarAderezo() {
    	this.setAderezo(new IngredienteNull());
    }

    public void agregarAdicional() {
        this.setAdicional(new IngredienteConcreto("Berenjena al escabeche", 100));
    }

    public void agregarPrincipal() {
       this.setPrincipal(new IngredienteConcreto("provoleta grillada",200));
    }


}