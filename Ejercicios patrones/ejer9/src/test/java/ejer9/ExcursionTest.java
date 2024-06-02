package ejer9;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExcursionTest {
	private Excursion ex;
	private LocalDate fecha1,fecha2;
	private Usuario us1,us2,us3;

	@BeforeEach
	void setUp() throws Exception { 
		String nombre = "Dos dias en kayak bajando el Parana";
		fecha1 = LocalDate.of(2024, 1, 22);
		fecha2 = LocalDate.of(2024, 1, 30);
		
		ex = new Excursion (nombre,"Terminal de omnibus",fecha1,fecha2,1,2,4500.80);
		
		us1 = new Usuario("Julian","Mendoza","juli@gmail.com");
		us2 = new Usuario("Viviana","Mendoza","viv@gmail.com");
		us3 = new Usuario("Tomas","Torres","tomi@gmail.com");
	}

	@Test
	void testInscribir() {
		// estoy inscribiendo en el estado y no en la excursion
		Estado actual = new Incompleta (ex);
		actual.inscribir(us1);
		
		actual.inscribir(us2);
		assertEquals(new Minima(ex), actual);
		actual.inscribir(us3);
		assertTrue(actual.getPendientes().contains(us3));
	}

}
