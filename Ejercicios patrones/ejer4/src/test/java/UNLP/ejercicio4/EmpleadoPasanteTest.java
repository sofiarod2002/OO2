package UNLP.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoPasanteTest {

	EmpleadoPasante pasante,pasante2;
	
	@BeforeEach
	void setUp() throws Exception {
		pasante = new EmpleadoPasante(true); 
		pasante2 = new EmpleadoPasante(false); 
	}

	@Test
	void testAdicionalConExamen() {
		assertEquals(2000,pasante.adicional());
	}
	
	@Test
	void testAdicionalSinExamen() {
		assertEquals(0,pasante2.adicional());
	}

}
