package view;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class BoutonRapide extends JPanel
{
	private JButton rapide,lent;
	private JLabel vitesse;
	
	public BoutonRapide()
	{
		rapide = new JButton ("+");
        rapide.setForeground(Color.green);
        rapide.setBackground(Color.white);
		lent = new JButton ("-");
		lent.setForeground(Color.red);
		lent.setBackground(Color.white);
		vitesse=new JLabel("0",SwingConstants.CENTER);
		JPanel haut = new JPanel (new GridLayout (1,0));
		haut.add(rapide);
		haut.add(lent);
		this.setLayout(new GridLayout (0,1));
		this.add(haut);
		this.add(vitesse);
	}
	
	public static void main(String[] args) {
        JFrame test = new JFrame();
        test.setContentPane(new BoutonRapide());
        test.setVisible(true);
        test.pack();
    }
	
	public JButton getRapide()
	{
		return rapide;
	}
	
	public JButton getLent()
	{
		return lent;
	}
}
