package edud7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Calculadora {
	private int num1;
	private int num2;
	public Calculadora(int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	
	public int suma() {
		int resul = num1 + num2;
		return resul;
	}
	public int resta() {
		int resul = num1 - num2;
		return resul;
	}
	public int multiplica() {
		int resul = num1 * num2;
		return resul;
	}
	public int divideix() {
		int resul = num1 / num2;
		return resul;
	}


	public Object divideix0() {
		int num1 = 0;
		int num2 = 0;
		if(num2 == 0) {
			throw new java.lang.ArithmeticException("Divisio per 0");
		}else{
			int resul = num1 / num2;
			return resul;
		}
	}
	public void testDivideix() {
		Calculadora calcu = new Calculadora(20, 0);
		Exception exception = assertThrows(ArithmeticException.class, () 
				-> calcu.divideix0());

		assertEquals("Divisió per 0", exception.getMessage());
		}
	
}