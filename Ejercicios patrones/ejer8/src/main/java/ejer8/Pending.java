package ejer8;

import java.time.Duration;
import java.util.*;

public class Pending extends ToDoItem implements State{
	
	public Pending(String name) {
		super(name);
	}

	private Inprogess inprogress;
	private List<String> comentarios = new ArrayList();
	
	 public void start() {
		super.cambiarEstadoActual(inprogress);
	 }

	 public void togglePause() {
		 throw new RuntimeException("Tiene que estar en estado Inprogess o paused para este cambio de estado");
	 }

	 public void finish() {
	 }

}
