package UNLP.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

	Empleado em;
	
	@BeforeEach
	void setUp() throws Exception {
		em = new EmpleadoPasante(true);
	
	}

	@Test
	void testDescuento() {
		assertEquals(2700, em.descuento());
	}
	
	@Test
	void testSueldo() {
		assertEquals(19300, em.sueldo());
	}


}
