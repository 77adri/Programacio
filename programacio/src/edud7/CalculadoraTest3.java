package edud7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest3 {

	@Test
	void testSuma() {
		double valorEsperat = 30;
		Calculadora calcu = new Calculadora(20, 10);
		double resultat = calcu.suma();
		assertEquals(valorEsperat, resultat, 0);
	}
	
	@Test
	void testResta() {
		double valorEsperat = 10;
		Calculadora calcu = new Calculadora(20, 10);
		double resultat = calcu.resta();
		assertEquals(valorEsperat,resultat,0);
	}

	@Test
	void testMultiplica() {
		double valorEsperat = 10;
		Calculadora calcu = new Calculadora(2, 5);
		double resultat = calcu.multiplica();
		assertEquals(valorEsperat, resultat, 0);
	}
	
	@Test
	void testDivideix() {
		Calculadora calcu = new Calculadora(20, 0);
		Exception exception = assertThrows(ArithmeticException.class, () 
				-> calcu.divideix0());
		assertEquals("Divisió per 0", exception.getMessage());
		}
}
