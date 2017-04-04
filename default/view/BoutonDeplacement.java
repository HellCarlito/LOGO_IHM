package view;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class BoutonDeplacement extends JPanel
{
	private JButton ecrire,nePasEcrire,tourner,avancer;
	private Icon ecrireIcon,nePasEcrireIcon,tournerIcon,avancerIcon;
	
	public BoutonDeplacement()
	{
		ecrireIcon = new ImageIcon(this.getClass().getResource("/pictures/ecrire.png"));
		ecrire = new JButton (ecrireIcon);
		ecrire.setBackground(Color.white);
		nePasEcrireIcon = new ImageIcon(this.getClass().getResource("/pictures/nepasecrire.png"));
		nePasEcrire = new JButton (nePasEcrireIcon);
		nePasEcrire.setBackground(Color.white);
		tournerIcon = new ImageIcon(this.getClass().getResource("/pictures/tourner.png"));
		tourner = new JButton (tournerIcon);
		tourner.setBackground(Color.white);
		avancerIcon = new ImageIcon(this.getClass().getResource("/pictures/avancer.png"));
		avancer = new JButton (avancerIcon);
		avancer.setBackground(Color.white);
		this.setLayout(new GridLayout (1,0));
		this.add(ecrire);
		this.add(nePasEcrire);
		this.add(tourner);
		this.add(avancer);
	}
	
	public static void main(String[] args) {
        JFrame test = new JFrame();
        test.setContentPane(new BoutonDeplacement());
        test.setVisible(true);
        test.pack();
    }
	
	public JButton getEcrire()
	{
		return ecrire;
	}
	
	public JButton getNePasEcrire()
	{
		return nePasEcrire;
	}
	
	public JButton getTourner()
	{
		return tourner;
	}
	
	public JButton getAvancer()
	{
		return avancer;
	}
}
