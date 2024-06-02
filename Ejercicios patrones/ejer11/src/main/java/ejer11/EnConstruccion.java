package ejer11;

public class EnConstruccion extends Etapa{
	private Proyecto proyecto;
	
	public EnConstruccion (Proyecto proyecto) {
		this.proyecto = proyecto;
	}


	public Etapa aprobarEtapa() {
		if (proyecto.precioDelProyecto() != 0)
			return new EnEvaluacion(proyecto);
		else
			throw new RuntimeException("El precio es 0");

	}


	public boolean modificarMargenDeGanancia(double nuevoMargen) {
		return (nuevoMargen>= 8 && nuevoMargen <=10)?true:false;
	}

}
