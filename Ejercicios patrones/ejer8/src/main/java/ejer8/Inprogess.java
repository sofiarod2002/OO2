package ejer8;

import java.util.ArrayList;
import java.util.List;

public class Inprogess extends ToDoItem implements State{
	private Pending pending;
	private Finished finished;
	
	public Inprogess(String name) {
		super(name);
		Pending pending = new Pending(name);
		Finished finished= new Finished(name);

	}


	public void start() { 
	}

	public void togglePause() {
		super.cambiarEstadoActual(pending);
	}

		 
	public void finish() {
		super.cambiarEstadoActual(finished);
	}



}


