package controler;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import view.*;

public class ExerciceEleve
{
	// attributes
    private ExerciceInterface exerciceInterface;
    
    /**
     * The Constructor for the listener
     */
    public ExerciceEleve(ExerciceInterface e)
    {
    	exerciceInterface = e;
    }
    
    /**
     * action to do when the mouse flies on buttons
     * This method displays the name of the item in the inventory
     */
     public void mouseEntered(MouseEvent evt)
     {
    	 if (evt.getSource() == exerciceInterface.getPanelBoutons().getPanelDeplacement().getEcrire())
		 {
    		 
		 }
    	 else if(evt.getSource() == exerciceInterface.getPanelBoutons().getPanelDeplacement().getNePasEcrire())
    	 {
    		 
    	 }
    	 else if(evt.getSource() == exerciceInterface.getPanelBoutons().getPanelDeplacement().getTourner())
    	 {
    		 
    	 }
    	 else if(evt.getSource() == exerciceInterface.getPanelBoutons().getPanelDeplacement().getAvancer())
    	 {
    		 
    	 }
    	 else if(evt.getSource() == exerciceInterface.getPanelBoutons().getPanelGestion().getValider())
    	 {
    		 
    	 }
    	 else if(evt.getSource() == exerciceInterface.getPanelBoutons().getPanelGestion().getQuitter())
    	 {
    		 
    	 }
    	 else if(evt.getSource() == exerciceInterface.getPanelBoutons().getPanelGestion().getUndo())
    	 {
    		 
    	 }
    	 else if(evt.getSource() == exerciceInterface.getPanelBoutons().getPanelGestion().getRedo())
    	 {
    		 
    	 }
     }

}
