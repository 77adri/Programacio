package ex9_1;

public class Professor extends Persona{
	public Professor() {
		
	}
	
	public Professor(String nom, String dni, int edat, String curs, String assignatura) {
		super(nom, dni, edat, curs, assignatura);
	}
	public void esticaClase() {
		System.out.println("Estic ensenyant l'assignatura de: " + assignatura);
	}

	public String getDni() {
		// TODO Auto-generated method stub
		return null;
	}
}
