package view;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;

public class Menu {

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
		
		//Panel menu contiendra le menu suivant le type de compte (enseignant ou eleve)
		menu = new JPanel();
		
		
		//relier les classes Titre, Affichage et ActionMenu
		
	}
}
