package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Cette classe permet de charger les donnees presentes dans la base
 * Une connexion est faite puis les donnees sont chargees
 */

public class DatabaseLoader {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Connexion a la base de donnees
		// connect();
		// chargement de la base de donnees
		loadDatabase();
	}

	// Cette methode permet de charger les donnees presentes dans la base de
	// donnees
	public static void loadDatabase() throws SQLException, ClassNotFoundException {
		DatabaseConnection connectionDB = new DatabaseConnection();
		String sqlRequest = ("select * from eleve");

		try (Connection connection = connectionDB.connect();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(sqlRequest)) {
			while (rs.next()) {
				// lit les resultats
				System.out.println("prenom = " + rs.getString("prenom_eleve"));
				System.out.println("nom = " + rs.getString("nom_eleve"));
			}

		}
	}
}
