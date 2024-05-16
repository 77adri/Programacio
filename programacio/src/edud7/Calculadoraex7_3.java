package edud7;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class Calculadoraex7_3 {
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
		double valorEsperat = 3;
		Calculadora calcu = new Calculadora(30, 10);
		double resultat = calcu.divideix();
		assertEquals(valorEsperat, resultat, 0);
	}
	void testResta2() {
		Calculadora calcu = new Calculadora(20, 10);
		Calculadora calcu2 = new Calculadora(30, 50);
		assertTrue(calcu.resta2());
		assertFalse(calcu2.resta());
	}
	public int resta() {
		int resul;
		int num1 = 0;
		int num2 = 0;
		if (resta2()) resul = num1 - num2;
		else resul = num2 - num1;
		return resul;
		}
	public boolean resta2() {
		int num1 = 0;
		int num2 = 0;
		if (num1 >= num2) return true;
		else return false;
		}
	public Integer divideix2() {
		int num2 = 0;
		if (num2 == 0) return null;
		int num1 = 0;
		int resul = num1 / num2;
		return resul;
		}
}
 