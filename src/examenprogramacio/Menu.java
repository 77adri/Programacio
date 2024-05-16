package examenprogramacio;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<InstrumentoMusical> instrumento = new ArrayList<>();
		 while (true) {
	            System.out.println("1--> Crear Guitarra");
	            System.out.println("2--> Crear Piano");
	            System.out.println("3--> Mostrar instrumentos");
	            System.out.println("4--> Tocar un instrumento");
	            System.out.println("5--> Afinar un instrumento");
	            System.out.println("6--> Transportar un instrumento");
	            System.out.println("7--> SALIR");

	            System.out.print("Que vols fer: ");
	            int opcio = scanner.nextInt();
	            switch (opcio) {
	                case 1:
	                	crearGuitarra(scanner);
	                    break;
	                case 2:
	                	crearPiano(scanner);
	                    break;
	                case 3:
	                	mostrarInstrumentoMusical(null);
	                    break;
	                case 4:
	                	tocarInstrumento(scanner);
	                    break;
	                case 5:
	                	afinarInstrumento(scanner);
	                    break;
	                case 6:
	                    transportarInstrumento(scanner);
	                    break;
	                case 7:
	                	System.out.println("Adio!!");
	                    System.exit(0);
	                default:
	                    System.out.println("Posa un nombre del menu, gracies.");
	                    break;
	            }
	        }
	}
	private static void mostrarInstrumentoMusical(ArrayList<instrumento> inventario) {
        for (instrumento instrumentomusical : inventario) {
            System.out.println(instrumentomusical);
        }
    }

	private static Menu[] transportarInstrumento(Scanner scanner) {
		InstrumentoMusical[] instrumentos = null;
		for (InstrumentoMusical a : instrumentos) {
			System.out.println(a.nombre);
			a.TocarGuitarra();
			if (a instanceof Gitarra) {
				System.out.println("Empaquetar la guitarra");
			}else {
				System.out.println("Desempaquetar la guitarra");
			}
		}
		return null;
	}

	private static Menu[] afinarInstrumento(Scanner scanner) {
		InstrumentoMusical[] instrumentos = null;
		for (InstrumentoMusical a : instrumentos) {
			System.out.println(a.nombre);
			a.TocarGuitarra();
			if (a instanceof Gitarra) {
				System.out.println("Afinar la guitarra");
			}else {
				System.out.println("Afinar el piano");
			}
		}
		return null;
	}

	private static Menu[] tocarInstrumento(Scanner scanner) {
		InstrumentoMusical[] instrumentos = null;
		for (InstrumentoMusical a : instrumentos) {
			System.out.println(a.nombre);
			a.TocarGuitarra();
			if (a instanceof Gitarra) {
				System.out.println("Toco la guitarra");
			}else {
				System.out.println("Toco el piano");
			}
		}
		return null;
	}

		

	private static Menu[] crearPiano(Scanner scanner) {
		System.out.println("Que nombre tiene el piano: ");
		String nombre = scanner.next();
		System.out.println("De que material es el piano: ");
		String material = scanner.next();
		System.out.println("En que año se fabrico el piano: ");
		int añoFabricacion = scanner.nextInt();
		System.out.println("El piano es de cola? ");
		boolean esPianodeCola = scanner.nextBoolean();
		return null;
	}

	private static Menu[] crearGuitarra(Scanner scanner) {
		System.out.println("Que nombre tiene la guitarra:");
		String nombre = scanner.next();
		System.out.println("De que material es la guitarra:");
		String material = scanner.next();
		System.out.println("En que año se fabrico la guitarra:");
		int añoFabricacion = scanner.nextInt();
		System.out.println("Cuantas cuerdas tiene la guitarra");
		int numCuerdas = scanner.nextInt();
		return null;
	}

}
