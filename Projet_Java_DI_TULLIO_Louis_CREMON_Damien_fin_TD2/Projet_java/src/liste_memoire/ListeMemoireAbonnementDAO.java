package liste_memoire;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import dao.AbonnementDAO;
import modele.metier.Abonnement;
import modele.metier.Client;
import modele.metier.Revue;


public class ListeMemoireAbonnementDAO implements AbonnementDAO {
	private static ListeMemoireAbonnementDAO instance;

	private List<Abonnement> donnees;


	public static ListeMemoireAbonnementDAO getInstance() {

		if (instance == null) {
			instance = new ListeMemoireAbonnementDAO();
		}

		return instance;
	}
	
	private ListeMemoireAbonnementDAO() {

		this.donnees = new ArrayList<Abonnement>();
		DateTimeFormatter formatage = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date_debut1 = LocalDate.parse("28/11/2000",formatage) ;
		LocalDate date_fin1 = LocalDate.parse("29/11/2012",formatage);
		LocalDate date_debut2 = LocalDate.parse("01/01/2021",formatage) ;
		LocalDate date_fin2 = LocalDate.parse("01/08/2021",formatage);
		this.donnees.add(new Abonnement(1, date_debut1,date_fin1, 1, 1));
		this.donnees.add(new Abonnement(2, date_debut2, date_fin2, 2, 2));
	}

	@Override
	public Abonnement getById(int id) 
	{
		DateTimeFormatter formatage = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// Ne fonctionne que si l'objet métier est bien fait...
		int idx = this.donnees.indexOf(new Abonnement(id, LocalDate.parse("01/02/2020",formatage), LocalDate.parse("01/08/2021",formatage), 1 ,1));
		if (idx == -1) 
		{
			throw new IllegalArgumentException("Aucun objet ne possède cet identifiant");
		} 
		else {
				System.out.println(this.donnees.get(idx));
				return this.donnees.get(idx);
			}
	}

	@Override
	public boolean create(Abonnement objet) {
		objet.setId_abonnement(3);
		// Ne fonctionne que si l'objet métier est bien fait...
		while (this.donnees.contains(objet)) {

			objet.setId_abonnement(objet.getId_abonnement() + 1);
		}
		boolean ok = this.donnees.add(objet);
		System.out.println(this.donnees);
		return ok;
	}

	@Override
	public boolean update(Abonnement objet) {
		// Ne fonctionne que si l'objet métier est bien fait...
			int idx = this.donnees.indexOf(objet);
			if (idx == -1) {
			throw new IllegalArgumentException("Tentative de modification d'un objet inexistant");
			} else {
						
						this.donnees.set(idx, objet);
					}
			System.out.println(this.donnees);
			return true;
	}

	@Override
	public boolean delete(Abonnement objet) {
		Abonnement supprime;
		
		// Ne fonctionne que si l'objet métier est bien fait...
		int idx = this.donnees.indexOf(objet);
		if (idx == -1) {
			throw new IllegalArgumentException("Tentative de suppression d'un objet inexistant");
		} else {
			supprime = this.donnees.remove(idx);
		}
		System.out.println(this.donnees);
		return objet.equals(supprime);
	}

	@Override
	public List<Abonnement> getByDatedebutDatefinIdclientIdrevue(LocalDate date_debut, LocalDate date_fin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Abonnement> getByIdclient(Client id_client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Abonnement> getByIdrevue(Revue id_revue) {
		// TODO Auto-generated method stub
		return null;
	}

}
