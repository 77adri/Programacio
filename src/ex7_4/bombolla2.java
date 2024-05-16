package ex7_4;

import java.util.Arrays;

public class bombolla2 {

	public static void main(String[] args) {
		int numeros[] = {6,5,3,1,8,7,2,4};	        
		for (int i = 0; i < numeros.length; ++i) {
            System.out.print(numeros[i] + " ");
        }
        ordenarnum(numeros);
        System.out.println("\n");
        for (int i = 0; i < numeros.length; ++i) {
            System.out.print(numeros[i] + " ");
        }
    }
    static void ordenarnum(int[] num) {
        int n = num.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (num[j] > num[j+1]) {
                    int numero = num[j];
                    num[j] = num[j+1];
                    num[j+1] = numero;
                }
            }
        }
    }
}