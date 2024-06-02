package ejer11;

public class EnEvaluacion extends Etapa{
	private Proyecto proyecto;
	
	public EnEvaluacion (Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Etapa aprobarEtapa() {
		return new Confirmada(proyecto);
	}

	public boolean modificarMargenDeGanancia(double nuevoMargen) {
		return (nuevoMargen>= 11 && nuevoMargen <=15)?true:false;
	}

}
