package oo2.ejer22Builder;


public class SandwichClasico extends ConstructorSandwich {



    public void agregarPan() {
        this.setPan(new IngredienteConcreto("Pan brioche", 100));
    }


    public void agregarAderezo() {
       this.setAderezo(new IngredienteConcreto("Mayonesa", 20));
    }

    public void agregarAdicional() {
        this.setAdicional(new IngredienteConcreto("Tomate", 80));
    }

    public void agregarPrincipal() {
       this.setPrincipal(new IngredienteConcreto("Carne ternera",300));
    }




}