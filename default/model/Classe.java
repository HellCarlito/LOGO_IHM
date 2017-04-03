package model;
  /* {author=Groupe 5, version=2017}*/

import java.util.ArrayList;

/** 
 *   Gestion de classes d'eleves. On va pouvoir obtenir le nom de la classe, les eleves qu'elle contient, ainsi que les noms et prenoms de ces eleves. 
 *   On pourra egalement ajouter et supprimer un exercice.
 */
public class Classe
{
/**
 * Attributs	
 */
  //nom de la classe
  private String nomClasse;
  //L'enseignant associee a la classe
  private Enseignant enseignant;
  //Liste des eleves de la classe
  private ArrayList<Eleve> compositionClasse;
  //Liste des exercices de la classe
  private ArrayList<Exercice> exercice;
  //Nombre d'eleves dans la classe
  private int nbEleve;

  /** 
   *  Constructeur de classe, une classe possede un nom et l'enseignant associee.
   *  @param nom : correspond au nom de la classe
   *  @param enseignantClasse : represente l'enseignant en tant que tel (nom, prenom)
   */
  public Classe(String nom, Enseignant enseignantClasse, int nbE)
  {
	  nomClasse= nom;
	  enseignant = enseignantClasse;
	  nbEleve = nbE;
  }

  /** 
   *  Retourne le nom de la classe.
   *  @return une chaine de caractere correspondant au nom de la classe
   */
  public String getNomClasse()
  {
	  return nomClasse;
  }

  /** 
   *  Ajoute un eleve dans la classe.
   *  @param eleve : represente l'eleve en tant que tel (nom, prenom, classe)
   */
  public void ajouterEleve(Eleve eleve)
  {
	int n = 0; 
	for (int i=1; i <= nbEleve; i++){
		if ((Eleve(i).prenom = eleve.getPrenom()) && (Eleve(i).nom = eleve.getNom())){
			n=n+1;
		}
	}
	
	if (n != nbEleve){
		eleve = new Eleve();
	}
	else System.out.print("L'eleve existe deja dans cette classe ");
  }

  /** 
   *  Ajoute un exercice a la classe. 
   *  Il ne faut pas ajouter deux fois le meme exercice.
   *  @param exercice : represente un exercice en tant que tel (nom, tortue, image)
   */
  public void ajouterExercice(Exercice exercice)
  {
	  
  }

  /** 
   *  Supprime un exercice a la classe. 
   *  On peut supprimer un exercice seulement s'il n'y a pas deja de tentative.
   *  @param exercice : repr�sente un exercice en tant que tel (nom, tortue, image)
   */
  public void supprimerExercice(Exercice exercice)
  {
	  
  }

  /** 
   *  Retourne l'enseignant de la classe.
   *  @return toutes les donn�es de l'enseignant (nom, pr�nom, liste de ses classes)
   */
  public Enseignant getEnseignant()
  {
	  return enseignant;
  }

}