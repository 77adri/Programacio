package ex9_8;

import java.util.LinkedList;
import java.util.Scanner;

public class Cua {
	static LinkedList<String> cua = new LinkedList<String>();
	private static int capacitat;
	
    public Cua(int capacitat) {
        this.capacitat = capacitat;
        cua = new LinkedList<>();
    }

    public static void afegirPersona(String persona) {
        if (cua.size() == capacitat) {
            System.out.println("La cua està plena, no es pot afegir més persones.");
            return;
        }
        cua.add(persona);
    }

    public static String treurePersona() {
        if (cua.isEmpty()) {
            System.out.println("La cua està buida, no es pot treure cap persona.");
            return null;
        }
        return cua.removeFirst();
    }

    public static void mostrarCua() {
        if (cua.isEmpty()) {
            System.out.println("La cua està buida");
            return;
        }
        System.out.println("Estat de la cua:");
        for (String persona : cua) {
        	System.out.println(persona);
        	}
        }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int opcio;
        do {
            System.out.println("1--> Afegir persona");
            System.out.println("2--> Treure persona");
            System.out.println("3--> Mostrar cua");
            System.out.println("4--> EXIT");
            opcio = scanner.nextInt();

            switch (opcio) {
                case 1:
                    afegirPersona(crearPersona());
                    break;
                case 2:
                    String personaTreta = treurePersona();
                    if (personaTreta != null) {
                        System.out.println("Persona treurada: " + personaTreta);
                    } else {
                        System.out.println("La cua està buida. No es pot treure cap persona.");
                    }
                    break;
                case 3:
                    mostrarCua();
                    break;
                case 4:
                    System.out.println("ADEU!");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }
        } while (opcio != 0);
        scanner.close();
    }
    
	private static String crearPersona() {
		
		return null;
	}

	private void afegirPersona(Persona persona) {
        
	}
}

