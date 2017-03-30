/** 
 *   Gestion de classes d'eleves. On va pouvoir obtenir le nom de la classe, les eleves qu'elle contient, ainsi que les noms et prenoms de ces eleves. 
 *   On pourra egalement ajouter et supprimer un exercice.
 */
public class Classe
{
  /* {author=Groupe 5, version=2017}*/
	
  //nom de la classe
  private String nomClasse;
  //L'enseignant associee a la classe
  private Enseignant enseignant;

  /** 
   *  Constructeur de classe, une classe possede un nom et l'enseignant associee.
   */
  public void Classe(String nom, Enseignant enseignantClasse)
  {
	  
  }

  /** 
   *  Retourne le nom de la classe.
   */
  public String getNomClasse()
  {
	  return null;
  }

  /** 
   *  Ajoute un eleve dans la classe.
   */
  public void ajouterEleve(Eleve eleve)
  {
	  
  }

  /** 
   *  Ajoute un exercice a la classe. 
   *  Il ne faut pas ajouter deux fois le meme exercice.
   */
  public void ajouterExercice(Exercice exercice)
  {
	  
  }

  /** 
   *  Supprime un exercice a la classe. 
   *  On peut supprimer un exercice seulement s'il n'y a pas deja de tentative.
   */
  public void supprimerExercice(Exercice exercice)
  {
	  
  }

  /** 
   *  Retourne l'enseignant de la classe.
   */
  public Enseignant getEnseignant()
  {
	  return null;
  }

}