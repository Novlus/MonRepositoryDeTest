package dao;

import java.sql.*;
import modele.metier.Periodicite;
import connexion.Connexion;


public class MySQLPeriodiciteDAO implements DAO<Periodicite>
{

	
	private static MySQLPeriodiciteDAO instance;
	private MySQLPeriodiciteDAO() {}
	public static MySQLPeriodiciteDAO getInstance() 
	{
	if (instance==null) {
	instance = new MySQLPeriodiciteDAO();
	}
	return instance;
	}
	@Override
	public Periodicite getById(int id) {
		Periodicite periodicite = null;
		try {
			Connexion c1 = new Connexion();
			Connection laConnexion= c1.creeConnexion();
			PreparedStatement requete = laConnexion.prepareStatement("select * from Periodicite where no_periodicite=?");
			requete.setInt(1, id);
			ResultSet res = requete.executeQuery();
			if (res.next()) 
			{
				int cle = res.getInt(1);
			}
			}catch (SQLException e) 
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
				return periodicite;
	}
		
	
	public Periodicite getByLibelle(String libelle) 
	{
		Periodicite periodicite = null;
		try {
			Connexion c1 = new Connexion();
			Connection laConnexion= c1.creeConnexion();
			PreparedStatement requete = laConnexion.prepareStatement("select * from Periodicite where libelle=?");
			requete.setString(1, libelle);
			ResultSet res = requete.executeQuery();
			if (res.next()) 
			{
				int cle = res.getInt(1);
			}
			}catch (SQLException e) 
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
				return periodicite;
	}
	

	@Override
	public boolean create(Periodicite objet) {
		// TODO Auto-generated method stub
		try {
		Connexion c1 = new Connexion();
		Connection laConnexion= c1.creeConnexion();
		PreparedStatement requete = laConnexion.prepareStatement("insert into Periodicite (libelle) values(?)",Statement.RETURN_GENERATED_KEYS);
		requete.setString(1, objet.getLibelle()); 
		int nbLignes = requete.executeUpdate();
		ResultSet res = requete.getGeneratedKeys();
		if(res.next())
		{
			int cle = res.getInt(1);
		}
		}catch (SQLException e) 
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean update(Periodicite objet) {
		try {
			Connexion c1 = new Connexion();
			Connection laConnexion= c1.creeConnexion();
			Statement Statut = laConnexion.createStatement();
			
			Statut.executeUpdate("update Periodicite set libelle = '"+objet.getLibelle()+"' where id_periodicite ="+objet.getId_periodicite()+"");
					
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			return true;
		}
		

	@Override
	public boolean delete(Periodicite objet) 
	{
		try {
			Connexion c1 = new Connexion();
			Connection laConnexion= c1.creeConnexion();
			Statement Statut = laConnexion.createStatement();
			int nbLignes = Statut.executeUpdate("delete from Periodicite where id_periodicite = "+objet.getId_periodicite()+"" );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
