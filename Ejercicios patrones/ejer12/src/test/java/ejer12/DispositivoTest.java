package ejer12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class DispositivoTest {
	Dispositivo dispositivo;

	@BeforeEach
	void setUp() throws Exception {
		dispositivo = new Dispositivo();
	}

	@Test
	void testConectarConWifi() {
		Connection wifi = new WifiConn("Wifi logo");
		String resultado = "Wifi logo Ringer en ring";
		assertEquals(resultado, dispositivo.conectarCon(wifi));
	}

	@Test
	void testConectarCon4G() {
		Connection cuatroG = new cuatroGConnectionAdapter();
		String resultado = "4G logo Ringer en ring";
		assertEquals(resultado, dispositivo.conectarCon(cuatroG));
	}
	
	@Test
	void testConfigurarCRC16() {
		CRC calculadora16 = new CRC16_Calculator();
		dispositivo.configurarCRC(calculadora16);
		assertTrue(dispositivo.getCRC() instanceof CRC16_Calculator );
	}
	
	@Test
	void testConfigurarCRC32() {
		CRC calculadora32 = new CRC32_Calculator();
		dispositivo.configurarCRC(calculadora32);
		assertTrue(dispositivo.getCRC() instanceof CRC32_Calculator );
	}

}
