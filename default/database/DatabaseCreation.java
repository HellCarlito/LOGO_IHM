package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Cette classe permet la creation d'une base de donnees
 */
public class DatabaseCreation {
	public static void main(String[] args) throws ClassNotFoundException {
		// load the sqlite-JDBC driver using the current class loader
		Class.forName("org.sqlite.JDBC");

		Connection connection = null;
		try {
			// Cree une connexion a la base de donnees
			connection = DriverManager.getConnection("jdbc:sqlite:test.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); // set timeout a 30 sec.

			// Drop des tables si elles existent
			statement.executeUpdate("drop table if exists ACTION");
			statement.executeUpdate("drop table if exists AGIT_SUR");
			statement.executeUpdate("drop table if exists CLASSE");
			statement.executeUpdate("drop table if exists ELEVE");
			statement.executeUpdate("drop table if exists ENSEIGNANT");
			statement.executeUpdate("drop table if exists EXERCICE");
			statement.executeUpdate("drop table if exists TENTATIVE");
			statement.executeUpdate("drop table if exists TYPE_TORTUE");

			/*
			 * CREATION DES TABLES
			 */
			// Creation de la table Action
			statement.executeUpdate("create table ACTION(ID_ACTION numeric(8,0) not null,"
					+ " IMAGE_ACTION numeric(1,0)," + " CODE_ACTION char(200)," + " primary key (ID_ACTION));");

			// Creation de la table Agit_sur
			statement.executeUpdate("create table AGIT_SUR(ID_TORTUE numeric(8,0) not null,"
					+ "ID_ACTION numeric(8,0) not null," + "primary key (ID_TORTUE, ID_ACTION));");

			// Creation de la table Classe
			statement.executeUpdate("create table CLASSE(ID_CLASSE numeric(8,0) not null,"
					+ "ID_ENSEIGANT numeric(8,0) not null," + "primary key (ID_CLASSE));");

			// Creation de la table Eleve
			statement.executeUpdate(
					"create table ELEVE(ID_ELEVE numeric(8,0) not null," + "ID_CLASSE numeric(8,0) not null,"
							+ "PRENOM_ELEVE char(40)," + "NOM_ELEVE char(40)," + "primary key (ID_ELEVE));");

			// Creation de la table Enseignant
			statement.executeUpdate("create table ENSEIGNANT(ID_ENSEIGANT numeric(8,0) not null,"
					+ "NOM_ENSEIGNANT char(40)," + "PRENOM_ENSEIGNANT char(40)," + "primary key (ID_ENSEIGANT));");

			// Creation de la table Exercice
			statement.executeUpdate("create table EXERCICE(ID_EXERCICE numeric(8,0) not null,"
					+ "ID_ENSEIGANT numeric(8,0) not null," + "ID_TORTUE numeric(8,0) not null,"
					+ "NOM_EXERCICE char(100)," + "IMAGE char(1000)," + "primary key (ID_EXERCICE));");

			// Creation de la table Tentative
			statement.executeUpdate("create table TENTATIVE(ID_TENTATIVE numeric(8,0) not null,"
					+ "ID_ENSEIGANT numeric(8,0) not null," + "ID_ELEVE numeric(8,0) not null,"
					+ "ID_ACTION numeric(8,0) not null," + "ID_EXERCICE numeric(8,0) not null," + "SCORE numeric(2,0),"
					+ "COMMENTAIRES char(1000)," + "primary key (ID_TENTATIVE));");

			// Creation de la table Type_torue
			statement.executeUpdate("create table TYPE_TORTUE(ID_TORTUE numeric(8,0) not null, "
					+ "TYPE_TORTUE char(100)," + "primary key (ID_TORTUE));");

			/*
			 * ALTER TABLES
			 */
			statement.executeUpdate("alter table AGIT_SUR add constraint FK_AGIT_SUR foreign key (ID_TORTUE)"
					+ "references TYPE_TORTUE (ID_TORTUE) on delete restrict on update restrict;");
			
			statement.executeUpdate("alter table AGIT_SUR add constraint FK_AGIT_SUR2 foreign key (ID_ACTION)"
					+ "references ACTION (ID_ACTION) on delete restrict on update restrict;");
			
			statement.executeUpdate("alter table CLASSE add constraint FK_SUIT foreign key (ID_ENSEIGANT)"
					+ "references ENSEIGNANT (ID_ENSEIGANT) on delete restrict on update restrict;");
			
			statement.executeUpdate("alter table ELEVE add constraint FK_POSSEDE foreign key (ID_CLASSE)"
					+ "references CLASSE (ID_CLASSE) on delete restrict on update restrict;");
			
			statement.executeUpdate("alter table EXERCICE add constraint FK_CREE foreign key (ID_ENSEIGANT)"
					+ "references ENSEIGNANT (ID_ENSEIGANT) on delete restrict on update restrict;");
			
			statement.executeUpdate("alter table EXERCICE add constraint FK_UTILISE foreign key (ID_TORTUE)"
					+ "references TYPE_TORTUE (ID_TORTUE) on delete restrict on update restrict;");
			
			statement.executeUpdate("alter table TENTATIVE add constraint FK_ASSOCIE foreign key (ID_EXERCICE)"
					+ "references EXERCICE (ID_EXERCICE) on delete restrict on update restrict;");
			
			statement.executeUpdate("alter table TENTATIVE add constraint FK_CONTIENT foreign key (ID_ACTION)"
					+ "references ACTION (ID_ACTION) on delete restrict on update restrict;");
			
			statement.executeUpdate("alter table TENTATIVE add constraint FK_EVALUE foreign key ()"
					+ "references ENSEIGNANT (ID_ENSEIGANT) on delete restrict on update restrict;");
			
			statement.executeUpdate("alter table TENTATIVE add constraint FK_FAIT foreign key (ID_ELEVE)"
					+ "references ELEVE (ID_ELEVE) on delete restrict on update restrict;");
			

			
			// statement.executeUpdate("create table person (id integer, name
			// string)");
			// statement.executeUpdate("insert into person values(1, 'leo')");
			// statement.executeUpdate("insert into person values(2, 'yui')");
			// ResultSet rs = statement.executeQuery("select * from person");
			// while (rs.next()) {
			// // lit les resultats
			// System.out.println("name = " + rs.getString("name"));
			// System.out.println("id = " + rs.getInt("id"));
			// }
		} catch (SQLException e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// connection close failed.
				System.err.println(e);
			}
		}
	}
}