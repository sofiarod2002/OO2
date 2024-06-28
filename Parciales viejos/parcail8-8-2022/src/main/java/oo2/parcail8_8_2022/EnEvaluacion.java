package oo2.parcail8_8_2022;

public class EnEvaluacion implements Etapa{

	@Override
	public Etapa aprobarEtapa(Proyecto p) {
		return new Confirmado();
	}

	@Override
	public boolean modificarMargenGanancia(int margen) {
		return (margen>=11 && margen <=15);
		
	}

	@Override
	public Etapa cancelar() {
		return  new Cancelado();
	}

}
