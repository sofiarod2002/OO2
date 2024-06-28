package oo2.parcial4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PiezaCompuestaTest {
	Pieza piezasimple,piezasimple3, piezacompuesta;
	List<Pieza> piezas;
	Configuracion configuracion;

	@BeforeEach
	void setUp() throws Exception {
		piezasimple = new PiezaSimple("Core i7",105,90);
		piezasimple3 = new PiezaSimple(" ⁠Tarjeta grafica nVIDIA",30,50);
		piezas = new ArrayList<Pieza>();
		piezas.add(piezasimple); piezas.add(piezasimple3);
		configuracion = new AhorroDeEnergia();
		piezacompuesta = new PiezaCompuesta("cpu notebook", configuracion, piezas);
	}
	@Test
	void test() {
		String prueba = "cpu notebookCore i7 bateria: 90 potencia: 105, ⁠Tarjeta grafica nVIDIA bateria: 50 potencia: 30 bateria : 56.0 potencia: 47.25";
		assertEquals(prueba, piezacompuesta.informacionCompleta());
	}
	
	/*/
	 * Si es una pieza compuesta en configuración de ahorro de energía:
		CPU notebook - Ahorro de energía:
		* Core i7, batería al 90%, potencia de 105w.
		* ⁠Tarjeta grádica nVIDIA, batería al 50%, potencia de 30w.
		Batería al 56%, potencia de 47,25w
	 */

}
