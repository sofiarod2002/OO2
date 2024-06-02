package ejer6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AguaTest{
	Agua agua;

	@BeforeEach
	void setUp() throws Exception {
		agua = new Agua();
	}

	@Test
	void testEsIgualAgua() {
		assertEquals(true, agua.esIgualAgua());
	}
	
	@Test
	void testEsIgualTierra() {
		assertEquals(false, agua.esIgualTierra());
	}
	
	@Test
	void testEsIgualMixto() {
		assertEquals(false, agua.esIgualMixta(null));
	}

}
