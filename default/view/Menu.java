package view;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel{

	/**
	 * Attributs
	 */
	private JPanel menu; 
	private JPanel boutonEleve, boutonEnseignant, titreEleve, titreEnseignant;
	private JPanel tabMenuEleve, tabMenuEnseignant;
	private JPanel affichageMenuEleve, affichageMenuEnseignant;
	
	/**
	 * Constructeur
	 */
	public Menu(){
		
		//Initialisation des variables pour la page Eleve
		boutonEleve = new ActionMenu();
		titreEleve = new Titre("Eleve");
		affichageMenuEleve = new Affichage();
				
		//Initialisation des variables pour la page Enseignant
		boutonEnseignant = new ActionMenu();	
		titreEnseignant = new Titre ("Enseignant");
		//affichageMenuEnseignant = new Affichage();
		
		//Initialisation du Panel Menu qui contiendra soit le menu élève, soit le menu enseignant
		menu = new JPanel(new GridLayout(2,1));
		tabMenuEleve = new JPanel(new GridLayout(1,2));
		tabMenuEnseignant = new JPanel(new GridLayout(1,2));
		
		//Si Menu Eleve 
		menu.add(titreEleve);
		tabMenuEleve.add(boutonEleve);
		//tabMenuEleve.add(affichageMenuEleve); 
		menu.add(tabMenuEleve);
		
		//Si Menu Enseignant
		menu.add(titreEnseignant);
		tabMenuEnseignant.add(boutonEnseignant); 
		//tabMenuEnseignant.add(affichageMenuEnseignant); 
		menu.add(tabMenuEnseignant);
		
		//si on est sur l'un des comptes (enseignant ou eleve)
		this.add(menu);
	}
	
	public static void main(String[] args) {
        JFrame test = new JFrame();
        test.setContentPane(new Menu());
        test.setVisible(true);
        test.pack();
    }
}
