import java.util.Vector;

/** 
 *  Cette classe va permettre la gestion des élèves d’une classe et des tentatives qu’ils auront fait. On pourra voir les différentes tentatives de l’élève, et la classe à laquelle il est associé (si besoin, pouvoir également changer l’élève de classe).
 */
public class Eleve extends Utilisateur {
  /* {author=Groupe 5, version=2017}*/


  /** 
   *   Classe auquel l’élève appartient.
   */
  private Classe classe;

  /** 
   *  Création d’un élève. L’élève aura chacun un nom, un prénom et la classe à laquelle l’élève est associé.
   */
  public void Eleve( nom,  prenom,  Classe) {
  }

  /** 
   *  Retourne la classe de l’élève.
   */
  public String getClasse() {
  return null;
  }

  /** 
   *  Ajouter une tentative pour un exercice.
   */
  public void addTentative( Tentative) {
  }

}