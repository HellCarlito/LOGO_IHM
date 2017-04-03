package view;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class BoutonCouleur extends JPanel
{
	private JButton black, red, green, blue, yellow, magenta;
	
	public BoutonCouleur()
	{
		black = new JButton (" ");
        black.setBackground(Color.black);
        red = new JButton (" ");
        red.setBackground(Color.red);
        green = new JButton (" ");
        green.setBackground(Color.green);
        blue = new JButton (" ");
        blue.setBackground(Color.blue);
        yellow = new JButton (" ");
        yellow.setBackground(Color.yellow);
        magenta = new JButton (" ");
        magenta.setBackground(Color.magenta);
		this.setLayout(new GridLayout (0,2));
		this.add(yellow);
		this.add(red);
		this.add(green);
		this.add(blue);
		this.add(black);
		this.add(magenta);
	}
	
	public static void main(String[] args) {
        JFrame test = new JFrame();
        test.setContentPane(new BoutonCouleur());
        test.setVisible(true);
        test.pack();
    }
	
	public JButton getBlack()
	{
		return black;
	}
	
	public JButton getYellow()
	{
		return yellow;
	}
	
	public JButton getRed()
	{
		return red;
	}
	
	public JButton getBlue()
	{
		return blue;
	}
	
	public JButton getGreen()
	{
		return green;
	}
	
	public JButton getMagenta()
	{
		return magenta;
	}
}
