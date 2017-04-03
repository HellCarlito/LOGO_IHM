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
		JLabel monTitre = new JLabel(monText,JLabel.CENTER);
		quitterIcon = new ImageIcon(this.getClass().getResource("/pictures/quitter.png"));
		retourMenuPrincipal = new JButton (quitterIcon);
		retourMenuPrincipal.setBackground(Color.white);
		this.setLayout(new BorderLayout());
		this.add(monTitre,BorderLayout.CENTER);
		this.add(retourMenuPrincipal,BorderLayout.EAST);
	}
	
	public static void main(String[] args) {
        JFrame test = new JFrame();
        test.setContentPane(new Titre("Enseignant"));
        test.setVisible(true);
        test.pack();
    }

}