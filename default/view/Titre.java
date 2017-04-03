package view;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Titre extends JPanel
{
	private String text;
	private JButton retourMenuPrincipal;
	private Icon quitterIcon;
	
	public Titre(String monText){
		JLabel monTitre = new JLabel(monText);
		quitterIcon = new ImageIcon(this.getClass().getResource("/pictures/quitter.png"));
		retourMenuPrincipal = new JButton (quitterIcon);
		this.setLayout(new GridLayout(1,2));
		this.add(monTitre);
		this.add(retourMenuPrincipal);
	}
	
	public static void main(String[] args) {
        JFrame test = new JFrame();
        test.setContentPane(new Titre("bonjour"));
        test.setVisible(true);
        test.pack();
    }

}