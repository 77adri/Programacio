package Examen5i6;

public abstract class Electrodomestico {
	String marca;
	boolean inteligente;
	double precio;
	
	public Electrodomestico(String marca, boolean inteligente, double precio) {
        this.marca = marca;
        this.inteligente = inteligente;
        this.precio = precio;
    }
	 	public String getMarca() {
	        return marca;
	    }
	    public boolean getinteligente() {
	        return inteligente;
	    }
	    public double getPrecio() {
	        return precio;
	    }
	    
	    public String toString() {
	    	return "Marca: " + marca + "\nEs inteligente: " + inteligente + "\nPrecio" + precio;
	    }
}
