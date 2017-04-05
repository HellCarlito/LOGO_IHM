package view;
import javax.swing.*;
import java.awt.*;

public class Evaluation extends JPanel{
	
	// contient l'evaluation sans les commentaires
	private JPanel evaluation;
	// contient les boutons evaluerTravailEleve et validerChoixEvaluation
	private JPanel note;
	// contient les boutonradio
	private JPanel radioBouton;
	// contient le bouton jouerTentative
	private JPanel jouer;
	// contient les commentaires du prof
	private JPanel commentaires;
	
	// bouton radio qui permet de choisir entre "Acquis", "En cours d'acquisition" et "Non acquis"
	private JRadioButton acquis = new JRadioButton("Acquis");
	private JRadioButton enCours = new JRadioButton("En cours d'acquisition");
	private JRadioButton nonAcquis = new JRadioButton("Non acquis");
	private ButtonGroup bg = new ButtonGroup();
	
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
		radioBouton = new JPanel(new GridLayout(1,3));
		jouer = new JPanel();
		commentaires = new JPanel(new BorderLayout());
		
		//Instanciation du JLabel
		eval = new JLabel("Evaluation", JLabel.CENTER);
		
		// Pour récupérer ce qui a été saisi dans un JTextArea, 
		//cela se fait via la méthode "String monJTextArea.getText()"
		com = new JTextArea("Votre commentaire ..");
		com.setEditable(true);
		com.setLineWrap(true);
		com.setSize(this.getWidth(),this.getHeight());
		
		JScrollPane scrollPane = new JScrollPane(com);
		scrollPane.setVisible(true);
		scrollPane.setWheelScrollingEnabled(true);
		
		//Instanciation des boutons
		validerChoixEvaluation = new JButton("Valider l'evaluation");
		jouerTentative = new JButton("Jouer");
		
		//Ajout des boutons, textArea, checkbox aux panels
		bg.add(acquis);
		bg.add(enCours);
		bg.add(nonAcquis);
		radioBouton.add(acquis);
		radioBouton.add(enCours);
		radioBouton.add(nonAcquis);
		
		note.add(eval);
		note.add(radioBouton);
		note.add(validerChoixEvaluation);
		
		jouer.add(jouerTentative);
		
		commentaires.add(scrollPane, BorderLayout.CENTER);
		
		//Ajout des Jpanels entre eux
		evaluation.add(note, BorderLayout.CENTER);
		evaluation.add(jouer, BorderLayout.EAST);
		
		this.setLayout(new GridLayout(2,1));
		this.add(evaluation);
		this.add(commentaires);
	}

	public JRadioButton getEnCours() {
		return enCours;
	}

	public void setEnCours(JRadioButton enCours) {
		this.enCours = enCours;
	}

	public JRadioButton getAcquis() {
		return acquis;
	}

	public JRadioButton getNonAcquis() {
		return nonAcquis;
	}

	public JButton getValiderChoixEvaluation() {
		return validerChoixEvaluation;
	}

	public JButton getJouerTentative() {
		return jouerTentative;
	}

	public JTextArea getCom() {
		return com;
	}
}
