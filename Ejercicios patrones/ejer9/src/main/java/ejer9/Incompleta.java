package ejer9;

public class Incompleta extends Estado{
	
	public Incompleta(Excursion ex) {
		super(ex);
	}
	
	public void inscribir (Usuario us) {
		this.getUsuarios().add(us);
		this.cambiar(this.getUsuarios().size());
	}

	public String obtenerInformacion() {
		return this.obtenerInformacion() 
				+ this.getExcursion().obetenerInformacionMinima(this.getUsuarios().size());
	}
	
	private void cambiar(int tamanio) {
		if (this.getExcursion().llegoMinimo(tamanio))
			this.getExcursion().cambiarEstado( new Minima(this.getExcursion()));
	}
	

}
