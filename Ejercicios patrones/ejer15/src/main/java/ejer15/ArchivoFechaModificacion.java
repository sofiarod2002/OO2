package ejer15;

public class ArchivoFechaModificacion extends ArchivoDecorator{
	private String fechaModificacion="fecha de modificacion";

	public ArchivoFechaModificacion(FileManager file) {
		super(file);
	}

	public String prettyprint() {
		return getFile().prettyprint() + "-"+this.fechaModificacion;
	}

}
