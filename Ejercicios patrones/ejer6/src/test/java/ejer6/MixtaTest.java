package ejer6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MixtaTest {
	Mixta mixta, mixta2, mixta3;
	Tierra tierra;
	Agua agua;
	List<Topografia> comp, comp2;

	@BeforeEach
	void setUp() throws Exception {
		tierra = new Tierra();
		agua = new Agua();
		comp = new ArrayList<Topografia>(); comp2 = new ArrayList<Topografia>();
		comp.add(tierra); comp.add(tierra); comp.add(agua); comp.add(agua);
		comp2.add(tierra); comp2.add(agua); comp2.add(agua); comp2.add(agua);
		mixta = new Mixta(comp);
		mixta2= new Mixta(comp);
		mixta3 = new Mixta(comp2);
	}

	@Test
	void testEsIgualAgua() {
		assertEquals(false, mixta.esIgualAgua());
	}
	
	@Test
	void testEsIgualTierra() {
		assertEquals(false, mixta.esIgualTierra());
	}
	
	@Test
	void testEsIgualMixto() {
		assertEquals(true, mixta.esIgualMixta(mixta2.getComp()));
	}
	
	@Test
	void testEsIgualMixtoNo() {
		assertEquals(false, mixta.esIgualMixta(mixta3.getComp()));
	}
	
	@Test
	void testProporcionDeAgua() {
		assertEquals(0.5,mixta.proporcionAgua());
	}


}

