package ejer11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private double margenGanacia;
	private int cantIntegrantes; 
	private Etapa etapa;
	private double montoDia;
	private String nombre;
	
	public Proyecto(String nombre,LocalDate fechaInicio, LocalDate fechaFin, String objetivo, double margenGanacia,
			int cantIntegrantes, double montoDia) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.margenGanacia = margenGanacia;
		this.cantIntegrantes = cantIntegrantes;
		this.montoDia = montoDia;
		this.nombre = nombre;
		this.etapa = new EnConstruccion(this);
	}
	
	public void aprobarEtapa() {
		etapa = etapa.aprobarEtapa();
	}
	
	public double costoDelProyecto() {
		return this.diasDelProyecto() * cantIntegrantes * montoDia;
	}
	
	private long diasDelProyecto() {
		return  ChronoUnit.DAYS.between(fechaInicio, fechaFin);
	}
	
	public double precioDelProyecto() {
		return this.costoDelProyecto() * (1 + (margenGanacia / 100));
	}
	
	public void cancelarProyecto() {
		this.objetivo = "Cancelar";
		this.etapa = new Cancelada(this);
	}
	
	// esto seria mejor que lo hagan las etapas, porque hay dos que no hacen nada
	public void modificarMargenDeGanancia(double nuevoMargen) {
		if (etapa.modificarMargenDeGanancia(nuevoMargen)) {
			this.margenGanacia = nuevoMargen;
		}
	}
	
	//SOLO LO USO PARA EL TEST
	public Etapa getEstado() {
		return this.etapa;
	}
	
}
