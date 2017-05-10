package view;
import javax.swing.tree.*;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import model.*;
import java.util.Date;

public class ExerciceInterface extends JPanel
{
	private Code codeAction;
	private DessinExercice dessins;
	private ZoneBouton boutonsEleve;
	private Evaluation boutonsEnseignant;
	private Utilisateur monUtilisateur;
	private Tentative maTentative;
	private Exercice monExercice;

	/**
	 * Constructeur
	 */
	public ExerciceInterface(Exercice unExercice,Utilisateur unUtilisateur,Tentative uneTentative)
	{
		monUtilisateur=unUtilisateur;
		maTentative=uneTentative;
		monExercice=unExercice;
		codeAction = new Code();
		codeAction.add(new Code());
		dessins = new DessinExercice(unExercice);
		JPanel zoneTravail = new JPanel(new GridLayout (0,1));
		zoneTravail.add(dessins);
		if (unUtilisateur instanceof Eleve)
		{
			boutonsEleve = new ZoneBouton(unExercice.getTortue());
			zoneTravail.add(boutonsEleve);
		}
		else if (unUtilisateur instanceof Enseignant)
		{
			boutonsEnseignant = new Evaluation();
			zoneTravail.add(boutonsEnseignant);
		}
		
		this.setLayout(new BorderLayout());
		this.add(zoneTravail,BorderLayout.CENTER);
		this.add(codeAction,BorderLayout.EAST);
	}
	
	public Exercice getMonExercice()
	{
		return monExercice;
	}
	
	public Code getPanelCode()
	{
		return codeAction;
	}
	
	public DessinExercice getPanelDessins()
	{
		return dessins;
	}
	
	public ZoneBouton getPanelBoutonsEleve()
	{
		return boutonsEleve;
	}
	
	public Evaluation getPanelBoutonsEnseignant()
	{
		return boutonsEnseignant;
	}

	public static void main(String[] args)
	{
		Enseignant unEnseignant = new Enseignant("nom","prénom");
		Icon uneImage = new ImageIcon();
		TortueG uneTortue = new TortueG();
		Exercice unExercice = new Exercice("nom exercice", uneTortue, uneImage, unEnseignant);
		Date uneDate = new Date();
		Tentative uneTentative = new Tentative(uneDate, unExercice);
	    JFrame test = new JFrame();
	    test.setContentPane(new ExerciceInterface(unExercice, unEnseignant, uneTentative));
	    test.setVisible(true);
	    test.pack();
	}

}