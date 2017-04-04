package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInsert {

	DatabaseConnection connectionDB = new DatabaseConnection();

	// public static void main(String[] args) throws SQLException {
	// //insertStudent(7, 7, "john", "doe");
	// insertTeacher(4, "nomEn", "prenomEn");
	//
	// }

	/*
	 * Methode pour inserer des eleves dans la base de donnees
	 */
	public void insertStudent(int idEleve, int idClasse, String prenom, String nom) {
		try (Connection connection = connectionDB.connect(); Statement stmt = connection.createStatement()) {
			String sqlRequest = "insert into eleve(id_eleve, id_classe, prenom_eleve, nom_eleve) values (?,?,?,?)";
			PreparedStatement stmtInsert = connection.prepareStatement(sqlRequest);

			stmtInsert.setInt(1, idEleve);
			stmtInsert.setInt(2, idClasse);
			stmtInsert.setString(3, prenom);
			stmtInsert.setString(4, nom);
			stmtInsert.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/*
	 * Methode pour inserer des enseignants dans la base de donnees
	 */
	public void insertTeacher(int idEnseignant, String nomEnseignant, String prenomEnseignant) {
		try (Connection connection = connectionDB.connect(); Statement stmt = connection.createStatement()) {
			String sqlRequest = "insert into enseignant(id_enseigant, nom_enseignant, prenom_enseignant) values (?,?,?)";
			PreparedStatement stmtInsert = connection.prepareStatement(sqlRequest);

			stmtInsert.setInt(1, idEnseignant);
			stmtInsert.setString(2, nomEnseignant);
			stmtInsert.setString(3, prenomEnseignant);
			stmtInsert.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
