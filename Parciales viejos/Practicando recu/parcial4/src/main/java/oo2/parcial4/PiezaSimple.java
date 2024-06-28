package oo2.parcial4;

public class PiezaSimple extends Pieza{
	private int potencia;
	private int bateria;

	public PiezaSimple(String nombre, int potencia, int bateria) {
		super(nombre);
		this.bateria = bateria;
		this.potencia = potencia;
	}

	@Override
	public double calcularBateria() {
		return this.bateria;
	}

	@Override
	public double calcularPotencia() {
		return this.potencia;
	}

	@Override
	public String darInformacion() {
		return " bateria: " + this.bateria + " potencia: " + this.potencia;
	}

}
