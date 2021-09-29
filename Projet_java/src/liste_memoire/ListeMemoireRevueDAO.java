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
			return this.donnees.get(idx);
		}
	}


	@Override
	public boolean create(Revue objet) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean update(Revue objet) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean delete(Revue objet) {
		// TODO Auto-generated method stub
		return false;
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
