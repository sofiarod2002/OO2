package ejer9;

import java.util.stream.Collectors;

public class Minima extends Estado {
	
	public Minima(Excursion ex) {
		super(ex);
	}

	public String obtenerInformacion() {
		return this.obtenerInformacion()
				+ this.getExcursion().obetenerInformacionMaxima(this.getUsuarios().size()+1)
				+ todosMails();
	}
	
	private String todosMails(){
		return this.getUsuarios().stream() 
		          .map(us -> us.getEmail())       
		          .collect(Collectors.joining(", "));
	}


	public void inscribir(Usuario us) {
		this.getUsuarios().add(us);
		this.cambiar(this.getUsuarios().size());
	}


	private void cambiar(int tamanio) {
		if (this.getExcursion().llegoMaximo(tamanio))
			this.getExcursion().cambiarEstado( new Maxima(this.getExcursion()));
	}
	
		
}
	



