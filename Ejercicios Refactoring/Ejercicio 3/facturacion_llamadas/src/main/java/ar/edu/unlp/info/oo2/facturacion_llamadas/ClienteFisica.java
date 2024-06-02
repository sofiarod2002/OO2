package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteFisica extends Cliente{
	private String dni;

	public ClienteFisica(String nombre, String dni) {
		super(nombre);
		this.dni = dni;
	}
	
	public String getDNI() {
		return dni;
	}

	public double getDescuento() {
		return 0;
	}



}
