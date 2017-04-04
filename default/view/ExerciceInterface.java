package view;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import model.*;

public class ExerciceInterface extends JPanel
{
	private JPanel codeAction;
	private JPanel dessins;
	private JPanel boutons;

	/**
	 * Constructeur
	 */
	public ExerciceInterface(Exercice unExercice)
	{
		codeAction = new JPanel();
		codeAction.add(new Code());
		dessins = new JPanel();
		dessins.add(new DessinExercice(unExercice));
		boutons = new JPanel();
		boutons.add(new ZoneBouton(unExercice.getTortue()));
		JPanel zoneTravail = new JPanel(new GridLayout (0,1));
		zoneTravail.add(dessins);
		zoneTravail.add(boutons);
		
		this.setLayout(new BorderLayout());
		this.add(zoneTravail,BorderLayout.CENTER);
		this.add(codeAction,BorderLayout.EAST);
	}
	
	public JPanel getPanelCode()
	{
		return codeAction;
	}
	
	public JPanel getPanelDessins()
	{
		return dessins;
	}
	
	public JPanel getPanelBoutons()
	{
		return boutons;
	}

	public static void main(String[] args)
	{
		Enseignant unEnseignant = new Enseignant("nom","prénom");
		Icon uneImage = new ImageIcon();
		TortueG uneTortue = new TortueG();
		Exercice unExercice = new Exercice("nom exercice", uneTortue, uneImage, unEnseignant);
	    JFrame test = new JFrame();
	    test.setContentPane(new ExerciceInterface(unExercice));
	    test.setVisible(true);
	    test.pack();
	}

}