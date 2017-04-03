package model;
import java.util.ArrayList;
/** 
 *  Cette classe va permettre la gestion des enseignants et de leurs classes respectives. 
 *  On va pouvoir obtenir la liste des classes associees a l'enseignant, ajouter une classe ou en supprimer.
 */
public class Enseignant extends Utilisateur
{
  /* {author=Groupe 5, version=2017}*/
	// le prenom de l'enseignant
	private String nom;
	// le nom de l'enseignant
	private String prenom;
	// les classes de l'enseignant
	private ArrayList<Classe> classes;
	
  /** 
   *  Creation d'un enseignant.
   *  Chaque enseignant possede un nom, un prenom
   *  
   *  @param nom correspond au nom de l'enseignant
   *  @param prenom correspond au prenom de l'enseignant
   */
  public Enseignant(String monNom, String monPrenom)
  {
	  super(monNom,monPrenom);
  }

  /** 
   *  Ajouter une classe d'eleves a un enseignant. 
   *  Verifier que la classe n'existe pas deja.
   *  Si oui, on n'ajoute pas la classe.
   *  Si non, on ajoute la classe.
   *  
   *  @param classe correspond a une classe donnee
   */
  public void ajouterClasse(Classe classe)
  {
	  Boolean present=false;
	  for(Classe uneClasse:this.getClasses()){
		  if (uneClasse==classe){
			  present=true;
		  }
	  }
	  if (present==false){
		  this.classes.add(classe);
	  }
  }

  /** 
   *  Supprimer une classe d'eleves a un enseignant.
   *  
   *  @param classe correspond a une classe donnee
   */
  public void supprimerClasse(Classe classe)
  {
	  this.classes.remove(classe);
  }

  /** 
   *  retourne la liste des classes d'un enseignant
   *  
   */
  public ArrayList<Classe> getClasses() {
	return classes;
  }

	}