package UNLP.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoFamiliaTest {

	EmpleadoFamilia em,em2;
	
	@BeforeEach
	void setUp() throws Exception {
		em = new EmpleadoPlanta(4,true,0);
		em2 = new EmpleadoTemporario (0,false,0);
		
	}
	

	@Test
	void testAdicionalConHijos() {
		assertEquals (13000, em.adicional());
	}
	
	@Test
	void testAdicionalSinHijos() {
		assertEquals (0, em2.adicional());
	}
	
	@Test
	void testAdicionalCasado() {
		assertEquals (13000, em.adicional());
	}
	
	@Test
	void testAdicionalNoCasado() {
		assertEquals (0, em2.adicional());
	}

}
