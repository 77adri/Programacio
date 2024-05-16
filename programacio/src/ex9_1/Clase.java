package ex9_1;

public class Clase {
public static void main(String[] args) {
		
		Persona[] persones = new Persona[6];
		
		persones[0] = new Alumne ("Lionel", "43289687D", 20, "FPGS", " ");
		persones[1] = new Alumne ("Pepe", "43289457D", 13, "ESO", " ");
		persones[2] = new Alumne ("Xavi", "43258687D", 25, "FPGS", " ");
		persones[3] = new Alumne ("Carlos", "43289457D", 17, "Batxillerat", " ");
		persones[4] = new Professor ("Joan", "43489687D", 58, " ", "Historia");
		persones[5] = new Professor ("Jose", "43486687D", 32, " ", "Literatura Castellana");
		
		
		for (Persona p : persones) {
			System.out.println("NOM-->" + p.nom);
			System.out.println("DNI-->" + p.dni);
			System.out.println("EDAT-->" + p.edat);
			if (p instanceof Alumne) {
				System.out.println("Soc alumne");
			}
			else {
				System.out.println("Soc un professor");
			}
			p.esticaClase();
		}
	}
}
