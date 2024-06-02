package UNLP.ejercicio4;

public class EmpleadoPlanta extends EmpleadoFamilia {
	private int antiguedad;
	
	public EmpleadoPlanta(int hijos, boolean casado, int antiguedad) {
		super(hijos,casado);
		this.antiguedad = antiguedad;
	}

	public  double basico() {
		return 50000;
	}
	
	public  double adicional() {
		return super.adicional() + adicionalAntiguedad();
	}
	
	private double adicionalAntiguedad(){
		return antiguedad * 2000;
	}
}
