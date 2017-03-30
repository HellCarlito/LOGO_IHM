
/**
 * Tortue LOGO capable de faire de la vitesse
 * 
 * @author Patrick Girard 
 * @version fevrier 2017
 */
public class TortueRapide extends TortueG
{
    // Vitesse de la tortue
    private int vitesse;

    /**
     * Constructeur, initialisation ˆ 1 de la vitesse
     */
    public TortueRapide()
    {
        super();
        vitesse = 1;
    }

    /**
     * Redefinition de la methode avancer, pour tenir compte de la vitesse
     */
    public void avancer()
    {   for (int v=vitesse; v>0; v--)
            super.avancer();
    }
    
    /**
     * Changer la vitesse
     *
     * @param  v   nouvelle vitesse
     */
    public void setVitesse(int v)
    {
         vitesse = v;
    }
    
    /**
     * Accesseur de la vitesse
     *
     * @return la vitesse actuelle de la tortue
     */
    public int getVitesse() {
        return vitesse;
    }
    
    /**
     * Methode accelerer : incremente de 1 la vitesse de la tortue
     *
     */
    public void accelerer()
    {
        vitesse++;
    }
    
    /**
     * Methode ralentir : decremente de 1 la vitesse de la tortue
     *
     */
    public void ralentir()
    {
        if (vitesse>0) vitesse--;
    }
    
}
