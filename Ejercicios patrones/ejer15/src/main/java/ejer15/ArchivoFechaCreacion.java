package ejer15;

public class ArchivoFechaCreacion extends ArchivoDecorator{
	private String fechaCreacion="fecha de creacion";
	
	public ArchivoFechaCreacion(FileManager file) {
		super(file);
	}

	public String prettyprint() {
		return getFile().prettyprint() + "-"+this.fechaCreacion;
	}

}
