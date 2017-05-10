package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import view.*;

public class Main extends JFrame
{
	public Main()
	{
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(500, 500);
	    this.setTitle("Projet LOGO"); 
	    
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
