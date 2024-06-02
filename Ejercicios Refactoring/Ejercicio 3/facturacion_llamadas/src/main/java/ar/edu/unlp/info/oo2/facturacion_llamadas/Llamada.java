package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private String origen;
	private String destino;
	private int duracion;

	public Llamada(String origen, String destino, int duracion){
		this.origen= origen;
		this.destino= destino;
		this.duracion = duracion;
	}
	
	public abstract double getPrecio();
	public abstract double getAdicional();

    public double getPrecioMasIVA(){
        return this.duracion * getPrecio() + (this.duracion * this.getPrecio() * this.getIVA()+ this.getAdicional());
    }

    private double getIVA(){
        return 0.21;
    }

	public String getDestino() {
		return destino;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public String getOrigen() {
		return origen;
	}
}
