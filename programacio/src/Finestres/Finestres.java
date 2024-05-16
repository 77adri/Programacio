package Finestres;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Finestres {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = (JPanel) frame.getContentPane();
		JButton boto1 = new JButton ("Acceptar");
		JButton boto2 = new JButton ("Cancel");
		
		panel.add(boto1);
		panel.add(boto2);
		
		frame.setSize(500, 300);
		frame.setVisible(true);
	}

}
