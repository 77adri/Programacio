package ex7_3;

import java.util.Arrays;

public class bombolla {

	public static void main(String[] args) {
			int numeros[] = {6,5,3,1,8,7,2,4};	        
	        imprimirArray(numeros);
	        intercanviDirecte(numeros);
	        imprimirArray(numeros);
	    }
	    static void intercanviDirecte(int numeros[]) {
	        int n = numeros.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (numeros[j] > numeros[j + 1]) {
	                    int temp = numeros[j];
	                    numeros[j] = numeros[j + 1];
	                    numeros[j + 1] = temp;
	                }
	            }
	        }
	    }
	    static void imprimirArray(int numeros[]) {
	        for (int num : numeros) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}