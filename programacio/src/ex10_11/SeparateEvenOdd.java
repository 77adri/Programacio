package ex10_11;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class SeparateEvenOdd {
	 public static void main(String[] args) {
	        // Nombre de números aleatoris que volem generar
	        int size = 1000;

	        // Array per emmagatzemar els números aleatoris
	        int[] numbers = new int[size];

	        // Generador de números aleatoris
	        Random random = new Random();

	        // Omplim l'array amb números aleatoris entre 1 i 1000
	        for (int i = 0; i < size; i++) {
	            numbers[i] = random.nextInt(1000) + 1;
	        }

	        // Fitxers de sortida per als números parells i imparells
	        String evenFile = "parells.txt";
	        String oddFile = "imparells.txt";

	        try (
	            // Obrim els fitxers per escriure
	            PrintWriter evenWriter = new PrintWriter(new FileWriter(evenFile));
	            PrintWriter oddWriter = new PrintWriter(new FileWriter(oddFile))
	        ) {
	            // Recorrem l'array i separem els números parells i imparells
	            for (int number : numbers) {
	                if (number % 2 == 0) { // Si és parell
	                    evenWriter.println(number);
	                } else { // Si és imparell
	                    oddWriter.println(number);
	                }
	            }

	            System.out.println("Els números s'han separat en fitxers de parells i imparells.");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
