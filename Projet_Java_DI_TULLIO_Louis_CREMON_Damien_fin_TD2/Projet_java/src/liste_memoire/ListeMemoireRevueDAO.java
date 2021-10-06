package liste_memoire;

import java.util.ArrayList;
import java.util.List;

import dao.RevueDAO;
import modele.metier.Periodicite;
import modele.metier.Revue;

public class ListeMemoireRevueDAO implements RevueDAO
{
	private static ListeMemoireRevueDAO instance;

	private List<Revue> donnees;


	public static ListeMemoireRevueDAO getInstance() {

		if (instance == null) {
			instance = new ListeMemoireRevueDAO();
		}

		return instance;
	}
	
	private ListeMemoireRevueDAO() {

		this.donnees = new ArrayList<Revue>();

		this.donnees.add(new Revue(1, "Zombie","mort vivant",3.25F,"Neuf",4));
		this.donnees.add(new Revue(2, "Narnia","armoire",10.25F,"abimés",18));
	}


	@Override
	public Revue getById(int id) {
		int idx = this.donnees.indexOf(new Revue(id, "test","test",0.00F,"test",785));
		if (idx == -1) {
			throw new IllegalArgumentException("Aucun objet ne possède cet identifiant");
		} else {
			System.out.println(this.donnees.get(idx));
			return this.donnees.get(idx);
		}
	}


	@Override
	public boolean create(Revue objet) {
		objet.setId_revue(3);
		// Ne fonctionne que si l'objet métier est bien fait...
		while (this.donnees.contains(objet)) {

			objet.setId_revue(objet.getId_revue()+ 1);
		}
		boolean ok = this.donnees.add(objet);
		System.out.println(donnees);
		return ok;
	}


	@Override
	public boolean update(Revue objet) {
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
	public boolean delete(Revue objet) {
		Revue supprime;
		
		// Ne fonctionne que si l'objet métier est bien fait...
		int idx = this.donnees.indexOf(objet);
		if (idx == -1) {
			throw new IllegalArgumentException("Tentative de suppression d'un objet inexistant");
		} else {
			supprime = this.donnees.remove(idx);
			System.out.println(donnees);
			
		}
		
		return objet.equals(supprime);
	}
	
	
	


	@Override
	public List<Revue> getByTitreDescriptionTarifVisuelIdPeriodicite(String titre, String description,
			float tarif_numero, String visuel) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Revue> getById_periodicite(Periodicite id_periodicite) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
