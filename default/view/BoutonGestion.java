package view;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class BoutonGestion extends JPanel
{
	private JButton valider,undo,redo,quitter;
	private Icon validerIcon,undoIcon,redoIcon,quitterIcon;
	
	public BoutonGestion()
	{
		validerIcon = new ImageIcon(this.getClass().getResource("/pictures/valider.png"));
		valider = new JButton (validerIcon);
		valider.setBackground(Color.white);
		undoIcon = new ImageIcon(this.getClass().getResource("/pictures/undo.png"));
		undo = new JButton (undoIcon);
		undo.setBackground(Color.white);
		redoIcon = new ImageIcon(this.getClass().getResource("/pictures/redo.png"));
		redo = new JButton (redoIcon);
		redo.setBackground(Color.white);
		quitterIcon = new ImageIcon(this.getClass().getResource("/pictures/quitter.png"));
		quitter = new JButton (quitterIcon);
		quitter.setBackground(Color.white);
		this.setLayout(new GridLayout (1,0));
		this.add(valider);
		this.add(undo);
		this.add(redo);
		this.add(quitter);
	}
	
	public static void main(String[] args) {
        JFrame test = new JFrame();
        test.setContentPane(new BoutonGestion());
        test.setVisible(true);
        test.pack();
    }
	
	public JButton getValider()
	{
		return valider;
	}
	
	public JButton getUndo()
	{
		return undo;
	}
	
	public JButton getRedo()
	{
		return redo;
	}
	
	public JButton getQuitter()
	{
		return quitter;
	}
}
