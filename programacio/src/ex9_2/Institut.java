package ex9_2;

import java.util.Hashtable;

import ex9_1.Alumne;
import ex9_1.Persona;
import ex9_1.Professor;

public class Institut {

	public static void main(String[] args) {
        Hashtable<String, Persona> persones = new Hashtable<>();

        Alumne alumne1 = new Alumne("Juan", "12345678A", 16, "ESO", null);
        Alumne alumne2 = new Alumne("Maria", "87654321B", 17, "Batxillerat", null);
        Professor professor1 = new Professor("Pedro", "98765432C", 35, "Matemàtiques", null);
        Professor professor2 = new Professor("Laura", "23456789D", 40, "Història", null);

        persones.put(alumne1.getDni(), alumne1);
        persones.put(alumne2.getDni(), alumne2);
        persones.put(professor1.getDni(), professor1);
        persones.put(professor2.getDni(), professor2);

        for (Persona persona : persones.values()) {
            persona.mostrarDades();
            System.out.println();
        }
    }
}