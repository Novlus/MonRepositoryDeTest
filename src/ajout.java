import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ajout {
	public static void main(String[] args) 
	{
		String url = 
				"jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/ditullio4u_td1cpoa";
				url += "?serverTimezone=Europe/Paris";
				String login = "ditullio4u_appli";
				String pwd = "32010368"; 
				Connection maConnexion = null;
		try { 
			maConnexion = DriverManager.getConnection(url, login, pwd);

			//3 créer un état de connexion
		
			Statement pe = maConnexion.createStatement();
			// 4 insertion des données
			
			pe.execute("insert into Periodicite(libelle) values ('faim')"); //mettre une variable a la place de la valeur
			//5 suppression des données 
			
			int nbLignes = pe.executeUpdate("delete from Periodicite where id_periodicite = 12" ); //mettre une variable a la place du nombre
			//7 modification des données
			
			pe.executeUpdate("update Periodicite set libelle = 'bonsoir' where id_periodicite =3");
			//8 affichage resultat
			ResultSet ResultSet = pe.executeQuery("select * from Periodicite");
			
			
			while (ResultSet.next())
			{
				System.out.println("libelle: "+ResultSet.getString(2));
			}
			//9fermer la connection
			maConnexion.close();
			
			} catch (SQLException sqle)
		
		
		
		
		
			{
			System.out.println("Erreur connexion" + sqle.getMessage());
			}
		
	}
	}


