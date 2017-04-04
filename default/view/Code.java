package view;
import java.awt.GridLayout;
import javax.swing.*;
import model.*;
import model.Action;

public class Code extends JPanel
{	
	
	public Code()
	{
		this.setLayout(new GridLayout(0,1));
	}
	
	public void ajouterAction(Action uneAction)
	{
		JLabel ligneActionIcone=new JLabel(uneAction.getIcone());
		JLabel ligneActionTexte=new JLabel(uneAction.getCodeAction());
		JPanel ligneAction=new JPanel(new GridLayout(1,0));
		ligneAction.add(ligneActionIcone);
		ligneAction.add(ligneActionTexte);
		this.add(ligneAction);
	}
}
