package menu;

import java.util.Scanner;

import factory.DAOFactory;
import modele.metier.Client;

public class Menu_Client 
{
	public void menuClient(DAOFactory daos)
	{ 
		Menu menu1 = new Menu();
		Scanner scanner = new Scanner(System.in);
		int choix_Client;
		System.out.println("Bienvenue dans la table Client\nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer");
		choix_Client = scanner.nextInt();
		if (choix_Client == 1)
		{
			String nom;
			String prenom;
			String no_rue;
			String voie;
			String code_postal;
			String ville;
			String pays;
			System.out.println("Veuillez ecrire votre nom");
			nom= scanner.next();
			System.out.println("Veuillez ecrire votre prenom");
			prenom= scanner.next();
			System.out.println("Veuillez ecrire votre no_rue");
			no_rue= scanner.next();
			System.out.println("Veuillez ecrire votre voie");
			voie= scanner.next();
			System.out.println("Veuillez ecrire votre code postal");
			code_postal= scanner.next();
			System.out.println("Veuillez ecrire votre ville");
			ville= scanner.next();
			System.out.println("Veuillez ecrire votre pays");
			pays= scanner.next();
			Client cl1 = new Client(nom,prenom,no_rue,voie,code_postal,ville,pays);
			daos.getClientDAO().create(cl1);
			System.out.println("Veuillez choisir la fonction que vous voulez utiliser\nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer\"");
			choix_Client = scanner.nextInt();
			
		}
		if (choix_Client == 2)
		{
			int id_client;
			System.out.println("Veuillez ecrire votre id_client");
			id_client = scanner.nextInt();
			Client cl1 = new Client(id_client,"test","test","test","test","test","test","test");
			daos.getClientDAO().delete(cl1);
			System.out.println("Veuillez choisir la fonction que vous voulez utiliser \nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer\"");
			choix_Client = scanner.nextInt();
		}
		
		if (choix_Client == 3)
		{
			int id_client;
			String nom;
			String prenom;
			String no_rue;
			String voie;
			String code_postal;
			String ville;
			String pays;
			System.out.println("Veuillez ecrire votre id_client");
			id_client= scanner.nextInt();
			System.out.println("Veuillez ecrire votre nom");
			nom= scanner.next();
			System.out.println("Veuillez ecrire votre prenom");
			prenom= scanner.next();
			System.out.println("Veuillez ecrire votre no_rue");
			no_rue= scanner.next();
			System.out.println("Veuillez ecrire votre voie");
			voie= scanner.next();
			System.out.println("Veuillez ecrire votre code postal");
			code_postal= scanner.next();
			System.out.println("Veuillez ecrire votre ville");
			ville= scanner.next();
			System.out.println("Veuillez ecrire votre pays");
			pays= scanner.next();
			Client cl1 = new Client(id_client,nom,prenom,no_rue,voie,code_postal,ville,pays);
			daos.getClientDAO().update(cl1);
			System.out.println("Veuillez choisir la fonction que vous voulez utiliser \nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer\"");
			choix_Client = scanner.nextInt();
		}
		
		if (choix_Client == 4)
		{
			int id_client;
			System.out.println("Veuillez ecrire votre id_client");
			id_client = scanner.nextInt();
			daos.getRevueDAO().getById(id_client);
			System.out.println("Veuillez choisir la fonction que vous voulez utiliser \nVoici les differentes fonctions disponible:\n1 Ajouter \n2 Supprimer \n3 Modifier \n4 getById \n5 Fermer\"");
			choix_Client = scanner.nextInt();
		}
		
		if (choix_Client == 5)
		{
			System.out.println("Retour menu principal");
			menu1.Menu_principal();
		}
	}

}
