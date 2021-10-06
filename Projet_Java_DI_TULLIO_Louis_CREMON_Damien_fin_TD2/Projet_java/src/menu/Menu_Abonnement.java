package menu;

import java.time.LocalDate;
import java.util.Scanner;

import factory.DAOFactory;
import modele.metier.Abonnement;

public class Menu_Abonnement 
{
	public void menuAbonnement(DAOFactory daos)
	{ 
		Menu menu1 = new Menu();
		Scanner scanner = new Scanner(System.in);
		int choix_Abonnement;
		System.out.println("Bienvenue dans la table Abonnement\nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer");
		choix_Abonnement = scanner.nextInt();
		if (choix_Abonnement == 1)
		{
			LocalDate date_debut ;
			LocalDate date_fin;
			int id_client;
			int id_revue;
			int jour; 
			int mois; 
			int annee;
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
			Abonnement a1 = new Abonnement(date_debut, date_fin, id_client, id_revue);
			daos.getAbonnementDAO().create(a1);
			System.out.println("Veuillez choisir la fonction que vous voulez utiliser\nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer\"");
			choix_Abonnement = scanner.nextInt();
			
		}
		if (choix_Abonnement == 2)
		{
			int id_abonnement;
			int annee_deb = 2020; int annee_fin = 2020;
			int mois_deb = 01;  int mois_fin = 02;
			int jour_deb = 01;  int jour_fin = 02;
			LocalDate date_debut = LocalDate.of(annee_deb, mois_deb, jour_deb);
			LocalDate date_fin = LocalDate.of(annee_fin, mois_fin, jour_fin);
			System.out.println("Veuillez ecrire votre id_abonnement");
			id_abonnement = scanner.nextInt();
			Abonnement a1 = new Abonnement(id_abonnement, date_debut, date_fin, 1, 1);
			daos.getAbonnementDAO().delete(a1);
			System.out.println("Veuillez choisir la fonction que vous voulez utiliser \nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer\"");
			choix_Abonnement = scanner.nextInt();
		}
		
		if (choix_Abonnement == 3)
		{
			int id_abonnement;
			LocalDate date_debut ;
			LocalDate date_fin;
			int id_client;
			int id_revue;
			int jour; 
			int mois; 
			int annee;
			System.out.println("Veuillez ecrire votre id_abonnement");
			id_abonnement = scanner.nextInt();
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
			Abonnement a1 = new Abonnement(id_abonnement,date_debut,date_fin,id_client,id_revue);
			daos.getAbonnementDAO().update(a1);
			System.out.println("Veuillez choisir la fonction que vous voulez utiliser \nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer\"");
			choix_Abonnement = scanner.nextInt();
		}
		
		if (choix_Abonnement == 4)
		{
			int id_abonnement;
			System.out.println("Veuillez ecrire votre id_periodicite");
			id_abonnement = scanner.nextInt();
			daos.getPeriodiciteDAO().getById(id_abonnement);
			System.out.println("Veuillez choisir la fonction que vous voulez utiliser \nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer\"");
			choix_Abonnement = scanner.nextInt();
		}
		
		if (choix_Abonnement == 5)
		{
			System.out.println("Retour menu principal");
			menu1.Menu_principal();
		}
	}
}
