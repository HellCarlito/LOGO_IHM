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
	private JPanel utilisateur, menu;
	private JButton enseignant, eleve; 
	private JPanel boutonsUtilisateur, boutonEleve, boutonEnseignant, enteteMenu, titreEleve, titreEnseignant;
	private JPanel tabMenuEleve, tabMenuEnseignant;
	private JPanel affichageMenuEleve, affichageMenuEnseignant;
	
	/**
	 * Constructeur
	 */
	public Menu(){
		
		//Initialisation des Panels et Boutons pour la page utilisateur
		utilisateur = new JPanel(new GridLayout(2,1));
		boutonsUtilisateur = new JPanel(new GridLayout(1,2));
		enseignant = new JButton("Enseignant");
		eleve = new JButton("Eleve");
		enteteMenu = new Titre("Utilisateur");
		utilisateur.add(enteteMenu);
		boutonsUtilisateur.add(enseignant);
		boutonsUtilisateur.add(eleve);
		utilisateur.add(boutonsUtilisateur);
		
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
		
		//si on est sur la première page où l'on choisit quel compte on souhaite utiliser
		this.add(utilisateur);
		
		//si on est sur l'un des comptes (enseignant ou eleve)
		this.add(menu);
	}
	
	public JButton getEnseignant(){
		return enseignant;
	}
	
	public JButton getEleve(){
		return eleve;
	}
	
	public static void main(String[] args) {
        JFrame test = new JFrame();
        test.setContentPane(new Menu());
        test.setVisible(true);
        test.pack();
    }
}
