package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.ListaNumber;

class TestListaNumber {
	ListaNumber lista;
	@BeforeEach
	void setUp() throws Exception {
		lista=new ListaNumber();
	}

	@Test
	void testAddInteger() {
		assertTrue(lista.add(20));
		assertTrue(lista.add(10));
		assertFalse(lista.add(20));
		assertEquals(2, lista.size());
	}

	@Test
	void testInvertir() {
		assertTrue(lista.add(20));
		assertTrue(lista.add(10));
		lista.invertir();
		assertEquals(10, lista.get(0));
	}

	@Test
	void testToString() {
		assertTrue(lista.add(20));
		assertTrue(lista.add(10));
		assertEquals("20,10", lista.toString());
	}

}
