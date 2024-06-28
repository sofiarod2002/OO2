package oo2.parcial07_2023;

public class Completo extends Estado {
	private long inicio;

    public Completo(Long inicio) {
		super(System.currentTimeMillis());
		this.inicio = inicio;
    }

	public Estado iniciar() {
        return this;
    }

    public Estado completar() {
        return this;
    }

	@Override
	public double tiempoUtilizado() {
		return this.getHorario() - inicio;
	}

}