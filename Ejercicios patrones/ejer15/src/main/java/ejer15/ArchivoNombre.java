package ejer15;

public class ArchivoNombre  extends ArchivoDecorator{
	private String nombre="nombre";
	
	public ArchivoNombre(FileManager file) {
		super(file);
	}

	public String prettyprint() {
		return this.getFile().prettyprint() + "-"+this.nombre;
	}

}
