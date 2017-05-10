package Main;

import javax.swing.JFrame;

import database.DatabaseCreation;
import view.Menu;

public class Main {

	public static void main(String[] args) {
		// Appelle de la classe DatabaseCreation crée une connexion
		// avec création d'un nouvelle base de données
		DatabaseCreation dbCreate = new DatabaseCreation();
		// TODO Auto-generated method stub
		 JFrame test = new JFrame();
	        test.setContentPane(new Menu());
	        test.setVisible(true);
	        test.pack();
	}

}
