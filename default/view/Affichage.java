package view;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import model.Eleve;
import model.Tentative;
import view.Menu;
import model.Exercice;

public class Affichage extends JPanel {
	
	/**
	 * Attributs
	 */
	private JPanel affichageMenuEleve, affichageMenuEnseignant;
	private JTable table;
	private myModel modele;
	private JPanel affichEleve;
	
	public  Affichage(){
		
		//Affichage du menu Eleve avec la table de ces exercices
		affichEleve = this.getAffichageEleve(); 
		this.add(affichEleve);
		
	}

	public JPanel getAffichageEleve(){
	
		//Initialisation du panel principal qui sera retourné
		affichageMenuEleve = new JPanel(new GridLayout(2,1));
		
		JLabel monTitre = new JLabel(" ", JLabel.CENTER);
		modele = new myModel();
		table = new JTable(modele);

		affichageMenuEleve.add(monTitre);
		affichageMenuEleve.add(table);
		return affichageMenuEleve;
		
	}
	
	/*/
	 * Cette méthode permet de modifier les données de la classe
	 */
	public void setData(Tentative t)
	{
		modele.setData(t);
		modele.fireTableDataChanged();
	}
	
	/*/
	 * Création d'une classe static
	 */
	static class myModel extends AbstractTableModel
	{
		/*/
		 * Attributs
		 */
		private Tentative data;
		private Eleve eleve;
		private Exercice exo;
		
		/*/
		 * Méthode retournant le nombre de colonnes dans le tableau
		 * @see javax.swing.table.TableModel#getColumnCount()
		 */
		@Override
		public int getColumnCount()
		{
			return 3;
		}
		
		/*/
		 * Méthode retournant le nombre de lignes dans le tableau
		 * @see javax.swing.table.TableModel#getRowCount()
		 */
		@Override
		public int getRowCount()
		{
			return (data == null ? 0 : eleve.getTentativeEleves().size());
		}
		
		/*/
		 * Méthode retournant un chaine de caractère correspondants au nom de la colonne
		 * @see javax.swing.table.AbstractTableModel#getColumnName(int)
		 */
		public String getColumnName(int i)
		{
			switch (i) 
			{
			case 0 : return "Nom Exercice";
			case 1 : return "Notation";
			case 2 : return "Commentaire(s)";
			default : return "";
			}
		}
		
		/*/
		 * Méthode retournant les information relative à chaque élève de la classe
		 * @see javax.swing.table.TableModel#getValueAt(int, int)
		 */
		@Override
		public Object getValueAt(int rowIndex, int columnIndex)
		{
			switch (columnIndex)
			{
			case 0 : return exo.getNomExercice();
			case 1 : return data.getEvaluation();
			case 2 : return data.getCommentaire();
			default : return "";
			}
		}	
	
		/*/
		 * Méthode modifiant les données de la classe
		 */
		public void setData(Tentative t)
		{
			this.data = t;
		}	
	
	}
}
