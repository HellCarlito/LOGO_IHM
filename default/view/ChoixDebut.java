package view;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Main.Main;
import controler.*;

public class ChoixDebut extends JPanel
{
	private JPanel menu; 
	private JButton eleve, enseignant;
	private JPanel tabMenuEleve, tabMenuEnseignant;
	private JPanel affichageMenuEleve, affichageMenuEnseignant;
	private Application evt;
	private Main main;
	 
	/**
	 * Constructeur
	 */
	public ChoixDebut(Main m)
	{
		main = m;
		eleve = new JButton ("Eleve");
		enseignant = new JButton ("Enseignant");
		
		//Listeners for buttons action
        evt = new Application(this,main);
        eleve.addMouseListener(evt);
        enseignant.addMouseListener(evt);
        this.setLayout(new GridLayout(0,1));
		this.add(eleve);
		this.add(enseignant);
	}
	
	public JButton getEleve()
	{
		return eleve;
	}
	
	public JButton getEnseignant()
	{
		return enseignant;
	}
	
	public static void main(String[] args) {
        JFrame test = new JFrame();
        //test.setContentPane(new ChoixDebut());
        test.setVisible(true);
        test.pack();
    }

}
