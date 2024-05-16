package examenprogramacio;

public class Gitarra extends InstrumentoMusical{
	int numCuerdas;
	
	public Gitarra(String nombre, String material, int añoFabricacion, int numCuerdas) {
		super(nombre, material, añoFabricacion);
		this.numCuerdas = numCuerdas;
	}
	public String toString() {
        return "Nombre: " + nombre + "	Material: " + material + "	Año de Fabricacion: " + añoFabricacion + " Cuantas cuerdas tiene? " + numCuerdas;
    }
    
    public void TocarGuitarra() {
    	System.out.println("Tocando la guitarra" + nombre);
    }
    public void AfinandoGuitarra() {
		System.out.println("Afinando la guitarra" + nombre);
	}
    public void EmpaquetandoGuitarra() {
		System.out.println("Empaquetando la guitarra" + nombre);
	}
    public void DesempaquetandoGuitarra() {
		System.out.println("Desempaquetando la guitarra" + nombre);
	}
    
}
