package ex6_6;

public class botiga_vehicles {

	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[5];
		
		vehicles[0] = new cotxe ("Mercedes", "clase a", 3);
		vehicles[1] = new cotxe ("Audi", "a1", 1);
		vehicles[2] = new cotxe ("BMW", "serie M", 1);
		
		vehicles[3] = new moto ("BMW", "S 1000 XR", 0);
		vehicles[4] = new moto ("Ducati", "Monster +", 1);
		
		for (Vehicle v : vehicles) {
			if (v instanceof moto) {
				System.out.println("Es una moto");
			}else {
				System.out.println("Es un cotxe");
			}
			System.out.println("MARCA -->" + v.marca);
			System.out.println("MODELO -->" + v.modelo);
			System.out.println("EDAT VEHICLE-->" + v.edat_vehicle);
			System.out.println("_______________________");
			
			
		}
	}

}
