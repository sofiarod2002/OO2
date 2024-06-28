package oo2.parcail8_8_2022;

public class Cancelado implements Etapa{

	@Override
	public Etapa aprobarEtapa(Proyecto p) {
		return this;
	}

	@Override
	public boolean modificarMargenGanancia(int margen) {
		return false;
	}

	@Override
	public Etapa cancelar() {
		return this;
	}

}
