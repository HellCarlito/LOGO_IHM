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
	private JPanel boutonEleve, boutonEnseignant, enteteMenu, titre;
	
	/**
	 * Constructeur
	 */
	public Menu(){
		
		//Initialisation des Panels pour les boutons
		utilisateur = new JPanel();
		boutonEleve = new ActionMenu();
		boutonEnseignant = new ActionMenu();
		enteteMenu = new Titre();
		titre = new Titre();
		
		//Initialisation des boutons du menu utilisateur
		enseignant = new JButton("Enseignant");
		eleve = new JButton("Eleve");
		utilisateur.add(enseignant);
		utilisateur.add(eleve);
		utilisateur.add(titre);//récuperer le panel de la classe titre qui contient un tableau avec le titre et le bouton retour en arrière

		
		//Panel menu contiendra le menu suivant le type de compte (enseignant ou eleve)
		menu = new JPanel();
		menu.add(enteteMenu); //panel présent dans la classe Titre
		
		//si menu Eleve
		menu.add(boutonEleve); //panel present dans la classe ActionMenu
		//menu.add(affichageMenuEleve); //panel present dans la classe Affichage
		
		//si menu Enseignant
		menu.add(boutonEnseignant); // panel present dans la classe ActionMenu
		//menu.add(affichageMenuEnseignant); //panel present dans la classe Affiche
		
		
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
