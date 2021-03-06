package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Cette classe permet la creation d'une base de donnees
 */
public class DatabaseCreation {
	
	public DatabaseCreation() {
		DatabaseConnection connectionDB = new DatabaseConnection();
		// Connection connection = null;
		try (Connection connection = connectionDB.connect(); Statement statement = connection.createStatement()) {
			statement.setQueryTimeout(30); // set timeout à 30 sec.

			// Drop des tables si elles existent dans la base de données
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
					+ "ID_ACTION numeric(8,0) not null," + "primary key (ID_TORTUE, ID_ACTION),"
					+ "foreign key (ID_TORTUE)references TYPE_TORTUE (ID_TORTUE) on delete restrict on update restrict,"
					+ "foreign key (ID_ACTION) references ACTION (ID_ACTION)on delete restrict on update restrict);");

			// Creation de la table Classe
			statement.executeUpdate("create table CLASSE(ID_CLASSE numeric(8,0) not null,"
					+ "ID_ENSEIGANT numeric(8,0) not null," + "primary key (ID_CLASSE),"
					+ "foreign key (ID_ENSEIGANT) references ENSEIGNANT (ID_ENSEIGANT)"
					+ "on delete restrict on update restrict);");

			// Creation de la table Eleve
			statement.executeUpdate("create table ELEVE(ID_ELEVE numeric(8,0) not null,"
					+ "ID_CLASSE numeric(8,0) not null," + "PRENOM_ELEVE char(40)," + "NOM_ELEVE char(40),"
					+ "primary key (ID_ELEVE),"
					+ "foreign key (ID_CLASSE) references CLASSE (ID_CLASSE) on delete restrict on update restrict);");

			// Creation de la table Enseignant
			statement.executeUpdate("create table ENSEIGNANT(ID_ENSEIGANT numeric(8,0) not null,"
					+ "NOM_ENSEIGNANT char(40)," + "PRENOM_ENSEIGNANT char(40)," + "primary key (ID_ENSEIGANT));");

			// Creation de la table Exercice
			statement.executeUpdate("create table EXERCICE(ID_EXERCICE numeric(8,0) not null,"
					+ "ID_ENSEIGANT numeric(8,0) not null," + "ID_TORTUE numeric(8,0) not null,"
					+ "NOM_EXERCICE char(100)," + "IMAGE char(1000)," + "primary key (ID_EXERCICE),"
					+ "foreign key (ID_ENSEIGANT) references ENSEIGNANT (ID_ENSEIGANT) on delete restrict on update restrict,"
					+ "foreign key (ID_TORTUE) references TYPE_TORTUE (ID_TORTUE) on delete restrict on update restrict);");

			// Creation de la table Tentative
			// La cle etrangere ID_ENSEIGANT etait vide
			statement.executeUpdate("create table TENTATIVE(ID_TENTATIVE numeric(8,0) not null,"
					+ "ID_ENSEIGANT numeric(8,0) not null," + "ID_ELEVE numeric(8,0) not null,"
					+ "ID_ACTION numeric(8,0) not null," + "ID_EXERCICE numeric(8,0) not null," + "SCORE numeric(2,0),"
					+ "COMMENTAIRES char(1000)," + "primary key (ID_TENTATIVE),"
					+ "foreign key (ID_EXERCICE) references EXERCICE (ID_EXERCICE) on delete restrict on update restrict,"
					+ "foreign key (ID_ACTION) references ACTION (ID_ACTION) on delete restrict on update restrict,"
					+ "foreign key (ID_ENSEIGANT) references ENSEIGNANT (ID_ENSEIGANT) on delete restrict on update restrict,"
					+ "foreign key (ID_ELEVE) references ELEVE (ID_ELEVE) on delete restrict on update restrict);");

			// Creation de la table Type_torue
			statement.executeUpdate("create table TYPE_TORTUE(ID_TORTUE numeric(8,0) not null, "
					+ "TYPE_TORTUE char(100)," + "primary key (ID_TORTUE));");

			/*
			 * INSERTION DE DONNEES DANS LA BASE
			 */
			
			// Insertion de données dans la table ELEVE
			// Ajout de différents élèves 
			statement.executeUpdate("INSERT INTO ELEVE(ID_ELEVE,ID_CLASSE,PRENOM_ELEVE,NOM_ELEVE)"
					+ " VALUES (1,'1','Yoline','Robichon');");

			statement.executeUpdate("INSERT INTO ELEVE(ID_ELEVE,ID_CLASSE,PRENOM_ELEVE,NOM_ELEVE)"
					+ " VALUES (2,'1','Agathe','Beaubeyrot');");

			statement.executeUpdate("INSERT INTO ELEVE(ID_ELEVE,ID_CLASSE,PRENOM_ELEVE,NOM_ELEVE)"
					+ " VALUES (3,'1','Chloe','Pouvreau');");

			statement.executeUpdate(
					"INSERT INTO ELEVE(ID_ELEVE,ID_CLASSE,PRENOM_ELEVE,NOM_ELEVE)"
					+ " VALUES (4,'1','PJ','DLF');");

			statement.executeUpdate("INSERT INTO ELEVE(ID_ELEVE,ID_CLASSE,PRENOM_ELEVE,NOM_ELEVE)"
					+ " VALUES (5,'1','Charles','Tholliez');");
			
			// Insertion de données dans la table ENSEIGNANT
			// Ajout de différents enseignants
			statement.executeUpdate("INSERT INTO ENSEIGNANT(ID_ENSEIGANT,NOM_ENSEIGNANT,PRENOM_ENSEIGNANT)"
					+ " VALUES (1,'Girard','Patrick');");
			
			statement.executeUpdate("INSERT INTO ENSEIGNANT(ID_ENSEIGANT,NOM_ENSEIGNANT,PRENOM_ENSEIGNANT)"
					+ " VALUES (2,'Geniet','Annie');");
			
			statement.executeUpdate("INSERT INTO ENSEIGNANT(ID_ENSEIGANT,NOM_ENSEIGNANT,PRENOM_ENSEIGNANT)"
					+ " VALUES (3,'Geniet','Dominique');");
			
			// Insertion de données dans la table CLASSE
			statement.executeUpdate("INSERT INTO CLASSE(ID_CLASSE,ID_ENSEIGANT) VALUES (1,'1');");
			statement.executeUpdate("INSERT INTO CLASSE(ID_CLASSE,ID_ENSEIGANT) VALUES (2,'2');");
			statement.executeUpdate("INSERT INTO CLASSE(ID_CLASSE,ID_ENSEIGANT) VALUES (3,'3');");

		} catch (SQLException e) {
			// s'il y a un message d'erreur du type "out of memory",
			// cela signifie probablement qu'il n'y a pas de fichiers 
			// de base de données trouvé
			System.err.println(e.getMessage());
		}


	}

}