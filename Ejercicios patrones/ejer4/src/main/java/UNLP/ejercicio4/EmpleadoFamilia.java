package UNLP.ejercicio4;

public abstract class EmpleadoFamilia extends Empleado{
	private int hijos;
	private boolean casado;
	
	public EmpleadoFamilia(int hijos, boolean casado) {
		this.hijos = hijos;
		this.casado = casado;
	}

	public double adicional() { 
		return this.adicionalHijos() + this.adicionalCasados();
	}
	
	private double adicionalHijos() {
		return hijos!=0?2000*hijos:0; 
	}

	private double adicionalCasados() {
		return casado?5000:0;
	}
	
}
