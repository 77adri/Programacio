package Password;

import java.util.Random;

public class nPassword {

	public static void main(String[] args) {
		Password pass1 = new Password();
		Password pass2 = new Password(15);

		pass1.esRobust();
		Random rnd = new Random();
		rnd.nextInt(128);
	}
	public void Password(){
		
	}

}
