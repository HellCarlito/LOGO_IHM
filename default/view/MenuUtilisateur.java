package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
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
				boutonsUtilisateur = new JPanel(new GridLayout(2,1));
				enseignant = new JButton("Enseignant");
				eleve = new JButton("Eleve");
				boutonsUtilisateur.add(enseignant);
				boutonsUtilisateur.add(eleve);
				
				this.add(boutonsUtilisateur);
	}
	
	public JButton getEnseignant(){
		return enseignant;
	}
	
	public JButton getEleve(){
		return eleve;
	}
	
	public static void main(String[] args) {
        JFrame test = new JFrame();
        test.setContentPane(new MenuUtilisateur());
        test.setVisible(true);
        test.pack();
    }
}
