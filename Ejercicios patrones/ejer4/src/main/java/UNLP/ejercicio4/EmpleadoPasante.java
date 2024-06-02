package UNLP.ejercicio4;

public class EmpleadoPasante extends Empleado {
	private boolean examen;
	

	public EmpleadoPasante(boolean examen) {
		this.examen = examen;
	}

	public double basico() {
		return 20000;
	}

	public double adicional() {
		return examen?2000:0;
	}
}
