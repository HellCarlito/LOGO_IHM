package view;
import javax.swing.*;
import java.awt.*;

public class DessinExercice extends JPanel{
	
	// il s'agit de la zone des dessins
	private JPanel dessins;
	// il s'agit du dessin de l'enfant
	private JPanel dessinEnfant;
	//il s'agit du dessin du prof
	private JPanel dessinProf;
	
	public DessinExercice()
	{
		//Instanciation des panels
		dessins = new JPanel();
		dessinEnfant = new JPanel();
		dessinProf = new JPanel();
		
		//Association des sous-panels au panel général
		dessins = new JPanel(new GridLayout(1,2));
		dessins.add(dessinEnfant);
		dessins.add(dessinProf);
	}
}
