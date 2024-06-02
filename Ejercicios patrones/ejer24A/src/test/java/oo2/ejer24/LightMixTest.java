package oo2.ejer24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LightMixTest {
	MixingTank tank;
	ProcessStep lightmix;

	@BeforeEach
	void setUp() throws Exception {
		tank = new MixingTankStrub();
		lightmix = new LightMix();
	}

	@Test
	void testExecute() {
		lightmix.execute(tank);
		assertTrue(lightmix.isDone());
	}
}
