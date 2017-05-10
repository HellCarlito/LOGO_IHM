package controler;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import view.*;
import Main.*;

public class Application extends MouseAdapter
{
	// attributes
    private ChoixDebut choixInterface;
    private Main main;
    
    /**
     * The Constructor for the listener
     */
    public Application(ChoixDebut e, Main m)
    {
    	choixInterface=e;
    	main = m;
    }
    
    /**
     * action to do when the mouse flies on buttons
     * This method displays the name of the item in the inventory
     */
     public void mousePressed(MouseEvent evt)
     {
    	 if (evt.getSource() == choixInterface.getEleve())
		 {
    		 JPanel p = new ActionEleve();
    		 main.getContentPane().removeAll();
 	    	 main.getContentPane().add(new Menu(main,true));
 	    	 main.getContentPane().revalidate();
		 }
    	 else if(evt.getSource() == choixInterface.getEnseignant())
    	 {
    		 JPanel p = new ActionEnseignant();
    		 main.getContentPane().removeAll();
 	    	 main.getContentPane().add(new Menu(main,false));
 	    	 main.getContentPane().revalidate();
    	 }
     }
}
