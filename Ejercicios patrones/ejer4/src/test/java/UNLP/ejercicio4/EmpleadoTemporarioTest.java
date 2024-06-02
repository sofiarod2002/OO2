package UNLP.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTemporarioTest {
	
	EmpleadoTemporario temporario, temporario2;

	@BeforeEach
	void setUp() throws Exception {
		temporario = new EmpleadoTemporario (2,true,10);
		temporario2 = new EmpleadoTemporario (0,true,0);
	}

	@Test
	void testbasicoConHoras() {
		assertEquals(23000, temporario.basico());
	}
	
	@Test
	void testbasicoSinHoras() {
		assertEquals(20000, temporario2.basico());
	}

}
