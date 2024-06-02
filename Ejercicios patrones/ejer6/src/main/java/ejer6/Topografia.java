package ejer6;

import java.util.List;

public abstract class Topografia {
	public abstract double proporcionAgua();
	public abstract boolean esIgual(Topografia t);
	public abstract boolean esIgualAgua();
	public abstract boolean esIgualTierra();
	public abstract boolean esIgualMixta(List<Topografia> comp);
}
