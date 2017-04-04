package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map.Entry;

/*
 * Cette classe permet de charger les donnees presentes dans la base
 * Une connexion est faite puis les donnees sont chargees
 */

public class DatabaseLoader {

	public static void main(String[] args) throws SQLException {
		loadDatabase();
	}

	// Cette methode permet de charger les donnees 
	// presentes dans la base de donnees
	public static void loadDatabase() throws SQLException {
		DatabaseConnection connectionDB = new DatabaseConnection();
		String sqlRequest = ("select * from eleve");
		HashMap<String, String> hashmapEleves; // Clé / Valeur 

		try (Connection connection = connectionDB.connect();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(sqlRequest)) {
			while (rs.next()) {
				hashmapEleves = new HashMap<String, String>();
				// lit les resultats
				//System.out.println("prenom = " + rs.getString("prenom_eleve") + " - nom = " + rs.getString("nom_eleve"));
				hashmapEleves.put("nom", rs.getString("nom_eleve"));
				hashmapEleves.put("prenom", rs.getString("prenom_eleve"));
				//System.out.println(hashmapEleves);
				for (Entry<String, String> entry : hashmapEleves.entrySet()) {
					System.out.println(entry.getKey() + " " + entry.getValue());
				}
			}

		}
	}
}
