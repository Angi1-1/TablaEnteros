import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TablaEnterosTest {
	private TablaEnteros tabla;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Comienzo pruebas");
		System.out.println("*****************");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Finalizando pruebas");
		System.out.println("*******************");
	}

	@BeforeEach
	void setUp() throws Exception {
		Integer[]elemetos = {1,2,3,4,5};
		tabla = new TablaEnteros(elemetos);
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testTablaEnterosExcepcion() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new TablaEnteros(new Integer[0]);
		});
	}
	
	@Test
	void testTablaEnterosExcepcion2() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new TablaEnteros(null);
		});
	}

	@Test
	void testSumaTabla() {
		int suma = tabla.sumaTabla();
		Assertions.assertEquals(15, suma);
	}

	@Test
	void testMayorTabla() {
		int max = tabla.mayorTabla();
		Assertions.assertEquals(5, max);
	}
	

	@Test
	void testPosicionTabla() {
		int posicion = tabla.posicionTabla(3);
		Assertions.assertEquals(2, posicion);
	}

	void testExcepcionPosicion() {
		Assertions.assertThrows(java.util.NoSuchElementException.class, ()-> {tabla.posicionTabla(10);});	
	}
}
