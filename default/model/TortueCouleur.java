package model;
 
/**
 * Tortue LOGO capable d'ecrire en couleur
 * Seules les couleurs suivantes sont autorisees :
 *  "black", "red", "blue", "green", "yellow" , "magenta"
 *  Si la couleur demandee est differente, la tortue ecrit en noir
 *  
 * @author Patrick Girard 
 * @version fevrier 2017
 */ 


public class TortueCouleur extends TortueG {

    // Couleurs
    private static final String lesCouleurs[] = { "black", "red", "blue", "green", "yellow" , "magenta" };
    
    /**
     * Constructeur par defaut, la tortue ecrit en noir
     *
     */
    public TortueCouleur() {
        super();
    }

    
    /**
     * Constructeur permettant de specifier la couleur
     *
     * @param coul la couleur demandee
     */
    public TortueCouleur(String coul) {
        super();
        couleurTrace = rendCouleur(coul);
    }
    
    /**
     * Methode setCouleur : change la couleur de la tortue
     *
     * @param coul la couleur demandee
     */
    public void setCouleur(String coul){
        couleurTrace = rendCouleur(coul);
    }
    
    /**
     * Accesseur de la couleur
     *
     * @return la couleur de la tortue
     */
    public String getCouleur() {
        return couleurTrace;
    }
    
    /**
     * Methode rendCouleur : permet de verifier que la couleur demandee est correcte
     * rend "black" sinon
     *
     * @param coul la couleur demandee
     * @return la couleur verifiee
     */
    private String rendCouleur(String coul) {
        for (int i=0; i<lesCouleurs.length; i++)
            if (coul.equalsIgnoreCase(lesCouleurs[i]))
              return coul.toLowerCase();
        return "black";
    }

}