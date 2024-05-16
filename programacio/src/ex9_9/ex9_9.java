package ex9_9;

import java.util.HashSet;

public class ex9_9 {

	public static void main(String[] args) {
		HashSet<String> num = new HashSet<String>();
		num.add("10");
		num.add("20");
		num.add("30");
		num.add("40");
		num.add("50");//1
		System.out.println(num);//2
		
		if(num.contains("20")) {
			System.out.println("El numero 20 esta a la llista.");
		}else {
			System.out.println("El numero 20 no esta a la llista.");
		}//3
		if(num.contains("35")) {
			System.out.println("El numero 35 esta a la llista.");
		}else {
			System.out.println("El numero 35 no esta a la llista.");
		}//3
		num.remove("40");//4
		System.out.println(num);//5
		num.contains(50);//6
		System.out.println(num);//7.El que a pasat es que se posa normal, no se introdueix un altre numero 50
		int tamany = num.size();//8
		System.out.println("Tamany de la llista: " + tamany);//8
		num.clear();//9
		System.out.println(num);//10
		
	}
}
