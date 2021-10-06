package menu;

import java.util.Scanner;

import factory.DAOFactory;
import factory.Persistance;

public class Menu 
{
	public void Menu_principal() 
	{
		Menu_Abonnement menu_a = new Menu_Abonnement();
		Menu_Client menu_c = new Menu_Client();
		Menu_Periodicite menu_p = new Menu_Periodicite();
		Menu_Revue menu_r = new Menu_Revue();
		
		int choix_Persistance;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choisissez \n1 pour travailler avec mysql \n2 pour travailler avec des listes memoires\n3 pour Fermer");
		choix_Persistance = scanner.nextInt();
		while (choix_Persistance <1 || choix_Persistance>3) 
		{
			System.out.println("Erreur vous vous êtes trompé .\nRecommencer\n1 Persistance mysql\n2 Persistance liste mémoire\n3 Fermer");
			choix_Persistance = scanner.nextInt();
		}
		
		while (choix_Persistance<3) 
		{
			if (choix_Persistance == 1)
			{
				DAOFactory daos = DAOFactory.getDAOFactory(Persistance.MYSQL);
				int choix_Table;
				System.out.println("Choisissez la table sur laquelle vous voulez travailler\n1 Periodicite \n2 Revu \n3 Client \n4 Abonnement\n5 Fermer");
				choix_Table = scanner.nextInt();
				while (choix_Table <1 || choix_Table >6)
				{
					System.out.println("Erreur vous vous êtes trompé .\nRecommencer\n1 Periodicite \n2 Revu \n3 Client \n4 Abonnement\n5 changement de persistance\n6 fermeture du programme");
					choix_Table = scanner.nextInt();
				}
				if (choix_Table ==1)
				{
					menu_p.menuPeriodicite(daos);
				}
				
				if(choix_Table == 2)
				{
					menu_r.menuRevue(daos);
				}
				
				if(choix_Table ==3)
				{
					menu_c.menuClient(daos);
				}
				if(choix_Table == 4)
				{
					menu_a.menuAbonnement(daos);
				}
				
				if(choix_Table == 5)
				{
					System.out.println("Choisissez la persitance que vous souhaiter:\n1 SQL\n2 Liste memoire");
					choix_Persistance = scanner.nextInt();
				}
				
				if(choix_Table == 6)
				{
					System.out.println("Fermeture du programme");
					System.exit(0); //ferme le programme java
				}
			}
			
			
			if (choix_Persistance == 2)
			{
				DAOFactory daos = DAOFactory.getDAOFactory(Persistance.LISTE_MEMOIRE);
				int choix_Table;
				System.out.println("Choisissez la table sur laquelle vous voulez travailler\n1 Periodicite \n2 Revu \n3 Client \n4 Abonnement\n5 Fermer");
				choix_Table = scanner.nextInt();
				while (choix_Table <1 || choix_Table >5)
				{
					System.out.println("Erreur vous vous êtes trompé .\nRecommencer\n1 Periodicite \n2 Revu \n3 Client \n4 Abonnement\n5 Fermer");
					choix_Table = scanner.nextInt();
				}
				if (choix_Table ==1)
				{
					menu_p.menuPeriodicite(daos);
				}
				
				if(choix_Table == 2)
				{
					menu_r.menuRevue(daos);
				}
				
				if(choix_Table ==3)
				{
					menu_c.menuClient(daos);
				}
				if(choix_Table == 4)
				{
					menu_a.menuAbonnement(daos);
				}
				if(choix_Table == 5)
				{
					System.out.println("Choisissez la persitance que vous souhaiter:\n1 SQL\n2 Liste memoire");
					choix_Persistance = scanner.nextInt();
				}
				if(choix_Table == 6)
				{
					System.out.println("Fermeture du programme");
					System.exit(0); //ferme le programme java
				}
			}
			if (choix_Persistance == 3)
			{
				System.out.println("Fermeture du programme");
				System.exit(0); //ferme le programme java
			}
			
		}
	}
	
}
