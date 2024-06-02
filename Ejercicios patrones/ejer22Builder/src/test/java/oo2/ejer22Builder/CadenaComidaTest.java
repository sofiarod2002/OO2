package oo2.ejer22Builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadenaComidaTest {
	CadenaComida cadena; 
	

	@BeforeEach
	void setUp() throws Exception {
		cadena = new CadenaComida();
	}

	@Test
	void testDevolverPrecioSandwichClasico() {
		Sandwich sandwich = cadena.creaUnSandwich();
		assertEquals(500, sandwich.devolverPrecio());
	}

	@Test
	void testDevolverPrecioSandwichVegetariano() {
		cadena.setConstructorConcreto(new SandwichVegetariano());
		Sandwich sandwich = cadena.creaUnSandwich();
		assertEquals(420, sandwich.devolverPrecio());
	}
	
	@Test
	void testDevolverPrecioSandwichVegano() {
		cadena.setConstructorConcreto(new SandwichVegano());
		Sandwich sandwich = cadena.creaUnSandwich();
		assertEquals(620, sandwich.devolverPrecio());
	}
	
	@Test
	void testDevolverPrecioSandwichSinTacc() {
		cadena.setConstructorConcreto(new SandwichSinTacc());
		Sandwich sandwich = cadena.creaUnSandwich();
		assertEquals(618, sandwich.devolverPrecio());
	}

}
