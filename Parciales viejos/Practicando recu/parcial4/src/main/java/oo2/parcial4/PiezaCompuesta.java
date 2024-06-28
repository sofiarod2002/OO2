package oo2.parcial4;

import java.util.List;
import java.util.stream.Collectors;

public class PiezaCompuesta extends Pieza {
	private Configuracion configuracion;
	private List<Pieza> piezas;
	
	public PiezaCompuesta(String nombre, Configuracion configuracion, List<Pieza>piezas) {
		super(nombre);
		this.configuracion = configuracion;
		this.piezas = piezas;
	}

	public void cambiarConfiguracion(Configuracion configuracion) {
		this.configuracion = configuracion;
	}

	@Override
	public double calcularBateria() {
		return this.calcularBateriaPiezas() + this.configuracion.diferenciaDeBateria(this.calcularBateriaPiezas());
	}
	
	private double calcularBateriaPiezas() {
		return piezas.stream()
				.mapToDouble(p -> p.calcularBateria())
				.average().orElse(0);
	}

	@Override
	public double calcularPotencia() {
		return this.calcularPotenciaPiezas() + this.configuracion.diferenciaDePotencia(this.calcularPotenciaPiezas());
	}
	
	private double calcularPotenciaPiezas() {
		return piezas.stream()
				.mapToDouble(p -> p.calcularPotencia())
				.average().orElse(0);
	}

	@Override
	public String darInformacion() {
		return piezas.stream()
				.map(p -> p.informacionCompleta())
				.collect(Collectors.joining(",")) + " bateria : " + this.calcularBateria() + " potencia: " + this.calcularPotencia();
	}
	
}
