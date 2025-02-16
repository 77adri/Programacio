package ex9_11;

import java.util.HashMap;
import java.util.Scanner;

public class ex9_11 {

	public static void main(String[] args) {
		HashMap<String, Integer> contactes = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("1--> Mostrar tots el contactes");
			System.out.println("2--> Afeguir un nou contacte");
			System.out.println("3--> Cercar un contacte per el nom");
			System.out.println("4--> EXIT");
			opcion = scanner.nextInt();
			
			switch (opcion) {
				case 1:
					mostrarContactes(contactes);
					break;
				case 2:
					afeguirContacte(contactes, scanner);
					break;
				case 3:
					cercarContacte(contactes, scanner);
				case 4:
					System.out.println("EXIT.");
					break;
			}
		}while (opcion !=4);
	}

	private static void cercarContacte(HashMap<String, Integer> contactes, Scanner scanner) {
		System.out.println("Escriu el nom del contacte:");
		String nom = scanner.next();
		Integer telefon = contactes.get(nom);
		if (telefon != null) {
			System.out.println("el nom es: " + nom + ", i el nombre de telefon: " + telefon);
		}else {
			System.out.println("No hi ha cap nombre de telefon amb aquest nom.");
		}
	}

	private static void afeguirContacte(HashMap<String, Integer> contactes, Scanner scanner) {
		System.out.println("Posa el nom del contacte:");
		String nom = scanner.next();
		System.out.println("Posa el telefon del contacte");
		int telefon = scanner.nextInt();
		contactes.put(nom, telefon);
		System.out.println("S'ha afeguit el contacte correctament");
	}

	private static void mostrarContactes(HashMap<String, Integer> contactes) {
		 if (contactes.isEmpty()) {
	            System.out.println("No hi ha cap contacte creat.");
	        } else {
	            System.out.println("Llista de contactes:");
	            for (String nom : contactes.keySet()) {
	                int telefon = contactes.get(nom);
	                System.out.println("Nombre: " + nom + ", Telefon: " + telefon);
	            }
	        }
	}
}
