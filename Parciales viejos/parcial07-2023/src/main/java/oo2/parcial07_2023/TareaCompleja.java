package oo2.parcial07_2023;

import java.util.*;

public class TareaCompleja extends Tarea {
	private List<Tarea> tareas;
	

	public TareaCompleja(String descripcion, List<Tarea> tareas) {
		super(descripcion);
		this.tareas = tareas;
	}

	@Override
	public double estimacionTotal() {
		return tareas.stream()
				 .mapToDouble(tarea->tarea.estimacionTotal())
				 .sum();
	}

	@Override
	public double tiempoUtilizado() {
		return tareas.stream()
				 .mapToDouble(tarea->tarea.tiempoUtilizado())
				 .sum();
	}

	@Override
	public void iniciar() {
		tareas.stream().forEach(Tarea::iniciar);
	}

	@Override
	public void completar() {
		tareas.stream().forEach(Tarea::completar);
	} 



}