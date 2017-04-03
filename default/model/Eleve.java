package model;

import java.util.ArrayList;

/* {author=Groupe 5, version=2017}*/

/**
 * Cette classe va permettre la gestion des eleves d'une classe et des
 * tentatives qu'ils auront fait. On pourra voir les differentes tentatives de
 * l'eleve, et la classe a laquelle il est associe (si besoin, pouvoir egalement
 * changer l'eleve de classe).
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
	// variable qui stocke les tentatives de l'eleve
	private ArrayList<Tentative> tentativeEleve;

	/**
	 * Creation d'un eleve. L'eleve aura un nom, un prenom et la classe a
	 * laquelle l'eleve est associe.
	 * 
	 * @param nomEleve
	 *            : represente le nom de l'eleve
	 * @param prenomEleve
	 *            : represente le prenom de l'eleve
	 * @param classeEleve
	 *            : represente la classe dans laquelle est l'eleve
	 */
	public Eleve(String nomEleve, String prenomEleve, Classe classeEleve)
	{
		super(nomEleve,prenomEleve);
		this.classe = classeEleve;
	}

	/**
	 * Retourne la classe de l'eleve
	 * 
	 * @return tous les elements d'une classe (nom, enseignant, liste des
	 *         eleves)
	 */
	public Classe getClasse()
	{
		return classe;
	}

	/**
	 * Ajouter une tentative pour un exercice.
	 * 
	 * @param uneTentative
	 *            : represente une tentative en tant que tel (date, exercice,evaluation et commentaire)
	 */
	public void addTentative(Tentative uneTentative)
	{
		this.tentativeEleve.add(uneTentative);
	}

	/**
	 * Retourne la tentative des eleves
	 * 
	 * @return un arrayList d'une tentative
	 */
	public ArrayList<Tentative> getTentativeEleves()
	{
		return tentativeEleve;
	}

}