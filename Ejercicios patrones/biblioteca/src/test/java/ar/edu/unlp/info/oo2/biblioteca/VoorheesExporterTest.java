package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class VoorheesExporterTest {

	Socio s;
	VoorheesExporter ve;
	List<Socio> socios;
	
	@BeforeEach
	void setUp() throws Exception {
		s = new Socio ("Juan Garcia","juan@gmail.com", "18457/2");
		socios = new ArrayList<Socio>();
		ve = new VoorheesExporter();
	}

	@Test
	void testExportarUnSocio() {
		socios.add(s);
		String separator = System.lineSeparator();
		String prueba =  "[" + separator
				+ "\t{" + separator
				+ "\t\t\"nombre\": \"" + "Juan Garcia" + "\"," + separator
				+ "\t\t\"email\": \"" + "juan@gmail.com" + "\"," + separator
				+ "\t\t\"legajo\": \"" + "legajo" + "\"" + separator
				+ "\t}" + separator
				+ "]";
		assertEquals(prueba, ve.exportar(socios)); 
	}
	
	@Test 
	void testExportarSinSocio() {
		assertEquals("[]", ve.exportar(socios)); 
	}

}
