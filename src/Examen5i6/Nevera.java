package Examen5i6;

public class Nevera extends Electrodomestico implements enReparacion{

	int litrosCapazidad;
	
	public Nevera(String marca, boolean inteligente, double precio) {
		super(marca, inteligente, precio);
		this.litrosCapazidad = litrosCapazidad;
	}
	public String toString() {
        return "Nevera-->\nMarca: " + marca + "\nEs inteligente: " + inteligente + "\nPrecio: " + precio + "\nCapazidad de litros: " + litrosCapazidad ;
    }
	@Override
	public double reparar(int horasreparacion) {
		
		return precioxhora * horasreparacion;
	}
	
}
