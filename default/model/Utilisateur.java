package model;
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
   *  @param nom : correspond au nom de l'utilisateur (soit l'enseignant soit l'eleve)
   *  @param prenom : correspond au pr�nom de l'utilisateur (soit l'enseignant soit l'eleve)
   */
  public Utilisateur(String nom, String prenom)
  {
	  this.nom=nom;
	  this.prenom=prenom;
  }

  /** 
   *  Retourne le nom de l'utilisateur
   */
  public String getNom()
  {
	  return this.nom;
  }

  /** 
   *  Retourne le prenom de l'utilisateur
   */
  public String getPrenom()
  {
	  return this.prenom;
  }
}