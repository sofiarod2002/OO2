package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteJuridica extends Cliente{
	private String cuit;
	
	public ClienteJuridica(String nombre, String cuit) {
		super(nombre);
		this.cuit = cuit;
	}

	public String getCuit() {
		return cuit;
	}
	
	public double getDescuento() {
		return 0.15;
	}
	

}
