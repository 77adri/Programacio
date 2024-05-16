package ex6_5;

public class Alumne extends Persona{
	
	public Alumne() {
		
	}
	
	public Alumne(String nom, String dni, int edat, String curs, String assignatura) {
		super(nom, dni, edat, curs, assignatura);
		
	}
	public void esticaClase() {
		System.out.println("Estic estudiant: " + curs);
	}
}
