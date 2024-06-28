package oo2.parcial07_2023;



public class Inicio extends Estado {

	public Inicio() {
		super(System.currentTimeMillis());
	}
	
    public Estado iniciar() {
        return this;
    }

    public Estado completar() {
        return new Completo(this.getHorario());
    }

	@Override
	public double tiempoUtilizado() {
		return 0;
	}

}