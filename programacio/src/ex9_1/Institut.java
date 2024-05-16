package ex9_1;

public class Institut {

	public static void main(String[] args) {
        Persona[] persones = new Persona[4];

        Alumne alumne1 = new Alumne("Juan", "12345678A", 16, "ESO", null);
        Alumne alumne2 = new Alumne("Maria", "87654321B", 17, "Batxillerat", null);
        Professor professor1 = new Professor("Pedro", "98765432C", 35, "Matemàtiques", null);
        Professor professor2 = new Professor("Laura", "23456789D", 40, "Història", null);

        persones[0] = alumne1;
        persones[1] = alumne2;
        persones[2] = professor1;
        persones[3] = professor2;

        for (Persona persona : persones) {
            persona.mostrarDades();
            System.out.println();
        }
    }
}
