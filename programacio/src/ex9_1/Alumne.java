package ex9_1;

public class Alumne extends Persona{
	private String curs;
	public Alumne() {
		
	}
	
	public Alumne(String nom, String dni, int edat, String curs, String assignatura) {
		super(nom, dni, edat, curs, assignatura);
		
	}
	public void esticaClase() {
		System.out.println("Estic estudiant: " + curs);
	}

	public String getDni() {
		// TODO Auto-generated method stub
		return null;
	}
}
