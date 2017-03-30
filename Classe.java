import java.util.Vector;

/** 
 *   Gestion de classes d’élèves. On va pouvoir obtenir le nom de la classe, les élèves qu’elle contient, ainsi que les noms et prénoms de ces élèves. On pourra également ajouter et supprimer un exercice.
 */
public class Classe {
  /* {author=Groupe 5, version=2017}*/


  /** 
   *  Il s’agit du nom de la classe
   */
  private String nomClasse;

  /** 
   *  L’enseignant associé à la classe
   */
  private String enseignant;

  /** 
   *  Constructeur de classe, une classe possède un nom et l’enseignant associé.
   */
  public void Classe( nomClasse,  enseignant) {
  }

  /** 
   *  Retourne le nom de la classe.
   */
  public String getNomClasse() {
  return null;
  }

  /** 
   *  Ajoute un élève dans la classe.
   */
  public void ajouterEleve( eleve) {
  }

  /** 
   *  Ajoute un exercice à la classe. Il ne faut pas ajouter deux fois le même  exercice.
   */
  public void ajouterExercice( exercice) {
  }

  /** 
   *  Supprime un exercice à la classe. On peut supprimer un exercice seulement s’il n’y a pas déjà de tentative.
   */
  public void supprimerExercice( exercice) {
  }

  /** 
   *  Retourne l’enseignant de la classe.
   */
  public enseignant getEnseignant() {
  return null;
  }

}