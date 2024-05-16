package ex9_3;

import java.util.ArrayList;

public class ex9_3 {

	public static void main(String[] args) {
		ArrayList<String> num = new ArrayList<String>();//1
		num.add("10");
		num.add("20");
		num.add("30");
		num.add("40");
		num.add("50");//2
		System.out.println(num);//3
		
		num.add("60");//4
		System.out.println(num);//5
		
		num.remove("30");//6
		System.out.println(num);//7
		
		System.out.println(num.get(0));//8
		
		num.set(1, "25");//9
		System.out.println(num);//10
		
		num.size();//11
		System.out.println(num);//12
		
		num.clear();//13
		System.out.println();//14
	}

}
