package ejer15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileOO2Test {
	FileOO2 file;
	ArchivoDecorator nombre,extension,fechacreacion;
	
	@BeforeEach
	void setUp() throws Exception {
		file = new FileOO2();
		nombre = new ArchivoNombre(file);
		extension = new ArchivoExtension(nombre);
		fechacreacion = new ArchivoFechaCreacion(extension);
	}

	@Test
	void testPrettyPrint() {
		String respuesta = "File OO2: -nombre-extension-fecha de creacion";
		assertEquals (respuesta, fechacreacion.prettyprint());
	}

	

}
