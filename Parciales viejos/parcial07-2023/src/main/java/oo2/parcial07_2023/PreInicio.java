package oo2.parcial07_2023;


public class PreInicio extends Estado {

	public PreInicio() {
		super(0);
	}

	@Override
	public Estado iniciar() {
		return new Inicio();
	}

	@Override
	public Estado completar() {
		return this;
	}

	@Override
	public double tiempoUtilizado() {
		return 0;
	}


}