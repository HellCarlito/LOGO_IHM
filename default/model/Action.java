package model;
  /* {author=Groupe 5, version=2017}*/

import javax.swing.*;

/** 
 *  Cette classe va gerer toutes les actions faites par l'eleve (une image, un code ainsi qu'un commentaire).
 */
public class Action
{
	/**
	 * Attributs
	*/
	//Represente l'icone de l'action
	private Icon monIcone;
	//Represente l'action sous forme de petite phrase correspondant au type d'action effectue par l'eleve. 
  private String codeAction;

  /** 
   *  Le constructeur associe le code avec l'image correspondante.
   *  @param code : represente une chaine de caractere qui correspond ï¿½ l'action effectuï¿½e
   */
  public Action(Icon icone, String code)
  {
	  monIcone = icone;
	  codeAction=code;
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
   * Retourne l'icone de l'action
   * @return une image correspondant à l'action faite
   */
  public Icon getIcone()
  {
	  return this.monIcone;
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