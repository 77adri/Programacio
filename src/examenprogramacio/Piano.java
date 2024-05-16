package examenprogramacio;

public class Piano extends InstrumentoMusical{
	boolean esPianodeCola;
	
	public Piano(String nombre, String material, int añoFabricacion, boolean esPianodeCola) {
		super(nombre, material, añoFabricacion);
		this.esPianodeCola = esPianodeCola;
	}
	public String toString() {
        return "Nombre: " + nombre + "	Material: " + material + "	Año de Fabricacion: " + añoFabricacion + " Es Piano de cola? " + esPianodeCola;
    }
    
    public void tocar() {
    	System.out.println("Tocando el piano" + nombre);
    }
    public void Afinando() {
		System.out.println("Afinando el piano" + nombre);
	}
}
