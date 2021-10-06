package liste_memoire;

import java.util.ArrayList;
import java.util.List;

import dao.ClientDAO;
import dao.PeriodiciteDAO;
import modele.metier.Client;
import modele.metier.Periodicite;

public class ListeMemoireClientDAO implements ClientDAO {
	private static ListeMemoireClientDAO instance;

	private List<Client> donnees;


	public static ListeMemoireClientDAO getInstance() {

		if (instance == null) {
			instance = new ListeMemoireClientDAO();
		}

		return instance;
	}
	
	private ListeMemoireClientDAO() {

		this.donnees = new ArrayList<Client>();

		this.donnees.add(new Client(1, "Robert", "Nicolas", "78", "rue des paquerettes", "57000", "Metz", "France"));
		this.donnees.add(new Client(2, "Minich", "Sarah", "69", "rue des lilas", "54000", "Nancy", "France"));
	}

	@Override
	public Client getById(int id) {
		// Ne fonctionne que si l'objet métier est bien fait...
					int idx = this.donnees.indexOf(new Client(id, "test", "test", "test", "test", "test", "test", "test"));
					if (idx == -1) {
						throw new IllegalArgumentException("Aucun objet ne possède cet identifiant");
					} else {
						System.out.println(donnees.get(idx));
						return this.donnees.get(idx);
					}
	}

	@Override
	public boolean create(Client objet) {
		objet.setId_client(3);
		// Ne fonctionne que si l'objet métier est bien fait...
		while (this.donnees.contains(objet)) {

			objet.setId_client(objet.getId_client() + 1);
		}
		boolean ok = this.donnees.add(objet);
		System.out.println(donnees);
		
		return ok;
	}

	@Override
	public boolean update(Client objet) {
		// Ne fonctionne que si l'objet métier est bien fait...
					int idx = this.donnees.indexOf(objet);
					if (idx == -1) {
						throw new IllegalArgumentException("Tentative de modification d'un objet inexistant");
					} else {
						
						this.donnees.set(idx, objet);
					}
					System.out.println(donnees);
					return true;
	}

	@Override
	public boolean delete(Client objet) {
		Client supprime;
		
		// Ne fonctionne que si l'objet métier est bien fait...
		int idx = this.donnees.indexOf(objet);
		if (idx == -1) {
			throw new IllegalArgumentException("Tentative de suppression d'un objet inexistant");
		} else {
			supprime = this.donnees.remove(idx);
		}
		System.out.println(donnees);
		
		return objet.equals(supprime);
	}

	@Override
	public List<Client> getByNomPrenomNorueVoieCodepostalVillePays(String nom, String prenom, String no_rue,
			String voie, String code_postal, String ville, String Pays) {
		// TODO Auto-generated method stub
		return null;
	}

}
