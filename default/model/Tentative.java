package model;
  /* {author=Groupe 5, version=2017}*/

import java.util.Date;

/** 
 *  Cette classe definit les differentes tentatives d'exercice des eleves.
 *  Cette classe va permettre d'obtenir le nombre ainsi que la date de la tentative.
 *  On pourra egalement obtenir toutes les informations sur l'exercice, l'�valuation et le commentaire faite sur la tentative ainsi que les supprimer.
 *  Il est egalement possible ajouter et supprimer des actions.
 */
public class Tentative
{
/**
 * Attributs
 */
	// date de la tentative realise par l'eleve
  private Date dateTentative;
  // exercice associe a la tentative
  private Exercice exercice;
  // evaluation de la tentative.
  private String evaluation;
  //commentaire de la tentative.
  private String commentaire;

  /** 
   *  Constructeur de la classe tentative.
   */
  public void Tentative()
  {
	  
  }

  /** 
   *  Retourne la date de la tentative.
   */
  public Date getDateTentative()
  {
	  return null;
  }

  /** 
   *  Retourne l'exercice associe a la tentative.
   */
  public Exercice getExercice()
  {
	  return null;
  }

  /** 
   *  Retourne la note obtenue avec cette tentative.
   */
  public String getEvaluation()
  {
	  return null;
  }

  /** 
   *  Retourne le commentaire associe a la tentative.
   */
  public String getCommentaire()
  {
	  return null;
  }

  /** 
   *  Ajoute une action dans la tentative.
   */
  public void ajouterAction()
  {
	  
  }

  /** 
   *  Supprime la derniere action realise de la tentative.
   *  On peut seulement supprimer une action.
   */
  public void supprimerAction()
  {
	  
  }

  /** 
   *  L'eleve pourra re-visualiser la tentative. 
   */
  public void visualiserTentative()
  {
	  
  }

  /** 
   *  L'enseignant donne une note a la tentative.
   */
  public void setEvaluation()
  {
	  
  }

  /** 
   *  L'enseignant redige un commentaire sur la tentative.
   */
  public void setCommentaire()
  {
	  
  }
}