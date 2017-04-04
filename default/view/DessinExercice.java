package view;
import javax.swing.*;

import model.Exercice;

import java.awt.*;

public class DessinExercice extends JPanel
{
	
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
