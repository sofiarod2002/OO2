package ejer11;

public class Confirmada extends Etapa{
	private Proyecto proyecto;
	
	
	public Confirmada(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Etapa aprobarEtapa() {
		return this;
	}

	public boolean modificarMargenDeGanancia(double nuevoMargen) {
		return false;
	}

}
