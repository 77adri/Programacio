package ex11_3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ex11_3 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("BorderLayoutDemo");
			JPanel pane = (JPanel) frame.getContentPane();
			pane.setLayout(new BorderLayout());
			JPanel panecenter = new JPanel();
			
			
			
			
			JButton boton1 = new JButton("center1");
			JButton boton2 = new JButton("center2");
			JButton boton3 = new JButton("center3");
			JButton boton4 = new JButton("center4");
			JButton boton5 = new JButton("center5");
			JButton center1 = new JButton("center1");
			JButton center2 = new JButton("center2");
			JButton center3 = new JButton("center3");
			JButton center4 = new JButton("center4");
			JButton center5 = new JButton("center5");
			
			JButton button = new JButton("Boton1 (PAGE_START)");
			pane.add(button, BorderLayout.PAGE_START);
			
			panecenter.add(center1);
			panecenter.add(center2);
			panecenter.add(center3);
			panecenter.add(center4);
			panecenter.add(center5);
			
			button = new JButton("Boton3 (LINE_START)");
			pane.add(button, BorderLayout.LINE_START);
			
			button = new JButton("Long-Named Button 4 (PAGE_END)");
			pane.add(button, BorderLayout.PAGE_END);
			
			button = new JButton("Boton5 (LINE_END)");
			pane.add(button, BorderLayout.LINE_END);
			
			pane.add(panecenter, BorderLayout.CENTER);
			
			frame.setSize(400, 250);
			frame.setVisible(true);
	}

}
