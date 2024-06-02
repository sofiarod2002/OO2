package UNLP.ejercicio4;

public abstract class Empleado {
	
	public double sueldo() {
		return this.basico() + this.adicional() - this.descuento(); 
	}
	
	public double descuento() {
		return 0.13 * this.basico() + 0.05 * this.adicional();
	}
	
	public abstract double basico();
	public abstract double adicional();

}
