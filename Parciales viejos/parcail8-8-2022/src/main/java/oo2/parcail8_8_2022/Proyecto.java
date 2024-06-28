package oo2.parcail8_8_2022;

import java.time.LocalDate;

public class Proyecto {
	private LocalDate fechaInicio, fechaFin;
	private String objetivo;
	private int nroIntegrantes;
	private double sueldoDia,margenGanacia;
	private Etapa etapa;
	
	public Proyecto(LocalDate fechaInicio, LocalDate fechaFin, String objetivo, int nroIntegrantes, double sueldoDia,
			double margenGanacia) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.nroIntegrantes = nroIntegrantes;
		this.sueldoDia = sueldoDia;
		this.margenGanacia = 7;
		etapa = new EnConstruccion();
	}
	
	public void aprobarEtapa() {
		etapa = etapa.aprobarEtapa(this); 
	}
	
	public void modificarMargenDeGanancia(int margen) {
		if (etapa.modificarMargenGanancia(margen))
			this.margenGanacia = margen;
	}
	
	public void setMargen(int margen) {
		this.margenGanacia = margen;
	}
	
	public void cancelarProyecto() {
		this.objetivo = "Cancelado";
		this.etapa = etapa.cancelar();
	}
	
	public double costoDelProyecto() {
		return nroIntegrantes * sueldoDia;
	}
	
	public double precioDelProyecto() {
		return this.costoDelProyecto() * (1- margenGanacia/100);
	}
	
}
