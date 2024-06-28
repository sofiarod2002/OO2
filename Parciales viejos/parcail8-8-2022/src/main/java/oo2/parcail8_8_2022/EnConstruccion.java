package oo2.parcail8_8_2022;

public class EnConstruccion implements Etapa {

	@Override
	public Etapa aprobarEtapa(Proyecto p) {
		if (p.precioDelProyecto() > 0)
			return new EnEvaluacion();
		else
			throw new RuntimeException ("Precio no valido");
	}

	@Override
	public boolean modificarMargenGanancia(int margen) {
		return (margen>=8 && margen <=10);
	}

	@Override
	public Etapa cancelar() {
		return new Cancelado();
	}

}
