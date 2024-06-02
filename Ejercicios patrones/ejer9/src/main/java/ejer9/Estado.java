package ejer9;

import java.util.*;
import java.util.stream.Collectors;

public abstract class Estado {
	private Excursion ex;
	// esto es mejor que lo maneje la excursion
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private List<Usuario> pendientes = new ArrayList<Usuario>();
	
	public Estado (Excursion ex) {
		this.ex = ex;
	}
	
	public abstract void inscribir (Usuario us);
	
	public String obtenerInformacion() {
		return ex.obtenerInformacion();
	}
	
	public List<Usuario> getPendientes () {
		return this.pendientes;
	}
	
	public List<Usuario> getUsuarios () {
		return this.usuarios;
	}
	
	public Excursion getExcursion() {
		return this.ex;
	}
	
}
