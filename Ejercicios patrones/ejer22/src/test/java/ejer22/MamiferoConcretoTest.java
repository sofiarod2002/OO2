package ejer22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MamiferoConcretoTest {
	private Mamifero nala;
	private Mamifero melquiades;
	private Mamifero mufasa;
	private Mamifero alexa;
	private Mamifero elsa;
	private Mamifero scar;
	private Mamifero sarabi;
	private Mamifero anonimo;
	
	
	@BeforeEach
	void setUp() {
		nala = new MamiferoConcreto("Nala");
		melquiades = new MamiferoConcreto("Melquiades");
		mufasa = new MamiferoConcreto("Mufasa");
		alexa = new MamiferoConcreto("Alexa");
		elsa = new MamiferoConcreto("Elsa");
		scar = new MamiferoConcreto("Scar");
		sarabi = new MamiferoConcreto("Sarabi");
		anonimo = new MamiferoConcreto("Anonimo");
		
		alexa.setPadre(mufasa);
		alexa.setMadre(sarabi);
		mufasa.setPadre(melquiades);
		mufasa.setMadre(nala);
		sarabi.setPadre(scar);
		sarabi.setMadre(elsa);
		
	}
	
	@Test
	void testAbuelaMaterna() {
		assertEquals(elsa, alexa.getAbuelaMaterna());	
		assertEquals(null, sarabi.getAbuelaMaterna());
		assertNull(elsa.getAbuelaMaterna());
	}
	
	@Test
	void testAbuelaPaterna() {
		assertEquals(nala, alexa.getAbuelaPaterna());	
		assertNull(mufasa.getAbuelaPaterna());
		assertNull(nala.getAbuelaPaterna());

	}
	
	@Test
	void testAbueloMaterno() {
		assertEquals(scar, alexa.getAbueloMaterno());	
		assertNull(sarabi.getAbueloMaterno());
		assertNull(scar.getAbueloMaterno());

	}
	
	@Test
	void testAbueloPaterno() {
		assertEquals(melquiades, alexa.getAbueloPaterno());	
		assertNull(mufasa.getAbueloPaterno());
		assertNull(melquiades.getAbueloPaterno());

	}
	
	@Test
	void testEspecie() {
		anonimo.setEspecie("Panthera leo");
		assertEquals("Panthera leo", anonimo.getEspecie());
	}
	
	@Test
	void testIdentificador() {
		anonimo.setIdentificador("Nala");
		assertEquals("Nala", anonimo.getIdentificador());
	}
	
	@Test
	void testMadre() {
		anonimo.setMadre(alexa);
		assertEquals(alexa, anonimo.getMadre());
		assertNull(nala.getMadre());
	}
	
	@Test
	void testPadre() {
		anonimo.setPadre(mufasa);
		assertEquals(mufasa, anonimo.getPadre());
		assertNull(nala.getPadre());
	}
	
	@Test
	void testTieneComoAncestroA() {
		assertFalse(nala.tieneComoAncestroA(anonimo));
		assertFalse(mufasa.tieneComoAncestroA(anonimo));
		assertFalse(alexa.tieneComoAncestroA(anonimo));
		assertFalse(alexa.tieneComoAncestroA(alexa));
		assertTrue(alexa.tieneComoAncestroA(mufasa));
		assertTrue(alexa.tieneComoAncestroA(sarabi));
		assertTrue(alexa.tieneComoAncestroA(nala));
		assertTrue(alexa.tieneComoAncestroA(melquiades));
		assertTrue(alexa.tieneComoAncestroA(elsa));
		assertTrue(alexa.tieneComoAncestroA(scar));
		
	}
	
}
