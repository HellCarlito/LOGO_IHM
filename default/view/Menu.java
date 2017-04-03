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
	
	/**
	 * Constructeur
	 */
	public Menu(){
		
		//Panel utilisateur qui correspond à la page permettant le choix entre le compte Enseignant et le compte Eleve
		utilisateur = new JPanel();
		
		//Initialisation des boutons du menu utilisateur
		enseignant = new JButton("Enseignant");
		eleve = new JButton("Eleve");
		utilisateur.add(enseignant);
		utilisateur.add(eleve);
		//utilisateur.add(titre);//récuperer le panel de la classe titre qui contient un tableau avec le titre et le bouton retour en arrière
		
		//Panel menu contiendra le menu suivant le type de compte (enseignant ou eleve)
		menu = new JPanel();
		//menu.add(enteMenu); //panel présent dans la classe Titre
		
		//si menu Eleve
		//menu.add(boutonsMenuEleve); //panel present dans la classe ActionMenu
		//menu.add(affichageMenuEleve); //panel present dans la classe Affichage
		//si menu Enseignant
		//menu.add(boutonsMenuEnseignant); // panel present dans la classe ActionMenu
		//menu.add(affichageMenuEnseignant); //panel present dans la classe Affiche
		
		
		//relier les classes Titre, Affichage et ActionMenu
		
		//si on est sur la première page où l'on choisit quel compte on souhaite utiliser
		this.add(utilisateur);
		
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
