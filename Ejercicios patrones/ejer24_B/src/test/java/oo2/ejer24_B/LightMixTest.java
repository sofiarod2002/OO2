package oo2.ejer24_B;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class LightMixTest {
	MixingTankMock tank;
	ProcessStep lightmix;

	@BeforeEach
	void setUp() throws Exception {
		tank = new MixingTankMock();
		lightmix = new LightMix();
	}

	@Test
	void testExecute() {
		lightmix.execute(tank);
		assertTrue(lightmix.isDone());
	}
}
