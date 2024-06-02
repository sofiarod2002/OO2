package ejer13;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecodificadorTest {
	Pelicula pelicula1, pelicula2,pelicula3,pelicula4,pelicula5,pelicula6,pelicula7,pelicula8;
	LocalDate f2000,f2024,f2008,f2022;
	List<Pelicula> grilla = new ArrayList<Pelicula>();
	List<Pelicula> reproducidas = new ArrayList<Pelicula>();
	Decodificador decodificador;
	
	@BeforeEach
	void setUp() throws Exception {
		f2000 = LocalDate.of(2000, 5, 3); f2024 = LocalDate.of(2024, 5, 3); f2008 = LocalDate.of(2008, 5, 3); f2022 = LocalDate.of(2022, 5, 3);
		pelicula1 = new Pelicula ("Thor",f2008,7.9);
		pelicula2 = new Pelicula ("Capitan America",f2022,7.8);
		pelicula3 = new Pelicula ("Iron Man",f2008,7.9);
		pelicula4 = new Pelicula ("Dunkirk",f2022,7.9);
		pelicula5 = new Pelicula ("Rocky",f2000,8.1);
		pelicula6 = new Pelicula ("Rabmo",f2000,8.1);
		pelicula7 = new Pelicula ("Superman",f2024,6.8);
		pelicula8 = new Pelicula ("Spiderman",f2024,9.1);
		
		grilla.add(pelicula1); grilla.add(pelicula2); grilla.add(pelicula3); grilla.add(pelicula4); grilla.add(pelicula5); grilla.add(pelicula6); grilla.add(pelicula7); grilla.add(pelicula8);
		reproducidas.add(pelicula1);
		decodificador = new Decodificador (new SugerenciaPorSimilitud(), grilla, reproducidas);
	}

	@Test
	void testSugerirPeliculasPorSimilitudSinReproducciones() {
		pelicula1.agregarPeliculasSimilares(pelicula2);
		pelicula1.agregarPeliculasSimilares(pelicula3);
		pelicula1.agregarPeliculasSimilares(pelicula4);
		List<Pelicula> sugerencias = decodificador.sugerirPeliculas();
		assertEquals(true, sugerencias.contains(pelicula2));
		assertEquals(true, sugerencias.contains(pelicula3));
		assertEquals(true, sugerencias.contains(pelicula4));
	}
	
	@Test
	void testSugerirPeliculasPorSimilitudConReproducciones() {
		pelicula1.agregarPeliculasSimilares(pelicula2);
		pelicula1.agregarPeliculasSimilares(pelicula3);
		pelicula1.agregarPeliculasSimilares(pelicula4);
		pelicula1.agregarPeliculasSimilares(pelicula5);
		reproducidas.add(pelicula3);
		reproducidas.add(pelicula1);
		List<Pelicula> sugerencias = decodificador.sugerirPeliculas();
		assertEquals(true, sugerencias.contains(pelicula2));
		assertEquals(false, sugerencias.contains(pelicula3));
		assertEquals(true, sugerencias.contains(pelicula4));
		assertEquals(true, sugerencias.contains(pelicula5));
	}
	
	@Test
	void testSugerirPeliculasPorPuntaje() {
		decodificador.cambiarConfiguracion(new SugerenciaPorPuntaje());
		List<Pelicula> sugerencias = decodificador.sugerirPeliculas();
		assertEquals(true, sugerencias.contains(pelicula8));
		assertEquals(true, sugerencias.contains(pelicula6));
		assertEquals(true, sugerencias.contains(pelicula5));
	}
	
	@Test
	void testSugerirPeliculasPorNovedad() {
		decodificador.cambiarConfiguracion(new SugerenciaPorNovedad());
		List<Pelicula> sugerencias = decodificador.sugerirPeliculas();
		assertEquals(true, sugerencias.contains(pelicula8));
		assertEquals(true, sugerencias.contains(pelicula7));
		assertEquals(true, sugerencias.contains(pelicula2));
	}
	

}

