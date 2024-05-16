package ex8_1;

import java.util.InputMismatchException;

public class ex8_1 {

	private static char[] missatge;
	private static int index;
	private static int divisor;
	private static int dividend;

	public static void main(String[] args) {
		try {
			ferOperacions();
		} catch (Exception e) {
			System.out.println("Error a la vista: " + e.getMessage());
		}
	}

	private static void ferOperacions() throws Exception {
		try {
			int num = llegirEnter("Intrudueix un numero enter: ");
			
			int[] array = {1, 2, 3};
			int valor = obtenirValor(array, 5);
			int resultat = ferDivisio(10, 0);
			
			System.out.println("Resultat de la operacio: " + resultat);
		} catch(InputMismatchException e) {
			throw new Exception("Error d'entrada: Has d'introduir un número enter.");
        } catch (IndexOutOfBoundsException e) {
            throw new Exception("Error d'índex: L'índex està fora dels límits de l'array.");
        } catch (ArithmeticException e) {
            throw new Exception("Error d'aritmètica: Divisió per zero.");
        }
		
	}

	private static int llegirEnter(String string) {
		System.out.print(missatge);
        return 10 / 0;
	}

	private static int obtenirValor(int[] array, int i) {
		 return array[index];
	}

	private static int ferDivisio(int i, int j) {
		return dividend / divisor;
	}

}
