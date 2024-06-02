package ar.edu.unlp.info.oo2.facturacion_llamadas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {
	Empresa sistema;

	@BeforeEach
	public void setUp() {
		this.sistema = new Empresa();
		this.sistema.agregarNumeroTelefono("2214444554");
		this.sistema.agregarNumeroTelefono("2214444555");
		this.sistema.agregarNumeroTelefono("2214444556");
		this.sistema.agregarNumeroTelefono("2214444557");
		this.sistema.agregarNumeroTelefono("2214444558");
		this.sistema.agregarNumeroTelefono("2214444559");
	}

	@Test
	void testcalcularMontoTotalLlamadas() {
		Cliente emisorPersonaFisca = sistema.registrarUsuario(new ClienteFisica("11555666", "Brendan Eich"));
		Cliente remitentePersonaFisica = sistema.registrarUsuario(new ClienteFisica("00000001", "Doug Lea"));
		Cliente emisorPersonaJuridica = sistema.registrarUsuario(new ClienteJuridica("17555222", "Nvidia Corp"));
		Cliente remitentePersonaJuridica = sistema.registrarUsuario(new ClienteJuridica("25765432", "Sun Microsystems"));

		this.sistema.registrarLlamada(emisorPersonaJuridica, new LlamadaNacional (emisorPersonaJuridica.getNumeroTelefono(), remitentePersonaFisica.getNumeroTelefono(), 10));
		this.sistema.registrarLlamada(emisorPersonaJuridica, new LlamadaInternacional (emisorPersonaJuridica.getNumeroTelefono(), remitentePersonaFisica.getNumeroTelefono(), 8));
		this.sistema.registrarLlamada(emisorPersonaJuridica, new LlamadaNacional(emisorPersonaJuridica.getNumeroTelefono(), remitentePersonaJuridica.getNumeroTelefono(), 5));
		this.sistema.registrarLlamada(emisorPersonaJuridica, new LlamadaInternacional (emisorPersonaJuridica.getNumeroTelefono(), remitentePersonaJuridica.getNumeroTelefono(), 7));
		this.sistema.registrarLlamada(emisorPersonaFisca, new LlamadaNacional (emisorPersonaFisca.getNumeroTelefono(), remitentePersonaFisica.getNumeroTelefono(), 15));
		this.sistema.registrarLlamada(emisorPersonaFisca, new LlamadaInternacional (emisorPersonaFisca.getNumeroTelefono(), remitentePersonaFisica.getNumeroTelefono(), 45));
		this.sistema.registrarLlamada(emisorPersonaFisca, new LlamadaNacional (emisorPersonaFisca.getNumeroTelefono(), remitentePersonaJuridica.getNumeroTelefono(), 13));
		this.sistema.registrarLlamada(emisorPersonaFisca, new LlamadaInternacional (emisorPersonaFisca.getNumeroTelefono(), remitentePersonaJuridica.getNumeroTelefono(), 17));

		assertEquals(11454.64, this.sistema.calcularMontoTotalLlamadas(emisorPersonaFisca), 0.01);
		assertEquals(2445.40, this.sistema.calcularMontoTotalLlamadas(emisorPersonaJuridica), 0.01);
		assertEquals(0, this.sistema.calcularMontoTotalLlamadas(remitentePersonaFisica));
		assertEquals(0, this.sistema.calcularMontoTotalLlamadas(remitentePersonaJuridica));
	}

	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 0);
		this.sistema.agregarNumeroTelefono("2214444558"); 
		Cliente nuevaPersona = new ClienteFisica("Alan Turing", "2444555");
		sistema.registrarUsuario(nuevaPersona);

		assertEquals(1, this.sistema.cantidadDeUsuarios());
		assertTrue(this.sistema.existeUsuario(nuevaPersona));
	}

	@Test
	void obtenerNumeroLibre() {
		// por defecto es el ultimo
		assertEquals("2214444559", this.sistema.obtenerNumeroLibre());
		
		this.sistema.cambiarTipoGenerador(new GestorNumeroDisponiblePrimero());

		assertEquals("2214444554", this.sistema.obtenerNumeroLibre());

		this.sistema.cambiarTipoGenerador(new GestorNumeroDisponibleRandom());
		assertNotNull(this.sistema.obtenerNumeroLibre());
	}
}
