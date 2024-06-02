package ejer11;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProyectoTest {

	private Proyecto Ferreteria;

	@BeforeEach
	void setUp() throws Exception {
		
		Ferreteria = new Proyecto("Ferreteria",LocalDate.of(2024, 1, 10), LocalDate.of(2024, 1, 30), "Mas ventas", 8, 10, 2500);
	}
	
	@Test
	void testAprobarEtapa() {
		assertTrue(Ferreteria.getEstado() instanceof EnConstruccion);
		
		Ferreteria.aprobarEtapa();
		assertTrue(Ferreteria.getEstado() instanceof EnEvaluacion);
		
		Ferreteria.aprobarEtapa();
		assertTrue(Ferreteria.getEstado() instanceof Confirmada);
		
		}

}
