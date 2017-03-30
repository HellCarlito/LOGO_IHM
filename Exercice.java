import javax.swing.*;


/** 
 *  Cette classe permet a l'enseignant de construire un exercice.
 *  Cette exercice pourra etre utilisee par tous les eleves des classes de l'enseignant et par d'autres enseignants.
 */
public class Exercice
{
  /* {author=Groupe 5, version=2017}*/

  // nom de l'exercice cree par l'enseignant.
  private String nomExercice;
  // type de tortue utilise pour effectuer l'exercice (tortue classique, couleur ou rapide).
  private TortueG Tortue;
  // image de l'exercice à reproduire
  private Icon imageExercice;

  /** 
   *  Constructeur de la classe Exercice.
   *  Un exercice possede un nom, un type de tortue ainsi qu'une image.
   */
  public void Exercice(String nomExercice, TortueG maTortue, Icon imageExercice)
  {
	  
  }

  /** 
   *  Retourne le nom de l'exercice.
   */
  public String getNomExercice()
  {
	  return null;
  }

  /** 
   *  Modifie un exercice (seulement si aucun eleve ne l'ai deja fait).
   */
  public void setExercice()
  {
	  
  }
}