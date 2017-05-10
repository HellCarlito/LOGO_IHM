package view;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
  
public class ActionEnseignant extends JPanel
{

	//Attributs
	private JPanel boutonsMenuEnseignant, affichage;
	private JButton creerExercice, modifierExercice, explorerTravailEleve, evaluerTravailEleve, visualiserClasse;
	
	
	/**
	 * Classe principale de la classe ActionEnseignant 
	 * @return un Panel
	 */
	public ActionEnseignant() 
	{	
		//Initialisation des boutons du menu de l'interface Enseignant
		creerExercice = new JButton("Créer un exercice");
		modifierExercice = new JButton("Modifier un exercice");
		explorerTravailEleve = new JButton("Explorer le travail d'un élève");
		evaluerTravailEleve = new JButton("Evaluer le travail des élèves");
		visualiserClasse = new JButton("Visualiser une classe");
		
		
		//Creation du Panel de boutons du menu Enseignant
		boutonsMenuEnseignant = new JPanel(new GridLayout(0,1));
		boutonsMenuEnseignant.add(creerExercice);
		boutonsMenuEnseignant.add(modifierExercice);
		boutonsMenuEnseignant.add(explorerTravailEleve);
		boutonsMenuEnseignant.add(evaluerTravailEleve);
		boutonsMenuEnseignant.add(visualiserClasse);
		
		//Creation panel affichage resultats
		affichage = new JPanel(new GridLayout(0,1));
		
		this.setLayout(new GridLayout(1,0));
		this.add(boutonsMenuEnseignant);
		this.add(affichage);
	}
	
		

	
	public JButton getCreerExo(){
		return creerExercice;
	}
	
	public JButton getModifExo(){
		return modifierExercice;
	}
	
	public JButton getExplorerTravail(){
		return explorerTravailEleve;
	}
	
	public JButton getEvaluerEleve(){
		return evaluerTravailEleve;
	}
	
	public JButton getVisualiserClasse(){
		return visualiserClasse;
	}	
	
	public JPanel getActionMenu(){
		return this;
	}
}
