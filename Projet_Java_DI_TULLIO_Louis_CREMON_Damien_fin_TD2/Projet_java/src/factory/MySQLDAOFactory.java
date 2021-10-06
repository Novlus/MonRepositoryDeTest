package factory;


import dao.AbonnementDAO;
import dao.ClientDAO;
import dao.MySQLAbonnementDAO;
import dao.MySQLClientDAO;
import dao.MySQLPeriodiciteDAO;
import dao.MySQLRevueDAO;
import dao.PeriodiciteDAO;
import dao.RevueDAO;


public class MySQLDAOFactory extends DAOFactory 
{

	@Override
	public PeriodiciteDAO getPeriodiciteDAO() {
		// TODO Auto-generated method stub
		return MySQLPeriodiciteDAO.getInstance();
	}

	@Override
	public RevueDAO getRevueDAO() {
		// TODO Auto-generated method stub
		return MySQLRevueDAO.getInstance();
	}

	@Override
	public ClientDAO getClientDAO() {
		// TODO Auto-generated method stub
		return MySQLClientDAO.getInstance();
	}

	@Override
	public AbonnementDAO getAbonnementDAO() {
		// TODO Auto-generated method stub
		return MySQLAbonnementDAO.getInstance();
	}

}
