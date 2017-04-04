package database;

import java.sql.Connection;
import java.sql.DriverManager;
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
		connect();
		// chargement de la base de donnees
		loadDatabase();
	}

	/*
	 * Cette methode permet de se connecter a la base test.db creee dans la
	 * classe DatabaseCreation
	 */
	public static void connect() throws ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");

		Connection connection = null;
		try {
			// Cree une connexion a la base de donnees
			connection = DriverManager.getConnection("jdbc:sqlite:test.db");
			// La connexion est etablie
			System.out.println("Connexion a SQLite Etablie.");
		} catch (SQLException e) {
			// La connexion ne marche pas on recupere le message d'erreur
			System.out.println(e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

	// Cette methode permet de charger les donnees presentes dans la base de
	// donnees
	public static void loadDatabase() throws SQLException, ClassNotFoundException {
		Connection connection = DriverManager.getConnection("jdbc:sqlite:test.db");
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from eleve");
		while (rs.next()) {
			// lit les resultats
			System.out.println("prenom = " + rs.getString("prenom_eleve"));
			System.out.println("nom = " + rs.getString("nom_eleve"));
		}
	}
}
