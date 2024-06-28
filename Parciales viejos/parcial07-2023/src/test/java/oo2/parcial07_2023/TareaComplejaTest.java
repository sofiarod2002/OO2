package oo2.parcial07_2023;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TareaComplejaTest {
	TareaSimple tareaSimple,tareaSimple2;
	TareaCompleja tareaCompleja;
	List<Tarea> lista;

	@BeforeEach
	void setUp() throws Exception {
		tareaSimple = new TareaSimple("Comprar pan", 10);
		tareaSimple2 = new TareaSimple("Tostar pan", 10);
		lista.add(tareaSimple); lista.add(tareaSimple2);
		tareaCompleja = new TareaCompleja ("Hacer desayuno", lista);
		tareaCompleja.iniciar();
		tareaCompleja.completar();
	}

	@Test
	void testTiempoUtilizado() {
		assertNotEquals(0,tareaCompleja.tiempoUtilizado());
	}
	
	@Test
	void testEstimacionTotal() {
		assertNotEquals(0,tareaCompleja.estimacionTotal());
	}
	
	@Test
	void testAvance() {
		assertNotEquals(0,tareaCompleja.avance());
	}
	

}
