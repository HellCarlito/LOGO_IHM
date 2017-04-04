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

	DatabaseConnection connectionDB = new DatabaseConnection();

	// public static void main(String[] args) throws SQLException {
	// loadStudents();
	// loadTeachers();
	// loadSchoolClass();
	//
	// }

	/*
	 * Cette methode permet de charger les eleves presents dans la base de
	 * donnees
	 */
	public void loadStudents() {
		String sqlRequest = ("select * from eleve");
		HashMap<String, String> hashmapEleves; // Clé / Valeur

		try (Connection connection = connectionDB.connect();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(sqlRequest)) {
			while (rs.next()) {
				hashmapEleves = new HashMap<String, String>();
				// lit les resultats
				hashmapEleves.put("nom", rs.getString("nom_eleve"));
				hashmapEleves.put("prenom", rs.getString("prenom_eleve"));
				// System.out.println(hashmapEleves);
				for (Entry<String, String> entry : hashmapEleves.entrySet()) {
					System.out.println(entry.getKey() + " " + entry.getValue());
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/*
	 * Cette methode permet de charger les enseignants present dans la base de
	 * donnees
	 */
	public void loadTeachers() {
		String sqlRequest = "select * from enseignant";
		try (Connection connection = connectionDB.connect();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(sqlRequest)) {
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/*
	 * Cette methode permet de charger les classes presentes dans la base de
	 * donnees
	 */
	public void loadSchoolClass() {
		String sqlRequest = "select * from classe";
		try (Connection connection = connectionDB.connect();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(sqlRequest)) {
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
