package model;
  /* {author=Groupe 5, version=2017}*/

/** 
 *  Cette classe va gerer toutes les actions faites par l'eleve (une image, un code ainsi qu'un commentaire).
 */
public class Action
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
   *  @param code : represente une chaine de caractere qui correspond � l'action effectu�e
   */
  public Action(String code,TortueG tortue)
  {
	  codeAction=code;
	  maTortue=tortue;
  }

  /** 
   *  Retourne le code d'une action.
   *  @return une chaine de caractere correspondant a l'action faite
   */
  public String getCodeAction()
  {
	  return this.codeAction;
  }

  /** 
   *  Retourne le type de la tortue associee a l'action.
   *  @return le type de la tortue utilise pour faire l'action
   */
  public TortueG getMaTortue()
  {
	  return this.maTortue;
  }

  /** 
   *  Permet de refaire une action.
   */
  public void rejouerAction()
  {
	  
  }

  /** 
   *  Redefinition de la methode toString()
   *  Retourne l'action sous forme de texte. 
   *  @return une chaine de caractere 
   */
  public String toString()
  {
	  return null;
  }

}