package ex9_6;

import java.util.LinkedList;

public class ex9_6 {

	public static void main(String[] args) {
		LinkedList<String> llistaciutats = new LinkedList<String>();//1
		
		llistaciutats.add(new String("Barcelona"));
		llistaciutats.add(new String("Madrid"));
		llistaciutats.add(new String("Valencia"));
		llistaciutats.add(new String("Sevilla"));//2
		System.out.println(llistaciutats);//3
		
		llistaciutats.addFirst(new String("Bilbao"));//4
		llistaciutats.addLast(new String("Malaga"));//5
		System.out.println(llistaciutats.getFirst());//6
		System.out.println(llistaciutats.getLast());//6
		
		llistaciutats.removeFirst();//7
		llistaciutats.removeLast();//8
		
		System.out.println(llistaciutats);//9
	}

}
