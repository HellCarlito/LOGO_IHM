package view;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import model.*;
import view.*;

public class ZoneBouton extends JPanel
{
	private JPanel haut;
	
	public ZoneBouton(TortueG maTortue)
	{
		haut=new JPanel(new BorderLayout());
		haut.add(new BoutonDeplacement(),BorderLayout.CENTER);
		if (maTortue instanceof TortueCouleur)
		{
			haut.add(new BoutonCouleur(),BorderLayout.EAST);
		}
		else if (maTortue instanceof TortueRapide)
		{
			haut.add(new BoutonRapide(),BorderLayout.EAST);
		}
		this.setLayout(new GridLayout (0,1));
		this.add(haut);
		this.add(new BoutonGestion());
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
