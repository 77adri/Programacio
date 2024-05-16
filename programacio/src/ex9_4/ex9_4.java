package ex9_4;

import java.util.ArrayList;

public class ex9_4 {

	public static void main(String[] args) {
		ArrayList<Persona> persones = new ArrayList<>();//1
		
		persones.add(new Persona("Npanzu", "41512345F", 22));
		persones.add(new Persona("Perix", "41532345D", 24));
		persones.add(new Persona("Leao", "41312345H", 19));//2
		System.out.println(persones);//3
		
		persones.add(new Persona("Rafael", "41472345J", 19));//4
		System.out.println(persones);//5
		
		for(int i = 0; i< persones.size(); i++) {
			if (persones.get(i).getDni().equals("41512345F")) {
				persones.remove(i);
				break;
			}
		}//7
		System.out.println(persones);//7
	}

}
