package model;
import model.Action;
import java.util.ArrayList;
  /* {author=Groupe 5, version=2017}*/
import java.util.Date;

/** 
 *  Cette classe definit les differentes tentatives d'exercice des eleves.
 *  Cette classe va permettre d'obtenir le nombre ainsi que la date de la tentative.
 *  On pourra egalement obtenir toutes les informations sur l'exercice, l'evaluation et le commentaire faite sur la tentative ainsi que les supprimer.
 *  Il est egalement possible ajouter et supprimer des actions.
 */
public class Tentative
{
/**
 * Attributs
 */
	// date de la tentative realise par l'eleve
	private Date date;
	// exercice associe a la tentative
	private Exercice exercice;
	// evaluation de la tentative.
	private String evaluation;
	//commentaire de la tentative.
	private String commentaire;
	//liste d’actions associee à la tentative
	private ArrayList<Action> listeActions;

  /** 
   *  Constructeur de la classe tentative.
   */
  public Tentative(Date uneDate,Exercice unExercice)
  {
	  date=uneDate;
	  exercice=unExercice;
	  evaluation="";
	  commentaire="";
  }

  /** 
   *  Retourne la date de la tentative.
   */
  public Date getDateTentative()
  {
	  return this.date;
  }

  /** 
   *  Retourne l'exercice associe a la tentative.
   */
  public Exercice getExercice()
  {
	  return this.exercice;
  }
  
  /** 
   *  Retourne la liste d'actions associee a la tentative.
   */
  public ArrayList<Action> getListeActions()
  {
	  return this.listeActions;
  }

  /** 
   *  Retourne la note obtenue avec cette tentative.
   */
  public String getEvaluation()
  {
	  return this.evaluation;
  }

  /** 
   *  Retourne le commentaire associe a la tentative.
   */
  public String getCommentaire()
  {
	  return this.commentaire;
  }

  /** 
   *  Ajoute une action dans la tentative.
   */
  public void ajouterAction(Action uneAction)
  {
	  this.listeActions.add(uneAction);
  }

  /** 
   *  Supprime la derniere action realise de la tentative.
   *  On peut seulement supprimer une action.
   *  Il faut préalablement vérifier qu'une action a deja ete realise pour la tentative
   */
  public void supprimerDerniereAction()
  {
	  if (!listeActions.isEmpty())
	  {
		  Action derniereAction=this.listeActions.get(listeActions.size()-1);
		  this.listeActions.remove(derniereAction);
	  }
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
  public void setEvaluation(String uneEvaluation)
  {
	  this.evaluation=uneEvaluation;
  }

  /** 
   *  L'enseignant redige un commentaire sur la tentative.
   */
  public void setCommentaire(String unCommentaire)
  {
	  this.commentaire=unCommentaire;
  }
}