package dao;

import java.sql.*;
import modele.metier.Periodicite;
import connexion.Connexion;


public class MySQLPeriodiciteDAO implements PeriodiciteDAO
{

	private static MySQLPeriodiciteDAO instance;
	private MySQLPeriodiciteDAO() {}
	private Connexion c1 = new Connexion();
	private Connection laConnexion = c1.creeConnexion();
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
			PreparedStatement requete = this.laConnexion.prepareStatement("select * from Periodicite where id_periodicite=?");
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
			affichagePeriodicite();
				return periodicite;
	}
		
	
	public Periodicite getByLibelle(String libelle) 
	{
		Periodicite periodicite = null;
		try {
			PreparedStatement requete = this.laConnexion.prepareStatement("select * from Periodicite where libelle=?");
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
		PreparedStatement requete = this.laConnexion.prepareStatement("insert into Periodicite (libelle) values(?)",Statement.RETURN_GENERATED_KEYS);
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
		affichagePeriodicite();
		return true;
		
	}

	@Override
	public boolean update(Periodicite objet) {
		try {
			Statement Statut = this.laConnexion.createStatement();
			
			Statut.executeUpdate("update Periodicite set libelle = '"+objet.getLibelle()+"' where id_periodicite ="+objet.getId_periodicite()+"");
					
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			affichagePeriodicite();
			return true;
		}
		

	@Override
	public boolean delete(Periodicite objet) 
	{
		try {
			Statement Statut = this.laConnexion.createStatement();
			int nbLignes = Statut.executeUpdate("delete from Periodicite where id_periodicite = "+objet.getId_periodicite()+"" );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		affichagePeriodicite();
		return true;
	}
	
	public void  affichagePeriodicite ()
	{
		
	ResultSet ResultSet;
	try 
	{
		Statement Statut = this.laConnexion.createStatement();
		ResultSet = Statut.executeQuery("select * from Periodicite");
		while (ResultSet.next())
		{
			System.out.println("libelle: "+ResultSet.getString(2)+"\nid: "+ResultSet.getInt(1));
		}
		
		
		
	} catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
