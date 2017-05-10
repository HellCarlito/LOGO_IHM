package controler;
import java.awt.event.MouseEvent;
import view.Menu;

public class Application
{
	// attributes
    private Menu menuInterface;
    
    /**
     * The Constructor for the listener
     */
    public Application(Menu e)
    {
    	menuInterface = e;
    }
    
    /**
     * action to do when the mouse flies on buttons
     * This method displays the name of the item in the inventory
     */
     public void mouseEntered(MouseEvent evt)
     {
    	 if (evt.getSource() == menuInterface.getEleve())
		 {
    		 
		 }
    	 else if(evt.getSource() == menuInterface.getEnseignant())
    	 {
    		 
    	 }
     }
}
