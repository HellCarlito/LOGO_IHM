package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
/**
 * Cette classe permet de creer une connexion a une base de donnees
 * en specifiant un path vers cette base de donnees
 * @author Groupe 5
 */
public class SQLiteJDBCDriverConnection {
     /**
     * Connect to a sample database
     */
    public static void connect() {
        Connection conn = null;
        try {
            // Parametre de la base de donnees
            String url = "jdbc:sqlite:C:/Users/yoline/Downloads/chinook.db";
            // Cree une connexion a la base de donnees
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connexion a SQLite Etablie.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connect();
    }
}
