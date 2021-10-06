package factory;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import modele.metier.Abonnement;
import modele.metier.Client;
import modele.metier.Periodicite;
import modele.metier.Revue;

public class Test 
{
	public static void main(String [] args) 
	{
		DAOFactory daos = DAOFactory.getDAOFactory(Persistance.MYSQL);
		//Periodicite p2 = new Periodicite(20,"Bonsoir haha");
		//Periodicite p = new Periodicite("Matis_Toure");
		Periodicite p3 = new Periodicite(20,"test");
		//daos.getPeriodiciteDAO().create(p);
		daos.getPeriodiciteDAO().delete(p3);
		//daos.getPeriodiciteDAO().update(p2);
		//Revue r2 = new Revue("Ezreal", "League of Legend", 101.555F, "abimé", 95);
		//daos.getRevueDAO().create(r2);
		Client c1 = new Client("Marchal","Thierry","7","Boulevard Lobau", "54000", "Nancy", "France");
		//daos.getClientDAO().create(c1);
		//DateTimeFormatter formatage = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//Abonnement a1 = new Abonnement( LocalDate.of(2021,05,22), LocalDate.of(2021, 06, 22), 1, 1);
		//daos.getAbonnementDAO().create(a1);
		//daos.getAbonnementDAO().getById(4);
		
	
		// A partir d'ici, travail avec les fichiers XML
		daos = 
		DAOFactory.getDAOFactory(Persistance.LISTE_MEMOIRE);
		/*
		Periodicite p2 = new Periodicite("annuel");
		Periodicite p3 = new Periodicite ("decennie");
		Periodicite p4 = new Periodicite ("milenaire");
		Periodicite p5 = new Periodicite(4,"JSP");
		daos.getPeriodiciteDAO().create(p2);
		daos.getPeriodiciteDAO().create(p3);
		daos.getPeriodiciteDAO().create(p4);
		daos.getPeriodiciteDAO().update(p5);
		
		//daos.getPeriodiciteDAO().delete(p4);
		//daos.getPeriodiciteDAO().getById(4);
		//daos.getPeriodiciteDAO().update(p3);
		//daos.getPeriodiciteDAO().getByLibelle("Quotidien");
		//daos.getPeriodiciteDAO().update(p3);
		//daos.getPeriodiciteDAO().delete(p4);
		//daos.getPeriodiciteDAO().getById(4);
		//daos.getPeriodiciteDAO().update(p3);
		//daos.getPeriodiciteDAO().getByLibelle("Quotidien");
		//daos.getPeriodiciteDAO().update(p3);
		//daos.getPeriodiciteDAO().getById(1);
		*/
		
		
		//Periodicite fonctionne!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		//daos.getRevueDAO().create(r2);
		//daos.getRevueDAO().delete(r2);
		
		/*
		Client c5 = new Client(3, "CREMON", "Damien", "8 rue ", "la liberation", "54000", "Nancy", "France");
		Client  c1= new Client( "test", "tist", "tats", "tuts", "tique", "588791", "France");
		daos.getClientDAO().create(c1);
		Client  c2= new Client( "testo", "tistd", "tatsq", "tutds", "tiqsue", "58879d1", "Frdance");
		daos.getClientDAO().create(c2);
		Client  c3= new Client( "tesqdsto", "tiqsdfstd", "tatsqsdfq", "tqsdfutds", "tiqsdfqsue", "5qsdf8879d1", "Fqsdfrdance");
		daos.getClientDAO().create(c3);
		daos.getClientDAO().delete(c3);
		daos.getClientDAO().update(c5);
		daos.getClientDAO().getById(3); */
		
		// Client fonctionne!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
			/*
			Revue r4 = new Revue( 4,"Ezrealezezezeze", "Leagueze of Legend", 10155.555F, "abimée", 96);
			Revue r = new Revue("eazdazd", "sdqsSQEDDF", 3.555F, "QSFQQSDSQDVQDD", 100);
			daos.getRevueDAO().create(r);
			Revue r2 = new Revue( "Ezreal", "League of Legend", 101.555F, "abimé", 95);
			daos.getRevueDAO().create(r2);
			Revue r3 = new Revue( "Ezrealeze", "Leagueze of Legend", 10155.555F, "abimée", 96);
			daos.getRevueDAO().create(r3);
			daos.getRevueDAO().delete(r3);
			daos.getRevueDAO().update(r4);
			daos.getRevueDAO().getById(4);
		*/
		
		// Revue fonctionne!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		/*
			DateTimeFormatter formatage = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			Abonnement a1 = new Abonnement( LocalDate.parse("01/12/2020",formatage), LocalDate.parse("29/12/2020",formatage), 1, 10);
			Abonnement a2 = new Abonnement (LocalDate.parse("01/08/2021",formatage),LocalDate.parse("28/10/2021",formatage),2,5);
			Abonnement a3 = new Abonnement (3,LocalDate.parse("10/08/2021",formatage),LocalDate.parse("11/08/2021",formatage),3,5);
			daos.getAbonnementDAO().create(a1);
			daos.getAbonnementDAO().create(a2);
			daos.getAbonnementDAO().delete(a2);
			daos.getAbonnementDAO().update(a3);
			daos.getAbonnementDAO().getById(3);
		*/
		//Abonnement fonctionne!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	}
}
