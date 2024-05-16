package ex6_11;


public class Llibre {
	String titol; 
	String autors;
	
	public Llibre(String titol, String autors) {
		this.titol = titol;
		this.autors = autors;
	}
	
	public String toString1() {
		return titol;

	}
	public void setTitol(String titol) {
		this.titol = titol;
	}
	
	public String toString2() {
		return autors;	
	}
	public void setAutors(String autors) {
		this.autors = autors;
	}
	
	public String toString3() {
		return "Titol del Llibre: " + titol + "\nAutor del Llibre: " + autors;
		
	}
}
