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
   */
  public void Enseignant(String nom, String prenom)
  {
	  
  }

  /** 
   *  Ajouter une classe d'eleves a un enseignant. 
   *  Verifier que la classe n'existe pas deja.
   *  Si oui, on n'ajoute pas la classe.
   *  Si non, on ajoute la classe.
   */
  public void ajouterClasse(Classe classe)
  {
	  
  }

  /** 
   *  Supprimer une classe d'eleves a un enseignant.
   */
  public void supprimerClasse(Classe classe)
  {
	  
  }

}