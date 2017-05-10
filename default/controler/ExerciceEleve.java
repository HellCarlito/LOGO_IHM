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
    	 if (evt.getSource() == exerciceEleveInterface.getPanelBoutonsEleve().getPanelDeplacement().getEcrire())
		 {
    		 exerciceEleveInterface.getMonExercice().getTortue().tracer(true);
		 }
    	 else if(evt.getSource() == exerciceEleveInterface.getPanelBoutonsEleve().getPanelDeplacement().getNePasEcrire())
    	 {
    		 exerciceEleveInterface.getMonExercice().getTortue().tracer(false);
    	 }
    	 else if(evt.getSource() == exerciceEleveInterface.getPanelBoutonsEleve().getPanelDeplacement().getTourner())
    	 {
    		 exerciceEleveInterface.getMonExercice().getTortue().tourner();
    	 }
    	 else if(evt.getSource() == exerciceEleveInterface.getPanelBoutonsEleve().getPanelDeplacement().getAvancer())
    	 {
    		 exerciceEleveInterface.getMonExercice().getTortue().avancer();
    	 }
    	 else if(evt.getSource() == exerciceEleveInterface.getPanelBoutonsEleve().getPanelGestion().getValider())
    	 {
    		 
    	 }
    	 else if(evt.getSource() == exerciceEleveInterface.getPanelBoutonsEleve().getPanelGestion().getQuitter())
    	 {
    		 
    	 }
    	 else if(evt.getSource() == exerciceEleveInterface.getPanelBoutonsEleve().getPanelGestion().getUndo())
    	 {
    		 
    	 }
    	 else if(evt.getSource() == exerciceEleveInterface.getPanelBoutonsEleve().getPanelGestion().getRedo())
    	 {
    		 
    	 }
     }

}
