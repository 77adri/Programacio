package ex9_8;

import java.util.LinkedList;

public class Cua {
	LinkedList<String> cua = new LinkedList<String>();
	private int capacitat;
	
    public Cua(int capacitat) {
        this.capacitat = capacitat;
        cua = new LinkedList<>();
    }

    public void afegirPersona(String persona) {
        if (cua.size() == capacitat) {
            System.out.println("La cua està plena, no es pot afegir més persones.");
            return;
        }
        cua.add(persona);
    }

    public String treurePersona() {
        if (cua.isEmpty()) {
            System.out.println("La cua està buida, no es pot treure cap persona.");
            return null;
        }
        return cua.removeFirst();
    }

    public void mostrarCua() {
        if (cua.isEmpty()) {
            System.out.println("La cua està buida.");
            return;
        }
        System.out.println("Estat de la cua:");
        for (String persona : cua) {
        	System.out.println(persona);
        	}
        }

    public static void main(String[] args) {
        Cua cuaEspectacle = new Cua(5);
        cuaEspectacle.afegirPersona(new Persona("Maria", "12345678A"));
        cuaEspectacle.afegirPersona(new Persona("Joan", "87654321B"));
        cuaEspectacle.afegirPersona(new Persona("Laura", "56789012C"));

        cuaEspectacle.mostrarCua();

        cuaEspectacle.treurePersona();
        System.out.println("Persona eliminada de la cua.");

        cuaEspectacle.mostrarCua();
    }

	private void afegirPersona(Persona persona) {
	}
}

