package oo2.parcial4;

public class AhorroDeEnergia implements Configuracion{

	@Override
	public double diferenciaDePotencia(double potencia) {
		return -potencia*0.3;
	}

	@Override
	public double diferenciaDeBateria(double bateria) {
		return -bateria * 0.2;
	}

}
