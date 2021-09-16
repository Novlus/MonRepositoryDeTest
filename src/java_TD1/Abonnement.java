package java_TD1;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Abonnement extends Connexion 
{
	public void supprAbonnement (int id) 
	{
		try {
			int nbLignes = this.Statut.executeUpdate("delete from Abonnement where id_abonnement = "+id+"" );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void  affichageAbonnement()
	{
		
	//8 affichage resultat
	ResultSet ResultSet;
	try 
	{
		ResultSet = this.Statut.executeQuery("select * from Abonnement");
		while (ResultSet.next())
		{
			System.out.println("date_debut: "+ResultSet.getString(2)+"| id: "+ResultSet.getInt(1));
		}
		
		
		
	} catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void modifAbonnement (LocalDate date_debut ,LocalDate date_fin,int id_client,int id_revue,int id)
	{
		try {
			DateTimeFormatter formatage = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			java.sql.Date.valueOf(date_debut);
			java.sql.Date.valueOf(date_fin);
			this.Statut.executeUpdate("update Abonnement set date_debut = '"+date_debut+"' where id_abonnement ="+id+"");
			this.Statut.executeUpdate("update Abonnement set date_fin= '"+date_fin+"'where id_abonnement ="+id+"");
			this.Statut.executeUpdate("update Abonnement set id_client = '"+id_client+"'where id_abonnement ="+id+"");
			this.Statut.executeUpdate("update Abonnement set id_revue = '"+id_revue+"'where id_abonnement ="+id+"");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		public void ajoutAbonnement(LocalDate date_debut ,LocalDate date_fin,int id_client,int id_revue) 
		{
			try {
				DateTimeFormatter formatage = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				Date date_debut_sql = java.sql.Date.valueOf(date_debut) ;
				Date date_fin_sql =java.sql.Date.valueOf(date_fin);
				PreparedStatement Statut = this.connect.prepareStatement("insert into Abonnement (date_debut, date_fin, id_client, id_revue) values(?, ?, ?, ?)",Statement.RETURN_GENERATED_KEYS);
				Statut.setDate(1, date_debut_sql); Statut.setDate(2, date_fin_sql); Statut.setInt(3, id_client);Statut.setInt(4, id_revue);
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
		
		public  void menuAbonnement()
		{
			Connexion c1 = new Connexion();
			Abonnement a1= new Abonnement();
			Menu menue1 = new Menu();
			a1.creeConnexion();
			a1.creationStatement();
			
			Scanner scanner = new Scanner (System.in); 
			

			System.out.println("Bienvenue dans le menu de Abonnement vous aurez accès ici à plusieur fonction:\n"
					+ "1 Ajouter\n"
					+ "2 Supprimer\n"
					+ "3 Modifier\n"
					+ "4 Retour Menu Principal\n"
					+ "5 Fermer\n"
					+ "Ecriver le chiffre que vous souhaitez pour sélectionner votre fonction");
			int choix = scanner.nextInt();
			
				while (choix <1 || choix>5) 
				{
					System.out.println("Erreur vous vous êtes trompé .\nRecommencer\n1 Ajouter\n2 Supprimer\n3 Modifier\n4 Retour Menu Principal\n5 Fermer");
					choix = scanner.nextInt();
				}
				
			while (choix<5 && choix !=4)
			{
				if(choix == 1) 
				{
			
					LocalDate date_debut ;LocalDate date_fin;int id_client;int id_revue; int jour; int mois; int annee;
						System.out.println("Veuillez saisir le jour de la date début");
						jour= scanner.nextInt();
						System.out.println("Veuillez saisir le mois de la date de début");
						mois = scanner.nextInt();
						System.out.println("Veuillez saisir l'année de la date de début");
						annee= scanner.nextInt();
						date_debut = LocalDate.of(annee, mois, jour);
						System.out.println("Veuillez saisir le jour de la date de fin");
						jour= scanner.nextInt();
						System.out.println("Veuillez saisir le mois de la date de fin");
						mois = scanner.nextInt();
						System.out.println("Veuillez saisir l'année de la date de fin");
						annee= scanner.nextInt();
						date_fin = LocalDate.of(annee, mois, jour);
						System.out.println("Veuillez saisir l'id client");
						id_client = scanner.nextInt();
						System.out.println("Veuillez saisir l'id revue");
						id_revue = scanner.nextInt();
						a1.ajoutAbonnement(date_debut, date_fin, id_client, id_revue);
						a1.affichageAbonnement();
						c1.phrase_Choix_Fonction();
						choix = scanner.nextInt();
					
				}
				if (choix == 2) 
				{
					int id;
					System.out.println("Veuillez ecrire l'id que vous souhaitez supprimer");
					id = scanner.nextInt();
					a1.supprAbonnement(id);
					a1.affichageAbonnement();
					c1.phrase_Choix_Fonction();
					choix = scanner.nextInt();
					
				}
				if (choix == 3)
				{
					int id;
					LocalDate date_debut ;
					LocalDate date_fin;
					int id_client;
					int id_revue; 
					int jour; 
					int mois;
					int annee;
					System.out.println("Veuillez saisir le nouveau jour de la date début");
					jour= scanner.nextInt();
					System.out.println("Veuillez saisir le nouveau mois de la date de début");
					mois = scanner.nextInt();
					System.out.println("Veuillez saisir la nouvelle année de la date de début");
					annee= scanner.nextInt();
					date_debut = LocalDate.of(annee, mois, jour);
					System.out.println("Veuillez saisir le nouveau jour de la date de fin");
					jour= scanner.nextInt();
					System.out.println("Veuillez saisir le nouveau mois de la date de fin");
					mois = scanner.nextInt();
					System.out.println("Veuillez saisir la nouvelle année de la date de fin");
					annee= scanner.nextInt();
					date_fin = LocalDate.of(annee, mois, jour);
					System.out.println("Veuillez saisir la nouvelle id client");
					id_client = scanner.nextInt();
					System.out.println("Veuillez saisir la nouvelle  revue");
					id_revue = scanner.nextInt();
					System.out.println("Veuillez ecrire l'id pour que nous puissions modifier cette ligne du tableau");
					id = scanner.nextInt();
					a1.modifAbonnement(date_debut, date_fin, id_client, id_revue, id);
					a1.affichageAbonnement();
					c1.phrase_Choix_Fonction();
					choix = scanner.nextInt();
				}
			}
			if (choix == 5)
			{
				a1.fermerConnection();
				System.out.println("Fermeture de la connexion avec PHPMYADMIN et fermeture du programme ");
				System.exit(0); //ferme le programme java
			}
			if (choix == 4)
			{
				a1.fermerConnection();
				System.out.println("Retour menu principal");
				menue1.Menu_principal();
			}
			}
}
