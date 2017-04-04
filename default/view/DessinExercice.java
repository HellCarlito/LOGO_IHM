package view;
import javax.swing.*;
import java.awt.*;

public class DessinExercice extends JPanel
{	
	// il s'agit du dessin de l'enfant
	private JPanel dessinEnfant;
	//il s'agit du dessin du prof
	private JPanel dessinProf;
	
	public DessinExercice()
	{
		//Instanciation des panels
		dessinEnfant = new JPanel();
		dessinProf = new JPanel();
		
		//Association des sous-panels au panel général
		this.setLayout(new GridLayout(1,0));
		this.add(dessinEnfant);
		this.add(dessinProf);
	}
}
