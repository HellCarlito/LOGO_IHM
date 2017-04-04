package view;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import model.*;

public class ExerciceInterface extends JPanel
{
	private Code codeAction;
	private DessinExercice dessins;
	private ZoneBouton boutons;

	/**
	 * Constructeur
	 */
	public ExerciceInterface(Exercice unExercice)
	{
		codeAction = new Code();
		codeAction.add(new Code());
		dessins = new DessinExercice(unExercice);
		boutons = new ZoneBouton((unExercice.getTortue()));
		JPanel zoneTravail = new JPanel(new GridLayout (0,1));
		zoneTravail.add(dessins);
		zoneTravail.add(boutons);
		
		this.setLayout(new BorderLayout());
		this.add(zoneTravail,BorderLayout.CENTER);
		this.add(codeAction,BorderLayout.EAST);
	}
	
	public Code getPanelCode()
	{
		return codeAction;
	}
	
	public DessinExercice getPanelDessins()
	{
		return dessins;
	}
	
	public ZoneBouton getPanelBoutons()
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