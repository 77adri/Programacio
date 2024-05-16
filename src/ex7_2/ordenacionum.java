package ex7_2;

import java.util.Arrays;

public class ordenacionum {

	public static void main(String[] args) {
		int[] llistanum = {6,5,3,1,8,7,2,4};
		System.out.println(Arrays.toString(llistanum));

	for (int i = 1; i< llistanum.length; i++) {
			int num = llistanum[i];
			for(int j=i-1; j>=0; j--) {
				if (llistanum[j]>num) {
					llistanum[j+1]=llistanum[j];
				}else {
					llistanum[j+1]= num;
					break;
				}
				if(j==0 && llistanum[0]>num) {
					llistanum[0]= num;
				}
			}
		} 
		System.out.println(Arrays.toString(llistanum));
	}
}
