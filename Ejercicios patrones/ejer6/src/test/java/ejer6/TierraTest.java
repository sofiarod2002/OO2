package ejer6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TierraTest {
	Tierra tierra;

	@BeforeEach
	void setUp() throws Exception {
		tierra = new Tierra();
	}

	@Test
	void testEsIgualAgua() {
		assertEquals(false, tierra.esIgualAgua());
	}
	
	@Test
	void testEsIgualTierra() {
		assertEquals(true, tierra.esIgualTierra());
	}
	
	@Test
	void testEsIgualMixto() {
		assertEquals(false, tierra.esIgualMixta(null));
	}

}

