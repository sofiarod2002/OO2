package oo2.parial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConfiguracionEstiloTest {
	ConfiguracionEstilo configuracion;
	Contenedor contenedor;
	Boton boton;
	Etiqueta etiqueta;
	List<ComponenteFramework> lista;

	@BeforeEach
	void setUp() throws Exception {
		boton = new Boton("Azul","10px","buscar");
		etiqueta = new Etiqueta("Amarillo","20px");
		lista = new ArrayList<ComponenteFramework>();
		lista.add(boton); lista.add(etiqueta);
		contenedor = new Contenedor(lista);
		configuracion = new ConfiguracionEstilo("Rojo","18px",contenedor);
	}

	@Test
	void test() {
		System.out.print(configuracion.imprimir());
	}

}
