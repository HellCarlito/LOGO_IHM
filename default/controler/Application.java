package controler;
import java.awt.event.*;
import java.util.*;
import view.*;
import Main.*;

public class Application extends MouseAdapter
{
	// attributes
    private Menu menuInterface;
    private Main main;
    
    /**
     * The Constructor for the listener
     */
    public Application(Menu e, Main m)
    {
    	menuInterface = e;
    	main = m;
    }
    
    /**
     * action to do when the mouse flies on buttons
     * This method displays the name of the item in the inventory
     */
     public void mousePressed(MouseEvent evt)
     {
    	 if (evt.getSource() == menuInterface.getEleve())
		 {
    		 main.getContentPane().removeAll();
 	    	 main.getContentPane().add(new ActionEleve());
 	    	 main.getContentPane().revalidate();
		 }
    	 else if(evt.getSource() == menuInterface.getEnseignant())
    	 {
    		 main.getContentPane().removeAll();
 	    	 main.getContentPane().add(new ActionEnseignant());
 	    	 main.getContentPane().revalidate();
    	 }
     }
}
