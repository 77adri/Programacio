package Examen5i6;

public class Lavadora extends Electrodomestico implements enReparacion{

	int kilosCapazidad;
	
	public Lavadora(String marca, boolean inteligente, double precio) {
		super(marca, inteligente, precio);
		this.kilosCapazidad = kilosCapazidad;
	}
	public String toString() {
        return "Lavadora-->\nMarca: " + marca + "\nEs inteligente: " + inteligente + "\nPrecio: " + precio + "\nCapazidad de Kilos: " + kilosCapazidad ;
    }
	public double reparar(int horasreparacion) {
		
		return precioxhora * horasreparacion;
	}
}
