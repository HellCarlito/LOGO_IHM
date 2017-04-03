package view;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;

public class ExerciceInterface extends JPanel{

	/**
	 * Attributs
	 */
	//Contiendra les sous-panels realisationDessin et affichageCode
	private JPanel exerciceInterface;
	//Contiendra les sous-panels dessin et interfaceBoutons
	private JPanel realisationDessin;
	
	/**
	 * Constructeur
	 */
	public ExerciceInterface(){
		
		//Initialisation des panels
		exerciceInterface = new JPanel();
		realisationDessin = new JPanel();
		
		//Ajout des Panels au Panel principal
		exerciceInterface.add(realisationDessin);
		//exerciceInterface.add(affichageCode); //récuperer le panel dans la classe Code
		
		//Ajout des Panels au sous-panel realisationDessin
		//realisationDessin.add(dessins); //récuperer le panel dans la classe DessinExercice
		//realisationDessin.add(interfaceBoutons); //récuperer le panel dans la classe ZoneBouton
		
		this.add(exerciceInterface);
	}

public static void main(String[] args) {
    JFrame test = new JFrame();
    test.setContentPane(new ExerciceInterface());
    test.setVisible(true);
    test.pack();
}

}