package model;
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
   *  @param nomEleve : repr�sente le nom de l'�l�ve 
   *  @param prenomEleve : repr�sente le pr�nom de l'�l�ve
   *  @param classeEleve : repr�sente la classe dans laquelle est l'�l�ve
   */
  public void Eleve(String nomEleve, String prenomEleve, Classe classeEleve)
  {
	  
  }

  /** 
   *  Retourne la classe de l'eleve
   *  @return tous les �l�ments d'une classe (nom, enseignant, liste des �l�ves)
   */
  public Classe getClasse()
  {
	  return null;
  }

  /** 
   *  Ajouter une tentative pour un exercice.
   *  @param uneTentative : repr�sente une tentative en tant que tel (date, exercice, �valuation et commentaire)
   */
  public void addTentative(Tentative uneTentative)
  {
	  
  }

}