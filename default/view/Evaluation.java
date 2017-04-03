package view;
import javax.swing.*;
import java.awt.*;

public class Evaluation extends JPanel{
	
	// contient l'evaluation sans les commentaires
	private JPanel evaluation;
	// contient les boutons evaluerTravailEleve et validerChoixEvaluation
	private JPanel note;
	// contient les checkboxs
	private JPanel checkBox;
	// contient le bouton jouerTentative
	private JPanel jouer;
	// contient les commentaires du prof
	private JPanel commentaires;
	
	// checkbox qui permet de choisir entre "Acquis", "En cours d'acquisition" et "Non acquis"
	private JCheckBox acquis = new JCheckBox("Acquis");
	private JCheckBox enCours = new JCheckBox("En cours d'acquisition");
	private JCheckBox nonAcquis = new JCheckBox("Non acquis");
	
	// bouton qui permet de valider l'evaluation
	private JButton validerChoixEvaluation;
	// bouton qui permet de jouer la tentative
	private JButton jouerTentative;
	
	// label : "Evaluation"
	private JLabel eval;
	// label qui permet de faire le commentaires
	private JTextArea com;
	
	public Evaluation()
	{
		//Instanciation des JPanels
		evaluation = new JPanel(new BorderLayout());
		note = new JPanel(new GridLayout(3,1));
		checkBox = new JPanel(new GridLayout(1,3));
		jouer = new JPanel();
		commentaires = new JPanel();
		
		//Instanciation du JLabel
		eval = new JLabel("Evaluation", JLabel.CENTER);
		
		// Pour récupérer ce qui a été saisi dans un JTextArea, 
		//cela se fait via la méthode "String monJTextArea.getText()"
		com = new JTextArea("Votre commentaire ..");
		com.setEditable(false);
		
		//Instanciation des boutons
		validerChoixEvaluation = new JButton("Valider l'evaluation");
		jouerTentative = new JButton("Jouer");
		
		//Ajout des boutons, textArea, checkbox aux panels
		checkBox.add(acquis);
		checkBox.add(enCours);
		checkBox.add(nonAcquis);
		
		note.add(eval);
		note.add(checkBox);
		note.add(validerChoixEvaluation);
		
		jouer.add(jouerTentative);
		
		commentaires.add(com);
		
		//Ajout des Jpanels entre eux
		evaluation.add(note, BorderLayout.CENTER);
		evaluation.add(jouer, BorderLayout.EAST);
		
		this.setLayout(new BorderLayout());
		this.add(evaluation, BorderLayout.NORTH);
		this.add(commentaires, BorderLayout.EAST);
	}
	
	public static void main(String[] args) {
        JFrame test = new JFrame();
        test.setContentPane(new Evaluation());
        test.setVisible(true);
        test.pack();
    }
}
