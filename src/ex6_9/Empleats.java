package ex6_9;

public class Empleats {
	String nom;
	String cognom;
	int edat;
	int salari;
	
	public Empleats (String nom, String cognom, int edat, int salari) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
        this.salari = salari;
    }
	public String toString() {
        return "nom: " + nom + "	cognom: " + cognom + "	edat: " + edat + "	salari x mes: " + salari;
    }
}
