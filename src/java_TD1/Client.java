package java_TD1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Client extends Connexion
{
	public void supprClient (int id) 
	{
		try {
			int nbLignes = this.Statut.executeUpdate("delete from Client where id_client = "+id+"" );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void  affichageClient()
	{
		
	//8 affichage resultat
	ResultSet ResultSet;
	try 
	{
		ResultSet = this.Statut.executeQuery("select * from Client");
		while (ResultSet.next())
		{
			System.out.println("nom: "+ResultSet.getString(2)+"| id: "+ResultSet.getInt(1));
		}
		
		
		
	} catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void modifClient (String nom,String prenom,String no_rue,String voie, String code_postal, String ville,String pays, int id)
	{
		try {
			
			
			this.Statut.executeUpdate("update Client set nom = '"+nom+"' where id_client ="+id+"");
			this.Statut.executeUpdate("update Client set prenom = '"+prenom+"'where id_client ="+id+"");
			this.Statut.executeUpdate("update Client set no_rue = '"+no_rue+"'where id_client ="+id+"");
			this.Statut.executeUpdate("update Client set voie = '"+voie+"'where id_client ="+id+"");
			this.Statut.executeUpdate("update Client set code_postal = '"+code_postal+"'where id_client ="+id+"");
			this.Statut.executeUpdate("update Client set ville = '"+ville+"'where id_client ="+id+"");
			this.Statut.executeUpdate("update Client set pays = '"+pays+"'where id_client ="+id+"");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ajoutClient(String nom,String prenom,String no_rue,String voie, String code_postal, String ville,String pays) 
	{
		try {
			//ResultSet res1= this.Statut.executeQuery(" Select Periodicite.id_periodicite from Periodicite,Revue where Periodicite.id_periodicite= Revue.id_periodicite And Revue.id_periodicite ='"+id_periodicite+"'");
			
			//if (res1.wasNull())
					//{
					//	System.out.println("cette id n'existe pas dans Periodicite");
					//}
			
			//else {
			
			PreparedStatement Statut = this.connect.prepareStatement("insert into Client (nom, prenom, no_rue, voie, code_postal,ville,pays) values(?, ?, ?, ?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			Statut.setString(1, nom); Statut.setString(2, prenom); Statut.setString(3, no_rue);Statut.setString(4, voie);Statut.setString(5, code_postal);Statut.setString(6, ville);Statut.setString(7, pays);
			int nbLignes = Statut.executeUpdate();
			ResultSet res = Statut.getGeneratedKeys();
			if(res.next())
			{
				int cle = res.getInt(1);
			}
		/*} */}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public  void menuClient()
	{
		Connexion c1 = new Connexion();
		Client cl1= new Client();
		cl1.creeConnexion();
		cl1.creationStatement();
		Menu menue1 = new Menu();
		
		Scanner scanner = new Scanner (System.in); 
		

		System.out.println("Bienvenue dans le menu de Client vous aurez accès ici à plusieur fonction:\n"
				+ "1 Ajouter\n"
				+ "2 Supprimer\n"
				+ "3 Modifier\n"
				+ "4 Retour Menu Principal\n"
				+ "5 Fermer\n"
				+ "Ecriver le chiffre que vous souhaitez pour sélectionner votre fonction");
		int choix = scanner.nextInt();
		
			while (choix <1 || choix>5) 
			{
				System.out.println("Erreur vous vous êtes trompé .\nRecommencer\n1 Ajouter\n2 Supprimer\n3 Modifier\n4 Menu principal\n5 Fermer");
				choix = scanner.nextInt();
			}
			
		while (choix<5 && choix !=4)
		{
		
			if(choix == 1) 
			{
		
					String ajout_nom; String ajout_prenom; String ajout_no_rue; String ajout_voie; String ajout_code_postal ; String ajout_ville; String ajout_pays;
					System.out.println("Veuillez écrire le nom");
					ajout_nom= scanner.next();
					System.out.println("Veuillez écrire le prénom");
					ajout_prenom = scanner.nextLine();
					System.out.println("Veuillez écrire le numéro de la rue");
					ajout_no_rue= scanner.nextLine();
					System.out.println("Veuillez écrire la voie");
					ajout_voie = scanner.nextLine();
					System.out.println("Veuillez écrie le code postal");
					ajout_code_postal = scanner.nextLine();
					System.out.println("Veuillez écrie la ville");
					ajout_ville = scanner.nextLine();
					System.out.println("Veuillez saisir le pays");
					ajout_pays = scanner.nextLine();
					cl1.ajoutClient(ajout_nom, ajout_prenom, ajout_no_rue, ajout_voie, ajout_code_postal, ajout_ville, ajout_pays);
					cl1.affichageClient();
					c1.phrase_Choix_Fonction();
					choix = scanner.nextInt();
				
			}
			if (choix == 2) 
			{
				int id;
				System.out.println("Veuillez ecrire l'id que vous souhaitez supprimer");
				id = scanner.nextInt();
				cl1.supprClient(id);
				cl1.affichageClient();
				c1.phrase_Choix_Fonction();
				choix = scanner.nextInt();
				
			}
			if (choix == 3)
			{
				int id;
				String pays_modif;
				String ville_modif;
				String code_postal_modif;
				String voie_modif;
				String no_rue_modif;
				String prenom_modif;
				String nom_modif;
				System.out.println("Veuillez écrire le nouveau nom");
				nom_modif= scanner.next();
				System.out.println("Veuillez écrire le nouveau prénom");
				prenom_modif = scanner.next();
				System.out.println("Veuillez écrire le  nouveau numéro de la rue");
				no_rue_modif= scanner.next();
				System.out.println("Veuillez écrire la nouvelle voie");
				voie_modif = scanner.next();
				System.out.println("Veuillez écrie le nouveau code postal");
				code_postal_modif = scanner.next();
				System.out.println("Veuillez écrie la nouvelle ville");
				ville_modif = scanner.next();
				System.out.println("Veuillez saisir le nouveau pays");
				pays_modif= scanner.nextLine();
				System.out.println("Veuillez ecrire l'id pour que nous puissions modifier cette ligne du tableau");
				id = scanner.nextInt();
				cl1.modifClient(nom_modif, prenom_modif, no_rue_modif, voie_modif, code_postal_modif, ville_modif, pays_modif, id);
				cl1.affichageClient();
				c1.phrase_Choix_Fonction();
				choix = scanner.nextInt();
			}
		}
			if (choix == 5)
			{
				cl1.fermerConnection();
				System.out.println("Fermeture de la connexion avec PHPMYADMIN et fermeture du programme ");
				System.exit(0); //ferme le programme java
			}
			
			if (choix == 4)
			{
				cl1.fermerConnection();
				System.out.println("Retour menu principal");
				menue1.Menu_principal();
			}
		}
}
