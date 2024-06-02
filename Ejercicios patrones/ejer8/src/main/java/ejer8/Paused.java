package ejer8;

import java.util.ArrayList;
import java.util.List;

public class Paused extends ToDoItem implements State{
	private Inprogess inprogress;
	private Finished finished;
	
	public Paused(String name) {
		super(name);
		inprogress = new Inprogess(name);
		finished = new Finished(name);
	}

	 public void start() {
	 }

	 public void togglePause() {
		 super.cambiarEstadoActual(inprogress);
	 	
	 }

	 public void finish() {
		 super.cambiarEstadoActual(finished);
	 }


}
