package ejer15;

public class ArchivoExtension extends ArchivoDecorator{
	private String extension="extension";
	
	public ArchivoExtension(FileManager file) {
		super(file);
	}

	public String prettyprint() {
		return getFile().prettyprint() + "-"+this.extension;
	}

}
