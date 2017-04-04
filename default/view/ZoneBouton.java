package view;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import model.*;
import view.*;

public class ZoneBouton extends JPanel
{
	private BoutonDeplacement boutonsDeplacement;
	private BoutonCouleur boutonsCouleur;
	private BoutonRapide boutonsRapide;
	private BoutonGestion boutonsGestion;
	
	public ZoneBouton(TortueG maTortue)
	{
		boutonsDeplacement= new BoutonDeplacement();
		boutonsGestion= new BoutonGestion();
		JPanel haut=new JPanel(new BorderLayout());
		haut.add(boutonsDeplacement,BorderLayout.CENTER);
		if (maTortue instanceof TortueCouleur)
		{
			boutonsCouleur=new BoutonCouleur();
			haut.add(boutonsCouleur,BorderLayout.EAST);
		}
		else if (maTortue instanceof TortueRapide)
		{
			boutonsRapide=new BoutonRapide();
			haut.add(boutonsRapide,BorderLayout.EAST);
		}
		
		this.setLayout(new GridLayout (0,1));
		this.add(haut);
		this.add(boutonsGestion);
	}
	
	public BoutonDeplacement getPanelDeplacement()
	{
		return boutonsDeplacement;
	}
	
	public BoutonCouleur getPanelCouleur()
	{
		return boutonsCouleur;
	}
	
	public BoutonRapide getPanelRapide()
	{
		return boutonsRapide;
	}
	
	public BoutonGestion getPanelGestion()
	{
		return boutonsGestion;
	}
	
	public static void main(String[] args)
	{
		TortueG uneTortue= new TortueG();
        JFrame test = new JFrame();
        test.setContentPane(new ZoneBouton(uneTortue));
        test.setVisible(true);
        test.pack();
    }
}
