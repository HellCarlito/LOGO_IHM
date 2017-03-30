  /* {author=Groupe 5, version=2017}*/

/** 
 *  Cette classe va gerer les utilisateurs, qu'ils soient des enseignants ou des eleves.
 *  Cette classe est une classe abstraite.
 */
public abstract class Utilisateur
{
/**
 * Attributs
 */
  // nom de l'utilisateur
  private String nom;
  //prenom de l'utilisateur
  private String prenom;

  /** 
   *  Construit un utilisateur avec son nom et son prenom
   *  @param nom : correspond au nom de l'utilisateur (soit l'enseignant soit l'élève)
   *  @param prenom : correspond au prénom de l'utilisateur (soit l'enseignant soit l'élève)
   */
  public void Utilisateur(String nom, String prenom)
  {
	  
  }

  /** 
   *  Retourne le nom de l'utilisateur
   */
  public String getNom()
  {
	  return null;
  }

  /** 
   *  Retourne le prenom de l'utilisateur
   */
  public String getPrenom()
  {
	  return null;
  }
}