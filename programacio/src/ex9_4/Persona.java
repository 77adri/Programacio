package ex9_4;

public class Persona {
	String nom;
	String dni;
	int edat;
		
	public Persona(String nom, String dni, int edat) {
		this.nom = nom;
		this.dni = dni;
		this.edat = edat;
	}
	public String getNom() {
		return nom;
	}
	public String getDni() {
        return dni;
    }

    public int getEdat() {
        return edat;
    }
    public String toString() {
    	return "\nNom: " + nom + " DNI: " + dni + " Edat: " + edat; 
    }
}
