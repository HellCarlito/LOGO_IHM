package view;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import model.*;

public class ExerciceInterface extends JPanel
{

	/**
	 * Constructeur
	 */
	public ExerciceInterface(TortueG uneTortue)
	{
		JPanel code = new JPanel();
		code.add(new Code());
		JPanel gauche = new JPanel(new GridLayout (0,1));
		gauche.add(new DessinExercice());
		gauche.add(new ZoneBouton(uneTortue));
		
		this.setLayout(new BorderLayout());
		this.add(gauche,BorderLayout.CENTER);
		this.add(code,BorderLayout.CENTER);
	}

public static void main(String[] args)
{
	TortueG uneTortue= new TortueG();
    JFrame test = new JFrame();
    test.setContentPane(new ExerciceInterface(uneTortue));
    test.setVisible(true);
    test.pack();
}

}