package view;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;

public class ActionMenu extends JPanel{

	/**
	 * Attributs
	 */
	private JPanel boutonsMenuEleve, boutonsMenuEnseignant;
	private JButton faireExercice, visualiserTentative, refaireTentative, visualisationResultats;
	private JButton creerExercice, modifierExercice, explorerTravailEleve, evaluerTravailEleve, visualiserClasse;
	
	/**
	 * Constructeur 
	 */
	public ActionMenu () 
	{
		//Initialisation des boutons du menu de l'interface Eleve
		faireExercice = new JButton ("Faire un exercice");
		visualiserTentative = new JButton("Visualiser une tentative");
		refaireTentative = new JButton("Refaire une tentative");
		visualisationResultats = new JButton("Visualiser mes r�sultats");
		
		//Initialisation des boutons du menu de l'interface Enseignant
		creerExercice = new JButton("Cr�er un exercice");
		modifierExercice = new JButton("Modifier un exercice");
		explorerTravailEleve = new JButton("Explorer le travail d'un �l�ve");
		evaluerTravailEleve = new JButton("Evaluer le travail des �l�ves");
		visualiserClasse = new JButton("Visualiser une classe");
		
		//Cr�ation du Panel de boutons du menu Eleve
		boutonsMenuEleve = new JPanel(new GridLayout(4,1));
		boutonsMenuEleve.add(faireExercice);
		boutonsMenuEleve.add(visualiserTentative);
		boutonsMenuEleve.add(refaireTentative);
		boutonsMenuEleve.add(visualisationResultats);	
		
		//Cr�ation du Panel de boutons du menu Enseignant
		boutonsMenuEnseignant = new JPanel(new GridLayout(5,1));
		boutonsMenuEnseignant.add(creerExercice);
		boutonsMenuEnseignant.add(modifierExercice);
		boutonsMenuEnseignant.add(explorerTravailEleve);
		boutonsMenuEnseignant.add(evaluerTravailEleve);
		boutonsMenuEnseignant.add(visualiserClasse);
		
		//Faire une boucle pour savoir si on se trouve sur le compte �l�ve ou enseignant
		//Afficher le menu en fonction du compte
		
	}
}
