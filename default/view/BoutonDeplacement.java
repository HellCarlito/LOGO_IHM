package view;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class BoutonDeplacement extends JPanel
{
	private JButton ecrire,nePasEcrire,tourner,avancer;
	private Icon ecrireIcon,nePasEcrireIcon,tournerIcon,avancerIcon;
	private JPanel monPanel;
	
	public BoutonDeplacement()
	{
		ecrireIcon = new ImageIcon(this.getClass().getResource("/ecrire.png"));
		ecrire = new JButton (ecrireIcon);
		nePasEcrireIcon = new ImageIcon(this.getClass().getResource("/nepasecrire.png"));
		nePasEcrire = new JButton (nePasEcrireIcon);
		tournerIcon = new ImageIcon(this.getClass().getResource("/tourner.png"));
		tourner = new JButton (tournerIcon);
		avancerIcon = new ImageIcon(this.getClass().getResource("/avancer.png"));
		avancer = new JButton (avancerIcon);
		//monPanel= new JPanel("My inventory");
		//this.set
	}
	
	public JPanel getPanelBoutonDeplacement()
	{
		return monPanel;
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
