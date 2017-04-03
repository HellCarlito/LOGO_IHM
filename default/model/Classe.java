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
  private ArrayList<Exercice> exercices;
  //Liste des tentatives de la classe
  private ArrayList<Tentative> tentatives;
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
  
  public ArrayList<Eleve> getEleve()
  {
	  ArrayList<Eleve> eleve = new ArrayList<Eleve>();
	  return eleve;
  }
  
  public ArrayList<Exercice> getExercice()
  {
	  ArrayList<Exercice> exercice = new ArrayList<Exercice>();
	  return exercice;
  }
  
  public ArrayList<Tentative> getTentative()
  {
	  ArrayList<Tentative> tentative = new ArrayList<Tentative>();
	  return tentative;
  }

  /** 
   *  Ajoute un eleve dans la classe.
   *  @param eleve : represente l'eleve en tant que tel (nom, prenom, classe)
   */
  public void ajouterEleve(Eleve eleve)
  {
	boolean isPresent = false; 
	for (Eleve unEleve:this.getEleve()){
		if (unEleve == eleve){
			isPresent = true;
		}
	}
	
	if (isPresent = false){
		this.compositionClasse.add(eleve);
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
	  boolean isPresent = false; 
		for (Exercice unExo:this.getExercice()){
			if (unExo == exercice){
				isPresent = true;
			}
		}
		
		if (isPresent = false){
			this.exercices.add(exercice);
		}
		else System.out.print("L'eleve existe deja dans cette classe ");
  }

  /** 
   *  Supprime un exercice a la classe. 
   *  On peut supprimer un exercice seulement s'il n'y a pas deja de tentative.
   *  @param exercice : represente un exercice en tant que tel (nom, tortue, image)
   */
  public void supprimerExercice(Exercice exercice)
  {
	 boolean fait = false;
	 for (Exercice unExo: this.getExercice())
	 {
		 for (Tentative uneTentative:this.getTentative())
		 {
			 if (uneTentative != null)
			 {
				 fait = true;
			 }
		 }
	 }
	 
	 if (fait = false)
	 {
	  this.exercices.remove(exercice);
	 }
	 else System.out.print("L'exercice a deja ete effectue par des eleves. Il ne peut pas etre supprimer ! ");
  }

  /** 
   *  Retourne l'enseignant de la classe.
   *  @return toutes les donnees de l'enseignant (nom, prenom, liste de ses classes)
   */
  public Enseignant getEnseignant()
  {
	  return enseignant;
  }

}