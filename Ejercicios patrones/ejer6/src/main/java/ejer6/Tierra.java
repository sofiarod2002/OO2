package ejer6;

import java.util.List;

public class Tierra extends Topografia {


	public double proporcionAgua() {
		return 0;
	}


	public boolean esIgual(Topografia t) {
		return t.esIgualTierra();
	}

	public boolean esIgualAgua() {
		return false;
	}

	public boolean esIgualTierra() {
		return true;
	}

	public boolean esIgualMixta(List<Topografia> comp) {
		return false;
	}

}
