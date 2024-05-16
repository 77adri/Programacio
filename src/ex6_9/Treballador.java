package ex6_9;

public class Treballador extends Empleats{

	public Treballador(String nom, String cognom, int edat, int salari) {
		super(nom, cognom, edat, salari);
	}
	public String toString() {
        return "nom: " + nom + "	cognom: " + cognom + "	edat: " + edat + "	salari x mes: " + salari;
    }
}
