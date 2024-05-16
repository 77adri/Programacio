package ex9_10;

import java.util.TreeSet;

public class ex9_10 {

	public static void main(String[] args) {
		TreeSet<String> coses = new TreeSet<>();
		coses.add("Perix");
		coses.add("Leao");
		coses.add("Milan");
		coses.add("Patek");
		coses.add("Philippe");
		coses.add("ca");//1
		System.out.println(coses);//2
		
		String paraula = "Leao";
		System.out.println("La paraula es" + paraula);//3
		
		coses.add("ca");
		System.out.println(coses);//4 No a pasat res, ja que la paraula ja esteia dins la llista.
		
		coses.remove("Patek");//5
		System.out.println(coses);//6
	}

}
