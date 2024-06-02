package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JSONAdapterTest {
	Socio s;
	JSONAdapter jsonAdap;
	List<Socio> socios;
	JSONParser parseo;
	
	@BeforeEach
	void setUp() throws Exception {
		s = new Socio ("Juan Garcia","juan@gmail.com", "18457/2");
		socios = new ArrayList<Socio>();
		jsonAdap = new JSONAdapter();
		parseo = new JSONParser();
	}

	@Test
	void testExportarUnSocio() throws ParseException {
		socios.add(s);
		String separator = System.lineSeparator();
		String prueba =  "[" + separator
				+ "\t{" + separator
				+ "\t\t\"nombre\": \"" + "Juan Garcia" + "\"," + separator
				+ "\t\t\"email\": \"" + "juan@gmail.com" + "\"," + separator
				+ "\t\t\"legajo\": \"" + "18457/2" + "\"" + separator
				+ "\t}" + separator
				+ "]";
		assertEquals(parseo.parse(prueba), parseo.parse(jsonAdap.exportar(socios))); 
	}
	
	@Test 
	void testExportarSinSocio() {
		assertEquals("[]", jsonAdap.exportar(socios)); 
	}

}
