package java_TD1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Periodicite extends Connexion
{
	
	public void supprLibelle (int id)
	{
		try {
			int nbLignes = this.Statut.executeUpdate("delete from Periodicite where id_periodicite = "+id+"" );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void  affichagePeriodicite ()
	{
		
	//8 affichage resultat
	ResultSet ResultSet;
	try 
	{
		ResultSet = this.Statut.executeQuery("select * from Periodicite");
		while (ResultSet.next())
		{
			System.out.println("libelle: "+ResultSet.getString(2)+"\nid: "+ResultSet.getInt(1));
		}
		
		
		
	} catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void ajoutLibelle(String libelle) 
	{
		try 
		{
			this.Statut.execute("insert into Periodicite(libelle) values('"+libelle+"')");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	public void phrase_Choix_Fonction () 
	{
		System.out.println("Veuillez choisir à nouveau une fonction \n1 Ajouter\n2 Supprimer\n3 Modifier\n4 Fermer");
	}

	public void modifLibelle (String libelle,int id)
	{
		try {
			this.Statut.executeUpdate("update Periodicite set libelle = '"+libelle+"' where id_periodicite ="+id+"");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  void menuPeriodicite()
	{
		Connexion c1 = new Connexion();
		Periodicite p1 = new Periodicite();
		p1.creeConnexion();
		p1.creationStatement();
		Menu menue1 = new Menu();
		Scanner scanner = new Scanner (System.in); 
	
		System.out.println("Bienvenue dans le menu de Libelle vous aurez accès ici à plusieur fonction:\n"
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
		
					String ajout;
					System.out.println("Veuillez écrire ce que vous voulez ajouté dans Libelle");
					ajout= scanner.next();
					p1.ajoutLibelle(ajout);
					p1.affichagePeriodicite();
					c1.phrase_Choix_Fonction();
					choix = scanner.nextInt();
				
			}
			if (choix == 2) 
			{
				int id;
				System.out.println("Veuillez ecrire l'id que vous souhaitez supprimer");
				id = scanner.nextInt();
				p1.supprLibelle(id);
				p1.affichagePeriodicite();
				c1.phrase_Choix_Fonction();
				choix = scanner.nextInt();
				
			}
			if (choix == 3)
			{
				int id;
				String modif;
				System.out.println("Veuillez ecrire ce que vous voulez pour Libelle");
				modif = scanner.next();
				System.out.println("Veuillez ecrire l'id pour que nous puissions modifier le libelle à cette endroit");
				id = scanner.nextInt();
				p1.modifLibelle(modif, id);
				p1.affichagePeriodicite();
				c1.phrase_Choix_Fonction();
				choix = scanner.nextInt();
			}
			}
			
			if (choix == 5)
			{
				p1.fermerConnection();
				System.out.println("Fermeture de la connexion avec PHPMYADMIN et fermeture du programme ");
				System.exit(0); //ferme le programme java
			}
			
			if (choix == 4)
			{
				p1.fermerConnection();
				System.out.println("Retour menu principal");
				menue1.Menu_principal();
			}
		}
}
