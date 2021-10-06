package dao;

import java.sql.*;
import java.util.List;

import modele.metier.Periodicite;
import modele.metier.Revue;
import connexion.Connexion;


public class MySQLRevueDAO implements DAO<Revue>, RevueDAO
{

	private static MySQLRevueDAO instance;
	private MySQLRevueDAO() {}
	private Connexion c1 = new Connexion();
	private Connection laConnexion = c1.creeConnexion();
	public static MySQLRevueDAO getInstance() {
	if (instance==null) {
	instance = new MySQLRevueDAO();
	}
	return instance;
	}
	@Override
	public Revue getById(int id) {
		Revue revue = null;
		try {
			PreparedStatement requete = this.laConnexion.prepareStatement("select * from Revue where id_revue=?");
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
			affichageRevue();
				return revue;
	}
	
	public List<Revue> getByTitreDescriptionTarifVisuelIdPeriodicite(String titre, String description, float tarif_numero, String visuel)
	{
		List<Revue> revue = null;
		try {
			PreparedStatement requete = this.laConnexion.prepareStatement("select * from Revue where titre=? and description=? and tarif_numero=? and visuel=?" );
			requete.setString(1,titre); requete.setString(2, description); requete.setFloat(3, tarif_numero); requete.setString(4, visuel);
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
			affichageRevue();
				return revue;

	}
	
	public List<Revue> getById_periodicite(Periodicite id_periodicite)
	{
		List<Revue> revue = null;
		try {
			PreparedStatement requete = this.laConnexion.prepareStatement("select * from Revue where id_periodicite=?" );
			requete.setInt(1,id_periodicite.getId_periodicite()); 
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
			affichageRevue();
				return revue;

	}

	@Override
	public boolean create(Revue objet) 
	{
		try {
				PreparedStatement requete = this.laConnexion.prepareStatement("insert into Revue (titre, description, tarif_numero, visuel, id_periodicite) values(?, ?, ?, ?,?)",Statement.RETURN_GENERATED_KEYS);
				requete.setString(1, objet.getTitre()); requete.setString(2, objet.getDescription()); requete.setFloat(3, objet.getTarif_numero());requete.setString(4, objet.getVisuel());requete.setInt(5, objet.getId_periodicite());
				int nbLignes = requete.executeUpdate();
				ResultSet res = requete.getGeneratedKeys();
				if(res.next())
				{
					int cle = res.getInt(1);
				}
				}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		affichageRevue();
		return true;
	}

	@Override
	public boolean update(Revue objet) 
	{
		try {
			Statement Statut = this.laConnexion.createStatement();
			
			
			Statut.executeUpdate("update Revue set titre = '"+objet.getTitre()+"' where id_revue ="+objet.getId_revue()+"");
			Statut.executeUpdate("update Revue set description = '"+objet.getDescription()+"'where id_revue ="+objet.getId_revue()+"");
			Statut.executeUpdate("update Revue set tarif_numero = '"+objet.getTarif_numero()+"'where id_revue ="+objet.getId_revue()+"");
			Statut.executeUpdate("update Revue set visuel = '"+objet.getVisuel()+"'where id_revue ="+objet.getId_revue()+"");
			Statut.executeUpdate("update Revue set id_periodicite = '"+objet.getId_periodicite()+"'where id_revue ="+objet.getId_revue()+"");
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		affichageRevue();
		return true;
	}

	@Override
	public boolean delete(Revue objet) {
		// TODO Auto-generated method stub
		try {
			Statement Statut = this.laConnexion.createStatement();
			int nbLignes = Statut.executeUpdate("delete from Revue where id_revue = "+objet.getId_revue()+"" );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		affichageRevue();
		return true;
	}

	public void  affichageRevue ()
	{
		
	ResultSet ResultSet;
	try 
	{
		Statement Statut = this.laConnexion.createStatement();
		ResultSet = Statut.executeQuery("select * from Revue");
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
