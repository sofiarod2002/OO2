package ejer6;

import java.util.List;

public class Agua extends Topografia {


	public double proporcionAgua() {
		return 1;
	}

	public boolean esIgual(Topografia t) {
		return t.esIgualAgua();
	}

	public boolean esIgualAgua() {
		return true;
	}

	public boolean esIgualTierra() {
		return false;
	}

	public boolean esIgualMixta(List<Topografia> comp) {
		return false;
	}
	

}
