package factory;

import dao.AbonnementDAO;
import dao.ClientDAO;
import dao.PeriodiciteDAO;
import dao.RevueDAO;
import liste_memoire.ListeMemoireAbonnementDAO;
import liste_memoire.ListeMemoireClientDAO;
import liste_memoire.ListeMemoirePeriodiciteDAO;
import liste_memoire.ListeMemoireRevueDAO;

public class ListeMemoireDAOFactory extends DAOFactory {

	@Override
	public PeriodiciteDAO getPeriodiciteDAO() {
		// TODO Auto-generated method stub
		return ListeMemoirePeriodiciteDAO.getInstance();
	}

	@Override
	public RevueDAO getRevueDAO() {
		// TODO Auto-generated method stub
		return ListeMemoireRevueDAO.getInstance();
	}

	@Override
	public ClientDAO getClientDAO() {
		// TODO Auto-generated method stub
		return ListeMemoireClientDAO.getInstance();
	}

	@Override
	public AbonnementDAO getAbonnementDAO() {
		// TODO Auto-generated method stub
		return ListeMemoireAbonnementDAO.getInstance();
	}

	

}
