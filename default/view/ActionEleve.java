package view;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class ActionEleve extends JPanel
{
	// Attributs
	private JPanel boutonsMenuEleve,affichage;
	private JPanel titre;
	private Icon retourIcon;
	private JLabel label;
	private JButton retour, faireExercice, visualiserTentative, refaireTentative, visualisationResultats;
	
	public ActionEleve() 
	{
		//Initialisation des boutons du menu de l'interface Eleve
		faireExercice = new JButton ("Faire un exercice");
		visualiserTentative = new JButton("Visualiser une tentative");
		refaireTentative = new JButton("Refaire une tentative");
		visualisationResultats = new JButton("Visualiser mes r�sultats");
	
		//Cr�ation du Panel de boutons du menu Eleve
		boutonsMenuEleve = new JPanel(new GridLayout(0,1));
		boutonsMenuEleve.add(faireExercice);
		boutonsMenuEleve.add(visualiserTentative);
		boutonsMenuEleve.add(refaireTentative);
		boutonsMenuEleve.add(visualisationResultats);
		
		//Creation panel affichage resultats
		affichage = new JPanel(new GridLayout(0,1));
		
		this.setLayout(new GridLayout(1,0));
		this.add(boutonsMenuEleve);
		this.add(affichage);
	}
	
	public JButton getFaireExo(){
		return faireExercice;
	}
	
	public JButton getVisualiserTentative(){
		return visualiserTentative;
	}
	
	public JButton getRefaireTentative(){
		return refaireTentative;
	}
	
	public JButton getVisualiserResultat(){
		return visualisationResultats;
	}
	
	public static void main(String[] args)
	{
        JFrame test = new JFrame();
        test.setContentPane(new ActionEleve());
        test.setVisible(true);
        test.pack();
    }
}