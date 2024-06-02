package ejer9;

import java.time.LocalDate;

public class Excursion {
	private String nombre,encuentro;
	private LocalDate fechaInicio, fechaFin;
	private int cupoMinimo, cupoMaximo;
	private double costo;
	private Estado estadoActual;
	
	public Excursion(String nombre, String encuentro, LocalDate fechaInicio, LocalDate fechaFin, int cupoMinimo,
			int cupoMaximo, double costo) {
		this.nombre = nombre;
		this.encuentro = encuentro;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.costo = costo;
	}
	
	public void inscribir (Usuario us) {
		estadoActual.inscribir(us);
	}

	public String obtenerInformacion() {
		return "Excurcion nombre: " + nombre + ", punto de encuentro: " + encuentro + ", fecha de inicio: " + fechaInicio
				+ ", fecha de fin: " + fechaFin + ", costo: " + costo;
	}
	
	public void cambiarEstado (Estado x) {
		this.estadoActual = x;
	}
	
	// esto es mejor que lo tenga cada estado, para que si agrego algo nuevo no cambiar todo
	public String obetenerInformacionMinima(int cant) {
		return "Cantidad de usuarios que faltan para el minimo: " +(this.cupoMinimo - cant);
	}
	
	public String obetenerInformacionMaxima(int cant) {
		return "Cantidad de usuarios que faltan para el maximo: " +(this.cupoMaximo - cant);
	}
	
	public boolean llegoMinimo(int cant) {
		return (cant == cupoMinimo)?true:false;
	}
	
	public boolean llegoMaximo(int cant) {
		return (cant == cupoMaximo)?true:false;
	}

}
