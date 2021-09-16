package java_TD1;

import java.util.Scanner;

public class Menu 
{

	public void Menu_principal() {
	int choix;
	Menu Menu1;
	Scanner scanner = new Scanner(System.in);
	Abonnement a1 = new Abonnement();
	Client cl1 = new Client();
	Periodicite p1 = new Periodicite();
	Revue r1 = new Revue();
	System.out.println("Vous avez le choix entre plusieur sous menu\n1 menu Periodicite\n2 menu Revue\n3 menu Client\n4 menu Abonnement\n5 Fermer");
	System.out.println("veuillez faire votre choix");
	choix = scanner.nextInt();
	while (choix <1 || choix>5) 
	{
		System.out.println("Erreur vous vous êtes trompé .\nRecommencern1 menu Periodicite\n2 menu Revue\n3 menu Client\n4 menu Abonnement\n5 Fermer");
		choix = scanner.nextInt();
	}
	
	while (choix<5) {
	
	if (choix == 1)
	{
		p1.menuPeriodicite();
	}
	if (choix == 2)
	{
	 r1.menuRevue();
	}
	
	if(choix == 3)
	{
		cl1.menuClient();
	}
	if(choix == 4) 
	{
		a1.menuAbonnement();
	}
	}
	if(choix==5)
	{
		System.out.println("Fermeture du programme");
		System.exit(0); //ferme le programme java
	}
}
}
