package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import view.*;
import database.DatabaseCreation;

public class Main extends JFrame
{
	public Main()
	{
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(500, 500);
	    this.setTitle("Projet LOGO"); 
	    
	    // Appelle de la classe DatabaseCreation crée une connexion
	 	// avec création d'un nouvelle base de données
	 	DatabaseCreation dbCreate = new DatabaseCreation();
	    
	    //Display the final panel with specifics parameters 
	    this.add(new Menu(this));
	    this.pack();
	    this.setLocationRelativeTo(null);//place in the middle
	    this.setVisible(true);
	}    
	     
	    public static void main(String[] args)
	    {
	        new Main();
	    }
}