package ejer6;

import java.util.List;
import java.util.stream.IntStream;

public class Mixta extends Topografia{
	private List<Topografia> componentes;

	Mixta (List<Topografia> componentes){
		this.componentes = componentes;
	}
	public double proporcionAgua() {
		return componentes.stream()
				 .mapToDouble(componente->componente.proporcionAgua())
				 .sum() / 4; 
	}

	public boolean esIgual(Topografia t) {
		return t.esIgualMixta(componentes);
	}

	public boolean esIgualAgua() {
		return false;
	}

	public boolean esIgualTierra() {
		return false;
	}


	public boolean esIgualMixta(List<Topografia> comp) {
		return IntStream.range(0, componentes.size())
			    .allMatch(i -> componentes.get(i).equals(comp.get(i)));
	}
	
	public List<Topografia> getComp(){
		return this.componentes;
	}

}
