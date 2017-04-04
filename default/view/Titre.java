package view;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Titre extends JPanel
{
	/**
	 * Attributes
	 */
	private JButton retourMenuPrincipal;
	private Icon quitterIcon;
	
	/**
	 * Classe permettant l'affichage du titre de la page où l'on se trouve avec un bouton retour en arrière sur la droite
	 * @param monText => texte correspondant au titre de la page où l'on se trouve
	 * @return un Panel
	 */
	public JPanel Titre(String monText){

		JLabel monTitre = new JLabel(monText,JLabel.CENTER);
		quitterIcon = new ImageIcon(this.getClass().getResource("/pictures/quitter.png"));
		retourMenuPrincipal = new JButton (quitterIcon);
		
		retourMenuPrincipal.setBackground(Color.white);
		this.setLayout(new BorderLayout());
		this.add(monTitre,BorderLayout.CENTER);
		this.add(retourMenuPrincipal,BorderLayout.EAST);
		
		return this;
	}

	public JButton getQuitterMenu(){
		return  retourMenuPrincipal;
	}
}