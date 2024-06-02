package oo2.ejer22Builder;


public class SandwichSinTacc extends ConstructorSandwich {

    public void agregarPan() {
        this.setPan(new IngredienteConcreto("Pan de chipa", 150));
    }


    public void agregarAderezo() {
       this.setAderezo(new IngredienteConcreto("Salsa tartara", 18));
    }

    public void agregarAdicional() {
        this.setAdicional(new IngredienteConcreto("Verduras grilladas", 200));
    }

    public void agregarPrincipal() {
       this.setPrincipal(new IngredienteConcreto("Carne de pollo",250));
    }


}