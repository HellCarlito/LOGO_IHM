import java.util.Vector;

/** 
 *  Cette classe définit les différentes tentatives d’exercice des élèves. Cette classe va permettre d’obtenir le nombre ainsi que la date de la tentative. On pourra également obtenir toutes les informations sur l’exercice, l’évaluation et le commentaire faite sur la tentative ainsi que les supprimer. Il est également possible ajouter et supprimer des actions.
 */
public class Tentative {
  /* {author=Groupe 5, version=2017}*/


  /** 
   *  Correspond à la date où l’élève a effectué une tentative.
   */
  private Date dateTentative;

  /** 
   *  Correspond à l’exercice associé à la tentative.
   */
  private Exercice exercice;

  /** 
   *  Correspond à l’évaluation faite de la tentative.
   */
  private String evaluation;

  /** 
   *  Correspond au commentaire faite de la tentative.
   */
  private String commentaire;

  /** 
   *  Constructeur de la classe tentative.
   */
  public void Tentative() {
  }

  /** 
   *  Retourne la date de la tentative.
   */
  public Date getDateTentative() {
  return null;
  }

  /** 
   *  Retourne l’exercice associé à la tentative.
   */
  public Exercice getExercice() {
  return null;
  }

  /** 
   *  Retourne la note obtenue avec cette tentative.
   */
  public String getEvaluation() {
  return null;
  }

  /** 
   *  Retourne le commentaire associé à la tentative.
   */
  public String getCommentaire() {
  return null;
  }

  /** 
   *  Ajoute une action dans la tentative.
   */
  public void ajouterAction() {
  }

  /** 
   *  Supprime la dernière action réalisée de la tentative. On peut seulement supprimer une action.
   */
  public void supprimerAction() {
  }

  /** 
   *  L’élève pourra re-visualiser la tentative. 
   */
  public void visualiserTentative() {
  }

  /** 
   *  L’enseignant donne une note à la tentative.
   */
  public void setEvaluation() {
  }

  /** 
   *  L’enseignant rédige un commentaire sur la tentative.
   */
  public void setCommentaire() {
  }

}