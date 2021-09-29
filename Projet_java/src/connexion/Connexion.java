package connexion;

import java.sql.*;
import java.util.Scanner;
public class Connexion 
{
	protected Connection connect;
	protected Statement Statut;

	public Connection creeConnexion() {
		 String url = 
		 "jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/ditullio4u_td1cpoa";
		 url += "?serverTimezone=Europe/Paris";
		 String login = "ditullio4u_appli";
		 String pwd = "32010368"; 
		 Connection maConnexion = null;
		 try 
		 { 
		 maConnexion = DriverManager.getConnection(url, login, pwd);
		 this.connect = maConnexion;
		 } catch (SQLException sqle) {
		 System.out.println("Erreur connexion" + sqle.getMessage());
		 }
		 return maConnexion;
		   }
	 

	public void creationStatement( ) 
	{
		Statement Statut;
		try {
			Statut = this.connect.createStatement();
			this.Statut= Statut;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void phrase_Choix_Fonction () 
	{
		System.out.println("Veuillez choisir à nouveau une fonction \n1 Ajouter\n2 Supprimer\n3 Modifier\n4 Menu principal\n5 Fermer");
	
	}
	
	
	
		
	
	public void fermerConnection() 
	{
		try {
			this.connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
	
