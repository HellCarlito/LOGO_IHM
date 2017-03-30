 /* {author=Groupe 5, version=2017}*/

/** 
 *  Cette classe va permettre la gestion des eleves d'une classe et des tentatives qu'ils auront fait.
 *  On pourra voir les differentes tentatives de l'eleve, et la classe a laquelle il est associe (si besoin, pouvoir egalement changer l'eleve de classe).
 */
public class Eleve extends Utilisateur
{
 /**
  * Attributs
  */
	// le prenom de l'eleve
	private String nom;
	// le nom de l'eleve
	private String prenom;
	// la classe de l'eleve
	private Classe classe;

  /** 
   *  Creation d'un eleve. L'eleve aura un nom, un prenom et la classe a laquelle l'eleve est associe.
   *  @param nomEleve : représente le nom de l'élève 
   *  @param prenomEleve : représente le prénom de l'élève
   *  @param classeEleve : représente la classe dans laquelle est l'élève
   */
  public void Eleve(String nomEleve, String prenomEleve, Classe classeEleve)
  {
	  
  }

  /** 
   *  Retourne la classe de l'eleve
   *  @return tous les éléments d'une classe (nom, enseignant, liste des élèves)
   */
  public Classe getClasse()
  {
	  return null;
  }

  /** 
   *  Ajouter une tentative pour un exercice.
   *  @param uneTentative : représente une tentative en tant que tel (date, exercice, évaluation et commentaire)
   */
  public void addTentative(Tentative uneTentative)
  {
	  
  }

}