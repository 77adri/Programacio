package gridBag;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GridBagLayoutDema {

	public static void main(String[] args) {
		JFrame frame = new JFrame("GridBagLayout Demo");
		JPanel panel = (JPanel) frame.getContentPane();
		
		panel.setLayout(new GridBagLayout());
		
		JButton boto1 = new JButton("Boto1");
		JButton boto2 = new JButton("Boto2");
		JButton boto3 = new JButton("Boto3");
		JButton boto4 = new JButton("Long Boto4");
		JButton boto5 = new JButton("5");
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 0;
		panel.add(boto1, constraints);
		
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 1;
		constraints.gridy = 0;
		panel.add(boto2, constraints);
		
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 2;
		constraints.gridy = 0;
		panel.add(boto3, constraints);
		
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 3;
		constraints.ipady = 40;
		panel.add(boto4, constraints);
		
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 2;
		constraints.ipady = 0;
		constraints.insets = new Insets(10,0,0,0);
		panel.add(boto4, constraints);
		
		frame.setSize(400, 300);
		frame.setVisible(true);
	}

}
