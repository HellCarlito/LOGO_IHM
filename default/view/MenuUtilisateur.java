package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuUtilisateur extends JPanel{

	/**
	 * Attributs
	 */
	private JPanel utilisateur;
	private JButton enseignant, eleve;
	private JPanel boutonsUtilisateur, enteteMenu;
	
	/**
	 * Constructeur
	 */
	public MenuUtilisateur()
	{
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
				
				this.add(utilisateur);
	}
	
	public JButton getEnseignant(){
		return enseignant;
	}
	
	public JButton getEleve(){
		return eleve;
	}
}
