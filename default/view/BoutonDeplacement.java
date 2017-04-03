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
		nePasEcrireIcon = new ImageIcon(this.getClass().getResource("/pictures/nepasecrire.png"));
		nePasEcrire = new JButton (nePasEcrireIcon);
		tournerIcon = new ImageIcon(this.getClass().getResource("/pictures/tourner.png"));
		tourner = new JButton (tournerIcon);
		avancerIcon = new ImageIcon(this.getClass().getResource("/pictures/avancer.png"));
		avancer = new JButton (avancerIcon);
		this.setLayout(new GridLayout (1,0));
		this.add(ecrire);
		this.add(nePasEcrire);
		this.add(tourner);
		this.add(avancer);
		//this.add(new JLabel("test"));
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
