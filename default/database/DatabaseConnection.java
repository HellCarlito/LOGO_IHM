package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Cette classe permet de se connecter a la base de donnees
 */
public class DatabaseConnection {
	public Connection connect() {
		java.sql.Connection connection = null;
		try {
			// Créé une base de données (fichier .db) avec le nom logo
			// Via le driver jdbc
			connection = DriverManager.getConnection("jdbc:sqlite:logo.db");
			System.out.println("Connexion avec la base de données établie");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return connection;
	}

}
