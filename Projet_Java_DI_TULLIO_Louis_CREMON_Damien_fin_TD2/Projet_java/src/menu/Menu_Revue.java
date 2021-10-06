package menu;

import java.util.Scanner;

import factory.DAOFactory;
import modele.metier.Revue;

public class Menu_Revue 
{
	public void menuRevue(DAOFactory daos)
	{ 
		Menu menu1 = new Menu();
		Scanner scanner = new Scanner(System.in);
		int choix_Revue;
		System.out.println("Bienvenue dans la table Revue\nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer");
		choix_Revue = scanner.nextInt();
		if (choix_Revue == 1)
		{
			String titre;
			String description;
			float tarif_numero;
			String visuel;
			int id_periodicite;
			System.out.println("Veuillez ecrire votre titre");
			titre= scanner.next();
			System.out.println("Veuillez ecrire votre description");
			description = scanner.next();
			System.out.println("Veuillez ecrire votre tarif numero");
			tarif_numero = scanner.nextFloat();
			System.out.println("Veuillez ecrire le visuel");
			visuel = scanner.next();
			System.out.println("Veuillez ecrire l'id Periodicite");
			id_periodicite = scanner.nextInt();
			Revue r1 = new Revue(titre,description,tarif_numero,visuel,id_periodicite);
			daos.getRevueDAO().create(r1);
			System.out.println("Veuillez choisir la fonction que vous voulez utiliser\nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer\"");
			choix_Revue = scanner.nextInt();
			
		}
		if (choix_Revue == 2)
		{
			int id_revue;
			System.out.println("Veuillez ecrire votre id_revue");
			id_revue = scanner.nextInt();
			Revue r1 = new Revue(id_revue,"test","test",0.00F,"test",1);
			daos.getRevueDAO().delete(r1);
			System.out.println("Veuillez choisir la fonction que vous voulez utiliser \nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer\"");
			choix_Revue = scanner.nextInt();
		}
		
		if (choix_Revue == 3)
		{
			int id_revue;
			String titre;
			String description;
			float tarif_numero;
			String visuel;
			int id_periodicite;
			System.out.println("Veuillez ecrire votre id_revue");
			id_revue= scanner.nextInt();
			System.out.println("Veuillez ecrire votre titre");
			titre= scanner.next();
			System.out.println("Veuillez ecrire votre description");
			description = scanner.next();
			System.out.println("Veuillez ecrire votre tarif numero");
			tarif_numero = scanner.nextFloat();
			System.out.println("Veuillez ecrire le visuel");
			visuel = scanner.next();
			System.out.println("Veuillez ecrire l'id Periodicite");
			id_periodicite = scanner.nextInt();
			Revue r1 = new Revue(id_revue,titre,description,tarif_numero,visuel,id_periodicite);
			daos.getRevueDAO().update(r1);
			System.out.println("Veuillez choisir la fonction que vous voulez utiliser \nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer\"");
			choix_Revue = scanner.nextInt();
		}
		
		if (choix_Revue == 4)
		{
			int id_revue;
			System.out.println("Veuillez ecrire votre id_revue");
			id_revue = scanner.nextInt();
			daos.getRevueDAO().getById(id_revue);
			System.out.println("Veuillez choisir la fonction que vous voulez utiliser \nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer\"");
			choix_Revue = scanner.nextInt();
		}
		
		if (choix_Revue == 5)
		{
			System.out.println("Retour menu principal");
			menu1.Menu_principal();
		}
	}
}
