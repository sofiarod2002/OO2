package ejer8;

import java.util.ArrayList;
import java.util.List;

public class Finished extends ToDoItem implements State {

	public Finished(String name) {
		super(name);
	}

	 public void start() {
	 }

	 public void togglePause() {
	 }

	 public void finish() {
		 throw new RuntimeException("Tiene que estar en estado Inprogess o paused para este cambio de estado");
	 }


}
