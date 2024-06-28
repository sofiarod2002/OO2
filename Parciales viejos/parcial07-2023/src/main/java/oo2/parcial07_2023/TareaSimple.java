package oo2.parcial07_2023;



public class TareaSimple extends Tarea {
    private int duracionEstimada;

	public TareaSimple(String descripcion, int duracionEstimada) {
		super(descripcion);
		this.duracionEstimada = duracionEstimada;
	}

	@Override
	public double estimacionTotal() {
		return this.duracionEstimada;
	}

	@Override
	public double tiempoUtilizado() {
		return getEstado().tiempoUtilizado();
	}
	

	@Override
	public void iniciar() {
		this.setEstado(getEstado().iniciar());
	}

	@Override
	public void completar() {
		this.setEstado(getEstado().completar());
	}




}