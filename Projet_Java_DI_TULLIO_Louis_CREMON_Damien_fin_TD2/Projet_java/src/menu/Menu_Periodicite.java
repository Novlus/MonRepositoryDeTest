package menu;

import java.util.Scanner;

import factory.DAOFactory;
import modele.metier.Periodicite;

public class Menu_Periodicite 
{
	public void menuPeriodicite(DAOFactory daos)
	{ 
		Menu menu1 = new Menu();
		Scanner scanner = new Scanner(System.in);
		int choix_Periodicite;
		System.out.println("Bienvenue dans la table Periodicite\nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer");
		choix_Periodicite = scanner.nextInt();
		if (choix_Periodicite == 1)
		{
			String libelle;
			System.out.println("Veuillez ecrire votre libelle");
			libelle= scanner.next();
			Periodicite p1 = new Periodicite(libelle);
			daos.getPeriodiciteDAO().create(p1);
			System.out.println("Veuillez choisir la fonction que vous voulez utiliser\nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer\"");
			choix_Periodicite = scanner.nextInt();
			
		}
		if (choix_Periodicite == 2)
		{
			int id_periodicite;
			System.out.println("Veuillez ecrire votre id_periodicite");
			id_periodicite = scanner.nextInt();
			Periodicite p1 = new Periodicite(id_periodicite,"test");
			daos.getPeriodiciteDAO().delete(p1);
			System.out.println("Veuillez choisir la fonction que vous voulez utiliser \nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer\"");
			choix_Periodicite = scanner.nextInt();
		}
		
		if (choix_Periodicite == 3)
		{
			int id_periodicite;
			String libelle;
			System.out.println("Veuillez ecrire votre id_periodicite");
			id_periodicite = scanner.nextInt();
			System.out.println("Veuillez ecrire votre libelle");
			libelle = scanner.next();
			Periodicite p1 = new Periodicite(id_periodicite,libelle);
			daos.getPeriodiciteDAO().update(p1);
			System.out.println("Veuillez choisir la fonction que vous voulez utiliser \nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer\"");
			choix_Periodicite = scanner.nextInt();
		}
		
		if (choix_Periodicite == 4)
		{
			int id_periodicite;
			System.out.println("Veuillez ecrire votre id_periodicite");
			id_periodicite = scanner.nextInt();
			daos.getPeriodiciteDAO().getById(id_periodicite);
			System.out.println("Veuillez choisir la fonction que vous voulez utiliser \nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer\"");
			choix_Periodicite = scanner.nextInt();
		}
		
		if (choix_Periodicite == 5)
		{
			System.out.println("Retour menu principal");
			menu1.Menu_principal();
		}
	}
}
