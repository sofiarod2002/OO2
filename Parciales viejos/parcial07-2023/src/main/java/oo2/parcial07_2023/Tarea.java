package oo2.parcial07_2023;

public abstract class Tarea {
    private String descripcion;
    private Estado estado = new PreInicio();


    public Tarea(String descripcion) {
		this.descripcion = descripcion;
	}
    
	public abstract double estimacionTotal();
    public abstract double tiempoUtilizado();
    public abstract void iniciar();
    public abstract void completar();
    
	public double avance() {
		return this.tiempoUtilizado() / this.estimacionTotal();
	}

    
    public Estado getEstado() {
    	return this.estado;
    }
    
    public void setEstado(Estado estadoNuevo) {
    	this.estado = estadoNuevo;
    }

}