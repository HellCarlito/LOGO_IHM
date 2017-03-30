/** 
 *  Cette classe va permettre la gestion des eleves d'une classe et des tentatives qu'ils auront fait.
 *  On pourra voir les differentes tentatives de l'eleve, et la classe a laquelle il est associe (si besoin, pouvoir egalement changer l'eleve de classe).
 */
public class Eleve extends Utilisateur
{
  /* {author=Groupe 5, version=2017}*/

	// le prenom de l'eleve
	private String nom;
	// le nom de l'eleve
	private String prenom;
	// la classe de l'eleve
	private Classe classe;

  /** 
   *  Creation d'un eleve. L'eleve aura un nom, un prenom et la classe a laquelle l'eleve est associe.
   */
  public void Eleve(String nomEleve, String prenomEleve, Classe classeEleve)
  {
	  
  }

  /** 
   *  Retourne la classe de l'eleve
   */
  public Classe getClasse()
  {
	  return null;
  }

  /** 
   *  Ajouter une tentative pour un exercice.
   */
  public void addTentative(Tentative uneTentative)
  {
	  
  }

}