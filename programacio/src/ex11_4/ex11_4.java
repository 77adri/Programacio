package ex11_4;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ex11_4 {

	public static void main(String[] args) {
				//Frame
				JFrame calculadora = new JFrame("Calculadora");
				
				//Panel calculadora
				JPanel panel = (JPanel) calculadora.getContentPane();
				
				//display calculadora
				JTextField display = new JTextField("0");
				display.setBackground(Color.ORANGE);
				
				display.setHorizontalAlignment(SwingConstants.RIGHT);
				panel.add(display, BorderLayout.NORTH);
				
				//panel auxiliar on posar botons
				JPanel panelBotons = new JPanel();
				JButton boto1 = new JButton("1");
				JButton boto2 = new JButton("2");
				JButton boto3 = new JButton("3");
				JButton boto4 = new JButton("4");
				JButton boto5 = new JButton("5");
				JButton boto6 = new JButton("6");
				JButton boto7 = new JButton("7");
				JButton boto8 = new JButton("8");
				JButton boto9 = new JButton("9");
				JButton boto0 = new JButton("0");
				
				JButton botoS = new JButton("+");
				JButton botoR = new JButton("-");
				JButton botoD = new JButton("/");
				JButton botoM = new JButton("x");
				JButton botoClear = new JButton("C");
				JButton botoResultat = new JButton("=");
				
				
				//Afegir botons 
				panelBotons.add(boto1);
				panelBotons.add(boto2);
				panelBotons.add(boto3);
				panelBotons.add(boto4);
				panelBotons.add(boto5);
				panelBotons.add(boto6);
				panelBotons.add(boto7);
				panelBotons.add(boto8);
				panelBotons.add(boto9);
				panelBotons.add(boto0);
				
				panelBotons.add(botoS);
				panelBotons.add(botoR);
				panelBotons.add(botoD);
				panelBotons.add(botoM);
				panelBotons.add(botoClear);
				panelBotons.add(botoResultat);
				
				
				//afegir panels
				panel.add(panelBotons, BorderLayout.CENTER);
				
				display.setSize(200, 40);
				
				calculadora.setSize(230, 300);
				calculadora.setVisible(true);
	}

}
