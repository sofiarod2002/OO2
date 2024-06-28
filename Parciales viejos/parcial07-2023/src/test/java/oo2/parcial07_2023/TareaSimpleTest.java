package oo2.parcial07_2023;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TareaSimpleTest {
	TareaSimple tarea;
	
	@BeforeEach
	void setUp() throws Exception {
		tarea = new TareaSimple("Desayunar", 10);
		tarea.iniciar();
		tarea.completar();
	}

	@Test
	void testTiempoUtilizado() {
		assertNotEquals(0,tarea.tiempoUtilizado());
	}
	
	@Test
	void testAvance() {
		assertNotEquals(0,tarea.avance());
	}
	

}
