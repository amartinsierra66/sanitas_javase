package testing;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.CiudadesService;

class TestCiudades {
	CiudadesService service;

	@BeforeEach
	void setUp() throws Exception {
		service=new CiudadesService();
	}

	@Test
	void testCiudadMasPoblada() {
		assertEquals("ciudad 2", service.ciudadMasPoblada().getNombre());
	}

	@Test
	void testCiudadPorNombre() {
		assertEquals(30.1, service.ciudadPorNombre("ciudad 4").getTemperatura());
		assertNull(service.ciudadPorNombre("nueva"));
	}

	@Test
	void testMediaTemperatura() {
		assertEquals(20.84, service.mediaTemperatura(),0.01);
	}

}
