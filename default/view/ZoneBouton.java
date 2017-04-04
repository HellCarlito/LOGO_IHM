package view;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import model.*;
import view.*;

public class ZoneBouton extends JPanel
{
	private JPanel boutonsDeplacement;
	private JPanel boutonsSpecifique;
	private JPanel boutonsGestion;
	
	public ZoneBouton(TortueG maTortue)
	{
		boutonsDeplacement= new JPanel();
		boutonsDeplacement.add(new BoutonDeplacement());
		boutonsGestion= new JPanel();
		boutonsGestion.add(new BoutonGestion());
		boutonsSpecifique=new JPanel();
		if (maTortue instanceof TortueCouleur)
		{
			boutonsSpecifique.add(new BoutonCouleur(),BorderLayout.EAST);
		}
		else if (maTortue instanceof TortueRapide)
		{
			boutonsSpecifique.add(new BoutonRapide(),BorderLayout.EAST);
		}
		JPanel haut=new JPanel(new BorderLayout());
		haut.add(boutonsDeplacement,BorderLayout.CENTER);
		haut.add(boutonsDeplacement,BorderLayout.EAST);
		
		this.setLayout(new GridLayout (0,1));
		this.add(haut);
		this.add(boutonsGestion);
	}
	
	public JPanel getPanelDeplacement()
	{
		return boutonsDeplacement;
	}
	
	public JPanel getPanelSpecifique()
	{
		return boutonsSpecifique;
	}
	
	public JPanel getPanelGestion()
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
