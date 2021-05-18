package de.telekom.jdbcchallenge;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {

		final String DRIVER = "org.mariadb.jdbc.Driver";
		Class.forName(DRIVER);
		try {
			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/seadb?user=seauser&password=seapass");
			Statement statement = connection.createStatement();
	//		ResultSet resultSet = statement.executeQuery( "select count(*) from personen");

	//		System.out.println("Es gibt " + resultSet.getInt(1) + " Datensätze");

	//		ResultSet resultSet = statement.executeQuery( "select * from personen");
			
			ResultSet resultSet = statement.executeQuery( "select * from personen");
			
			while(resultSet.next()) {
		        System.out.println("ID       : " + resultSet.getInt(1));    // ID
		        System.out.println("Anrede   : " + resultSet.getInt(2));    // Anrede
	     	    System.out.println("Vorname  : " + resultSet.getString(3)); // Vorname
	     	    System.out.println("Nachname : " + resultSet.getString(4)); // Nachname
	     	    System.out.println("");                                     // Leer
			}
				
						
			connection.close();
		} catch (Exception e) { System.out.println("Ausgabe");}
	}

}
