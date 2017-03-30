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
   *  @param nom : correspond au nom de la classe
   *  @param enseignantClasse : représente l'enseignant en tant que tel (nom, prénom)
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
   *  @param eleve : représente l'élève en tant que tel (nom, prénom, classe)
   */
  public void ajouterEleve(Eleve eleve)
  {
	  
  }

  /** 
   *  Ajoute un exercice a la classe. 
   *  Il ne faut pas ajouter deux fois le meme exercice.
   *  @param exercice : représente un exercice en tant que tel (nom, tortue, image)
   */
  public void ajouterExercice(Exercice exercice)
  {
	  
  }

  /** 
   *  Supprime un exercice a la classe. 
   *  On peut supprimer un exercice seulement s'il n'y a pas deja de tentative.
   *  @param exercice : représente un exercice en tant que tel (nom, tortue, image)
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