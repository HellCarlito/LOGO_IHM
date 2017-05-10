package view;
import controler.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import Main.*;


public class Menu extends JPanel
{

	/**
	 * Attributs
	 */
	private JPanel menu; 
	private JButton eleve, enseignant;
	private JPanel tabMenu;
	private JPanel affichageMenu;
	private Application evt;
	private Main main;
	private Titre titreEleve, titreEnseignant;
	private ActionEleve boutonEleve;
	private ActionEnseignant boutonEnseignant;
	 
	/**
	 * Constructeur
	 */
	public Menu(Main m, boolean eleve)
	{
		main = m;
        if (eleve==true)
        {
        	//Initialisation des variables pour la page Eleve
    		boutonEleve = new ActionEleve();
    		titreEleve = new Titre("Eleve");
    		affichageMenu = new Affichage();
        }
        else
        {
        	//Initialisation des variables pour la page Enseignant
    		boutonEnseignant = new ActionEnseignant();	
    		titreEnseignant = new Titre ("Enseignant");
    		affichageMenu = new Affichage();
        }
		
		
		//Initialisation du Panel Menu qui contiendra soit le menu élève, soit le menu enseignant
		menu = new JPanel(new BorderLayout());
		tabMenu = new JPanel(new GridLayout(1,2));
		
		if (eleve==true)
        {
			menu.add(titreEleve,BorderLayout.NORTH);
			tabMenu.add(boutonEleve);
			tabMenu.add(affichageMenu); 
			menu.add(tabMenu,BorderLayout.CENTER);
        }
		else
		{
			menu.add(titreEnseignant,BorderLayout.NORTH);
			tabMenu.add(boutonEnseignant); 
			tabMenu.add(affichageMenu); 
			menu.add(tabMenu,BorderLayout.CENTER);
		}
		
		
		
		
		//si on est sur l'un des comptes (enseignant ou eleve)
		this.setLayout(new GridLayout(0,1));
		this.add(menu);
	}
	
	public JButton getEleve()
	{
		return eleve;
	}
	
	public JButton getEnseignant()
	{
		return enseignant;
	}
}
