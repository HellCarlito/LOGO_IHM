package view;
import javax.swing.*;

import model.Exercice;

import java.awt.*;

public class DessinExercice extends JPanel
{	
	// il s'agit du dessin de l'enfant
	private JPanel dessinEnfant;
	//il s'agit du dessin du prof
	private JPanel dessinProf;
	
	public DessinExercice(Exercice unExercice)
	{
		//Instanciation des panels
		JPanel dessinEnfant = new JPanel();
		JLabel dessinProf = new JLabel(unExercice.getImageExercice());
		
		
		//Association des sous-panels au panel général
		this.setLayout(new GridLayout(1,0));
		this.add(dessinEnfant);
		this.add(dessinProf);
	}
}
