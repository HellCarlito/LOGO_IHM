package controler;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import view.*;

public class ExerciceEleve
{
	// attributes
    private ExerciceInterface exerciceEleveInterface;
    
    /**
     * The Constructor for the listener
     */
    public ExerciceEleve(ExerciceInterface e)
    {
    	exerciceEleveInterface = e;
    }
    
    /**
     * action to do when the mouse flies on buttons
     * This method displays the name of the item in the inventory
     */
     public void mouseEntered(MouseEvent evt)
     {
    	 if (evt.getSource() == exerciceEleveInterface.getPanelBoutons().getPanelDeplacement().getEcrire())
		 {
    		 
		 }
    	 else if(evt.getSource() == exerciceEleveInterface.getPanelBoutons().getPanelDeplacement().getNePasEcrire())
    	 {
    		 
    	 }
    	 else if(evt.getSource() == exerciceEleveInterface.getPanelBoutons().getPanelDeplacement().getTourner())
    	 {
    		 
    	 }
    	 else if(evt.getSource() == exerciceEleveInterface.getPanelBoutons().getPanelDeplacement().getAvancer())
    	 {
    		 
    	 }
    	 else if(evt.getSource() == exerciceEleveInterface.getPanelBoutons().getPanelGestion().getValider())
    	 {
    		 
    	 }
    	 else if(evt.getSource() == exerciceEleveInterface.getPanelBoutons().getPanelGestion().getQuitter())
    	 {
    		 
    	 }
    	 else if(evt.getSource() == exerciceEleveInterface.getPanelBoutons().getPanelGestion().getUndo())
    	 {
    		 
    	 }
    	 else if(evt.getSource() == exerciceEleveInterface.getPanelBoutons().getPanelGestion().getRedo())
    	 {
    		 
    	 }
     }

}
