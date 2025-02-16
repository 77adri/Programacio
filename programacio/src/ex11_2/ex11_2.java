package ex11_2;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ex11_2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("FlowLayoutDemo");
			JPanel finestra = (JPanel) frame.getContentPane();
			finestra.setLayout(new FlowLayout());
			
			JLabel counter = new JLabel("Counter: ");
			JTextField text = new JTextField("0");
			JRadioButton up = new JRadioButton("up");
			JRadioButton down = new JRadioButton("down");
			ButtonGroup botons = new ButtonGroup();
			botons.add(up);
			botons.add(down);
			JLabel step = new JLabel("Step: ");
			JComboBox box = new JComboBox();
			box.addItem("1");
			box.addItem("2");
			box.addItem("3");
			JButton button = new JButton("Count");
			
			finestra.add(counter);
			finestra.add(text);
			finestra.add(up);
			finestra.add(down);
			finestra.add(step);
			finestra.add(box);
			finestra.add(button);
			
			frame.pack();
			frame.setVisible(true);
	}

}
