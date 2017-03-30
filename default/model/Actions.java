package model;
  /* {author=Groupe 5, version=2017}*/

/** 
 *  Cette classe va gerer toutes les actions faites par l'eleve (une image, un code ainsi qu'un commentaire).
 */
public class Actions
{
	/**
	 * Attributs
	*/
  //Represente l'action sous forme de petite phrase correspondant au type d'action effectue par l'eleve. 
  private String codeAction;
  // correspond a la tortue utilisee pour faire l'exercice. 
  private TortueG maTortue;

  /** 
   *  Le constructeur associe le code avec l'image correspondante.
   *  @param code : repr�sente une chaine de caract�re qui correspond � l'action effectu�e
   */
  public void Action(String code)
  {
	  
  }

  /** 
   *  Retourne le code d'une action.
   *  @return une chaine de caract�re correspondant � l'action faite
   */
  public String getCodeAction()
  {
	  return null;
  }

  /** 
   *  Retourne le type de la tortue associee a l'action.
   *  @return le type de la tortue utilis� pour faire l'action
   */
  public TortueG getMaTortue()
  {
	  return null;
  }

  /** 
   *  Permet de refaire une action.
   */
  public void rejouerAction()
  {
	  
  }

  /** 
   *  Red�finition de la methode toString()
   *  Retourne l'action sous forme de texte. 
   *  @return une chaine de caract�re 
   */
  public String toString()
  {
	  return null;
  }

}