package UNLP.ejercicio4;

public class EmpleadoTemporario extends EmpleadoFamilia{
	private int horas;
	
	public EmpleadoTemporario(int hijos, boolean casado, int horas) {
		super(hijos, casado);
		this.horas = horas; 
	}

	public double basico() {
		return 20000+(horas*300);
	}
}
