package ejer9;

public class Maxima extends Estado{

	public Maxima(Excursion ex) {
		super(ex);
	}
	
	public void inscribir (Usuario us) {
		this.getPendientes().add(us);
	}

}
