package exercicis6_3_6_4;

import java.util.Random;

public class npassword {

	public static void main(String[] args) {
		password pass1 = new password();
		password pass2 = new password(15);

		pass1.esRobust();
		Random rnd = new Random();
		rnd.nextInt(128);
	}
	public void password(){
		
	}

}