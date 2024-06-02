package UNLP.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoPlantaTest {

	EmpleadoPlanta planta, planta2;
	
	@BeforeEach
	void setUp() throws Exception {
		planta = new EmpleadoPlanta(2,true,5);
		planta2 = new EmpleadoPlanta(2,true,0);
	}

	@Test
	void testAdicionalAdicionalConAños() {
		assertEquals (19000,planta.adicional());
	}
	
	@Test
	void testAdicionalAdicionalSinAños() {
		assertEquals (9000,planta2.adicional());
	}

}
