package oo2.parcial4;

public class MaximaPotencia implements Configuracion{

	@Override
	public double diferenciaDePotencia(double potencia) {
		return potencia * 0.2;
	}

	@Override
	public double diferenciaDeBateria(double bateria) {
		return bateria * 0.5;
	}

}
