package ejer15;

public class ArchivoPermisos  extends ArchivoDecorator{
	private String permisos="permisos";

	
	public ArchivoPermisos(FileManager file) {
		super(file);
	}

	public String prettyprint() {
		return getFile().prettyprint() + "-"+this.permisos;
	}

}
