package ejer11;

public class Cancelada extends Etapa{
	private Proyecto proyecto;
	
	public Cancelada(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Etapa aprobarEtapa() {
		return this;
	}

	public boolean modificarMargenDeGanancia(double nuevoMargen) {
		return false;
	}
}
