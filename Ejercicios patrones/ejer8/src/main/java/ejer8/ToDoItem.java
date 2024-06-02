package ejer8;

import java.time.Duration;
import java.util.*;

public class ToDoItem implements State{
	private String name;
	private ToDoItem estadoActual;
	private Duration time;
	
	public ToDoItem(String name) {
		this.estadoActual = new Pending(name);
		this.name = name;
	}
	
	 public void start() {
		 this.estadoActual.start();
	 }

	 public void togglePause() {
	 	this.estadoActual.togglePause();
	 }

	 public void finish() {
		 this.estadoActual.finish();
	 }

	 public Duration workedTime() {
		 return this.time;
	 }

	public void addComment(String comment) {
		this.estadoActual.addComment(comment);
	}
	
	public void cambiarEstadoActual(ToDoItem nuevoEstado){
		this.estadoActual = nuevoEstado;
	}
	
	public ToDoItem getEstado() {
		return this.estadoActual;
	}


}
