package java_TD1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Revue extends Connexion
{
	public void supprRevue (int id) 
	{
		try {
			int nbLignes = this.Statut.executeUpdate("delete from Revue where id_revue = "+id+"" );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public void  affichageRevue ()
	{
		
	//8 affichage resultat
	ResultSet ResultSet;
	try 
	{
		ResultSet = this.Statut.executeQuery("select * from Revue");
		while (ResultSet.next())
		{
			System.out.println("Titre: "+ResultSet.getString(2)+"| id: "+ResultSet.getInt(1));//"| description: "+ResultSet.getInt(3))+"\ntarif_numero: "+ResultSet.getInt(4)+"\nvisuel: "+ResultSet.getInt(5)+"\nid_periodicite :"+ResultSet.getInt(6));
		}
		
		
		
	} catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void modifRevue (String titre,String description,float tarif_numero,String visuel, int id_periodicite, int id)
	{
		try {
			
			
			this.Statut.executeUpdate("update Revue set titre = '"+titre+"' where id_revue ="+id+"");
			this.Statut.executeUpdate("update Revue set description = '"+description+"'where id_revue ="+id+"");
			this.Statut.executeUpdate("update Revue set tarif_numero = '"+tarif_numero+"'where id_revue ="+id+"");
			this.Statut.executeUpdate("update Revue set visuel = '"+visuel+"'where id_revue ="+id+"");
			this.Statut.executeUpdate("update Revue set id_periodicite = '"+id_periodicite+"'where id_revue ="+id+"");
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

public void ajoutRevue(String titre,String description,float tarif_numero,String visuel, int id_periodicite) 
{
	try {
		//ResultSet res1= this.Statut.executeQuery(" Select Periodicite.id_periodicite from Periodicite,Revue where Periodicite.id_periodicite= Revue.id_periodicite And Revue.id_periodicite ='"+id_periodicite+"'");
		
		//if (res1.wasNull())
				//{
				//	System.out.println("cette id n'existe pas dans Periodicite");
				//}
		
		//else {
		
		PreparedStatement Statut = this.connect.prepareStatement("insert into Revue (titre, description, tarif_numero, visuel, id_periodicite) values(?, ?, ?, ?,?)",Statement.RETURN_GENERATED_KEYS);
		Statut.setString(1, titre); Statut.setString(2, description); Statut.setFloat(3, tarif_numero);Statut.setString(4, visuel);Statut.setInt(5, id_periodicite);
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

public  void menuRevue()
{
	Connexion c1 = new Connexion();
	Revue r1= new Revue();
	r1.creeConnexion();
	r1.creationStatement();
	Menu menue1 = new Menu();
	Scanner scanner = new Scanner (System.in); 
	

	System.out.println("Bienvenue dans le menu de Revue vous aurez accès ici à plusieur fonction:\n"
			+ "1 Ajouter\n"
			+ "2 Supprimer\n"
			+ "3 Modifier\n"
			+ "4 Retour Menu Principal\n"
			+ "5 Fermer\n"
			+ "Ecriver le chiffre que vous souhaitez pour sélectionner votre fonction");
	int choix = scanner.nextInt();
	
		while (choix <1 || choix>5) 
		{
			System.out.println("Erreur vous vous êtes trompé .\nRecommencer\n1 Ajouter\n2 Supprimer\n3 Modifier\n4 Fermer");
			choix = scanner.nextInt();
		}
		while (choix<5 && choix !=4)
		{
		if(choix == 1) 
		{
	
				String ajout_titre; String ajout_description; float ajout_tarif_numero; String ajout_visuel; int ajout_id_periodicite;
				System.out.println("Veuillez écrire le titre");
				ajout_titre= scanner.next();
				System.out.println("Veuillez écrire la description");
				ajout_description = scanner.next();
				System.out.println("Veuillez saisir le tarif");
				ajout_tarif_numero = scanner.nextFloat();
				System.out.println("Veuillez écrire le visuel");
				ajout_visuel = scanner.next();
				System.out.println("Veuillez saisir l'id_periodicite");
				ajout_id_periodicite = scanner.nextInt();
				r1.ajoutRevue(ajout_titre, ajout_description, ajout_tarif_numero, ajout_visuel, ajout_id_periodicite);
				r1.affichageRevue();
				c1.phrase_Choix_Fonction();
				choix = scanner.nextInt();
			
		}
		if (choix == 2) 
		{
			int id;
			System.out.println("Veuillez ecrire l'id que vous souhaitez supprimer");
			id = scanner.nextInt();
			r1.supprRevue(id);
			r1.affichageRevue();
			c1.phrase_Choix_Fonction();
			choix = scanner.nextInt();
			
		}
		if (choix == 3)
		{
			int id;
			int id_periodicite_modif;
			String visuel_modif;
			float tarif_numero_modif;
			String description_modif;
			String titre_modif;
			System.out.println("Veuillez ecrire le nouveau titre");
			titre_modif = scanner.next();
			System.out.println("Veuillez écrire la nouvelle description");
			description_modif = scanner.next();
			System.out.println("Veuillez saisir le tarif_");
			tarif_numero_modif = scanner.nextFloat();
			System.out.println("Veuillez écrire le visuel");
			visuel_modif = scanner.next();
			System.out.println("Veuillez saisir l'id_periodicite");
			id_periodicite_modif = scanner.nextInt();
			System.out.println("Veuillez ecrire l'id pour que nous puissions modifier cette ligne du tableau");
			id = scanner.nextInt();
			r1.modifRevue(titre_modif, description_modif, tarif_numero_modif, visuel_modif, id_periodicite_modif, id);
			r1.affichageRevue();
			c1.phrase_Choix_Fonction();
			choix = scanner.nextInt();
		}
		}
		
		if (choix == 5)
		{
			r1.fermerConnection();
			System.out.println("Fermeture de la connexion avec PHPMYADMIN et fermeture du programme ");
			System.exit(0); //ferme le programme java
		}
		
		if (choix == 4)
		{
			r1.fermerConnection();
			System.out.println("Retour menu principal");
			menue1.Menu_principal();
		}
	}

}