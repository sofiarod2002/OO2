package oo2.ejer24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PurgeTest {
	MixingTank tank;
	ProcessStep purge;

	@BeforeEach
	void setUp() throws Exception {
		tank = new MixingTankStrub();
		purge = new Purge();
	}

	@Test
	void testExecute() {
		purge.execute(tank);
		assertTrue(purge.isDone());
	}

}
