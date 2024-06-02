package ejer7;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DirectorioTest {
	Archivo ar1,ar2,ar3,ar4,ar5;
	Directorio dir1,dir2;
	LocalDate fecha1,fecha2;
	List<FyleSystem> lista, lista2;
	@BeforeEach
	void setUp() throws Exception {
		// fechas
		fecha1 = LocalDate.of(2024, 4, 1);
		fecha2 = LocalDate.of(2024, 3, 1);
		
		//archivos
		ar1 = new Archivo("Ejercicio 2",fecha1,10);
		ar2 = new Archivo("Ejercicio 2",fecha2,15);
		ar3 = new Archivo("Imagen",fecha2,30);
		ar4 = new Archivo("Ejercicio 2",fecha2,15);
		ar5 = new Archivo("Ejercicio 2",fecha2,1);
		
		// crear directorio 2
		lista2 = new ArrayList<FyleSystem>();
		lista2.add(ar4); lista2.add(ar3); lista2.add(ar5);
		dir2 = new Directorio ("Corregir", fecha2, lista2);
		
		// crear directorio 1
		lista = new ArrayList<FyleSystem>();
		lista.add(ar1); lista.add(ar2);lista.add(dir2); lista.add(ar3);
		dir1 = new Directorio("Objetos 2 - Ejercicios",fecha2,lista);
	}
	
	@Test
	void testTamanioTotalOcupado() {
		assertEquals(150, dir1.tamanioTotalOcupado());
	}

	@Test
	void testArchivoMasGrandeConArchivos() {
		assertEquals(ar3, dir1.archivoMasGrande());
	}
	
	@Test
	void testArchivoMasNuevo() {
		assertEquals(ar1, dir1.archivoMasNuevo());
	}
	
	
	@Test
	void testBuscar() {
		assertEquals(ar1, dir1.buscar("Ejercicio 2"));
	}
	
	@Test
	void testBuscarSinArchivos() {
		assertEquals(null, dir1.buscar("z"));
	}
	
	@Test
	void testBuscarTodos() {
		List<FyleSystem> lista = dir1.buscarTodos("Ejercicio 2");
		// for(int i=0; i<lista.size()-1;i++)
		//	System.out.println(lista.get(i).getNombre());
		assertTrue(lista.contains(ar1));
		assertTrue(lista.contains(ar2));
		assertTrue(lista.contains(ar4));
		assertTrue(lista.contains(ar5));
		assertFalse(lista.contains(ar3));
		assertFalse(lista.contains(dir1));
		assertEquals (4,lista.size());

	}
	
	@Test
	void testListadoDeContenido() {
		String palabra = dir2.listadoDeContenido(); 
		//System.out.println(palabra);
		 
	}

}
