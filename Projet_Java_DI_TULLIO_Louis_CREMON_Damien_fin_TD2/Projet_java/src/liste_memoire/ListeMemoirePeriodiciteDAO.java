package liste_memoire;

	import java.util.ArrayList;
	import java.util.List;

	import dao.PeriodiciteDAO;
	import modele.metier.Periodicite;

	public class ListeMemoirePeriodiciteDAO implements PeriodiciteDAO {

		private static ListeMemoirePeriodiciteDAO instance;

		private List<Periodicite> donnees;


		public static ListeMemoirePeriodiciteDAO getInstance() {

			if (instance == null) {
				instance = new ListeMemoirePeriodiciteDAO();
			}

			return instance;
		}

		private ListeMemoirePeriodiciteDAO() {

			this.donnees = new ArrayList<Periodicite>();

			this.donnees.add(new Periodicite(1, "Mensuel"));
			this.donnees.add(new Periodicite(2, "Quotidien"));
		}

		@Override
		public boolean create(Periodicite objet) {

			objet.setId_periodicite(3);
			// Ne fonctionne que si l'objet métier est bien fait...
			while (this.donnees.contains(objet)) {

				objet.setId_periodicite(objet.getId_periodicite()+ 1);
			}
			boolean ok = this.donnees.add(objet);
			afficher();
			
			return ok;
		}

		@Override
		public boolean update(Periodicite objet) {
			
			// Ne fonctionne que si l'objet métier est bien fait...
			int idx = this.donnees.indexOf(objet);
			if (idx == -1) {
				throw new IllegalArgumentException("Tentative de modification d'un objet inexistant");
			} else {
				
				this.donnees.set(idx, objet);
			}
			afficher();
			return true;
		}
		
		public void afficher()
		{
			System.out.println(this.donnees);
		}

		@Override
		public boolean delete(Periodicite objet) {

			Periodicite supprime;
			
			// Ne fonctionne que si l'objet métier est bien fait...
			int idx = this.donnees.indexOf(objet);
			if (idx == -1) {
				throw new IllegalArgumentException("Tentative de suppression d'un objet inexistant");
			} else {
				supprime = this.donnees.remove(idx);
			}
			afficher();
			return objet.equals(supprime);
		}

		@Override
		public Periodicite getById(int id) {
			// Ne fonctionne que si l'objet métier est bien fait...
			int idx = this.donnees.indexOf(new Periodicite(id, "test"));
			if (idx == -1) {
				throw new IllegalArgumentException("Aucun objet ne possède cet identifiant");
			} else {
				System.out.println(donnees.get(idx));
				return this.donnees.get(idx);
			}
		}
		

		/*@Override
		public Periodicite getByLibelle(String libelle) 
		{
			Periodicite p1 = new Periodicite(libelle);
			String libelle2 =p1.getLibelle();
			if (libelle == null) {
				throw new IllegalArgumentException("Aucun objet ne possede ce libelle");
			} else {
				System.out.println(donnees.get(idx));
				return this.donnees.get(libelle2);
			}
		}*/


	
	}

