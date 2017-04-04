package view;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.*;
import java.awt.*;

public class Affichage extends JPanel {
	
	/**
	 * Attributs
	 */
	private JPanel affichageMenuEleve, affichageMenuEnseignant;
	private JTable table;
	private myModel modele;
	
	public  Affichage(){
		
		modele = new myModel();
		table = new JTable(modele);
		this.setSize(300,300);
		this.add(table);
		this.setViewportView(table);
	}

	public JPanel getAffichageEleve(){
	
		//Initialisation du panel principal qui sera retourné
		affichageMenuEleve = new JPanel();
		
		
		
		return affichageMenuEleve;
		
	}
	
	
	
	/*/
	 * Création d'une classe static
	 */
	static class myModel extends AbstractTableModel
	{
		/*/
		 * Attribut
		 */
		private  data;
		
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
			return (data == null ? 0 : data.getEleve().size());
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
			case 1 : return "Score";
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
			case 0 : return data.getEleve().get(rowIndex).getIcone();
			case 1 : return data.getEleve().get(rowIndex).getPrenom();
			case 2 : return data.getEleve().get(rowIndex).getNom();
			default : return "";
			}
		}
		
	
	
}
