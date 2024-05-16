package ex6_6;

public class Vehicle {
	String marca;
	String modelo;
	int edat_vehicle;
	
	public Vehicle() {
		
	}
	
	public Vehicle (String marca, String modelo, int edat_vehicle) {
		this.marca = marca;
		this.modelo = modelo;
		this.edat_vehicle = edat_vehicle;
	}
	
	public void nosocElectric() {
		System.out.println("No soc electric");
	}
	
}
