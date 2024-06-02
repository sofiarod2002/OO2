package ejer15;

public class ArchivoTamaño extends ArchivoDecorator{
	private String tamaño="tamaño";
	
	public ArchivoTamaño(FileManager file) {
		super(file);
	}

	public String prettyprint() {
		return getFile().prettyprint() + "-"+this.tamaño;
	}

}