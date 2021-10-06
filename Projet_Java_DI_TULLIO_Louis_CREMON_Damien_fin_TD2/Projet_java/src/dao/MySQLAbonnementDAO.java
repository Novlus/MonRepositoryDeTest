package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import connexion.Connexion;
import modele.metier.Abonnement;
import modele.metier.Client;
import modele.metier.Revue;

public class MySQLAbonnementDAO implements AbonnementDAO
{
	private static MySQLAbonnementDAO instance;
	private MySQLAbonnementDAO() {}
	private Connexion c1 = new Connexion();
	private Connection laConnexion = c1.creeConnexion();
	public static MySQLAbonnementDAO getInstance() {
	if (instance==null) {
	instance = new MySQLAbonnementDAO();
	}
	return instance;
	}

	@Override
	public Abonnement getById(int id) 
	{
		Abonnement abonnement = null;
	
		try {
				
				PreparedStatement requete = this.laConnexion.prepareStatement("select * from Abonnement where id_abonnement=?");
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
		affichageAbonnement();
		return abonnement;
	}
	
	public List<Abonnement> getByDatedebutDatefinIdclientIdrevue(LocalDate date_debut,LocalDate date_fin)
	{

		List<Abonnement> abonnement = null;
		try {
			DateTimeFormatter formatage = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			Date date_debut_sql = java.sql.Date.valueOf(date_debut) ;
			Date date_fin_sql =java.sql.Date.valueOf(date_fin);
			PreparedStatement requete = this.laConnexion.prepareStatement("select * from abonnement where date_debut=? and date_fin=?" );
			requete.setDate(1,date_debut_sql); requete.setDate(2, date_fin_sql); 
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
			affichageAbonnement();
				return abonnement;
	}
	
	public List<Abonnement> getByIdclient(Client id_client)
	{
		List<Abonnement> abonnement = null;
		try {
			PreparedStatement requete = this.laConnexion.prepareStatement("select * from abonnement where id_client=?" );
			requete.setInt(1,id_client.getId_client()); 
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
			affichageAbonnement();
				return abonnement;
	}
	
	public List<Abonnement> getByIdrevue(Revue id_revue)
	{
		List<Abonnement> abonnement = null;
		try {
			PreparedStatement requete = this.laConnexion.prepareStatement("select * from abonnement where id_revue=?" );
			requete.setInt(1,id_revue.getId_revue()); 
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
			affichageAbonnement();
				return abonnement;
	}

	@Override
	public boolean create(Abonnement objet) {
		try {
			DateTimeFormatter formatage = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			Date date_debut_sql = java.sql.Date.valueOf(objet.getDate_debut()) ;
			Date date_fin_sql =java.sql.Date.valueOf(objet.getDate_fin());
			
				
				PreparedStatement requete = this.laConnexion.prepareStatement("insert into Abonnement (date_debut,date_fin,id_client,id_revue) values(?, ?, ?, ?)",Statement.RETURN_GENERATED_KEYS);
				requete.setDate(1, date_debut_sql); requete.setDate(2, date_fin_sql); requete.setInt(3,objet.getId_client());requete.setInt(4, objet.getId_revue());
			
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
		affichageAbonnement();
		return true;
	}

	@Override
	public boolean update(Abonnement objet) {
		try {
			Statement Statut = this.laConnexion.createStatement();
			DateTimeFormatter formatage = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			Date date_debut_sql = java.sql.Date.valueOf(objet.getDate_debut()) ;
			Date date_fin_sql =java.sql.Date.valueOf(objet.getDate_fin());
			
			
			Statut.executeUpdate("update Abonnement set date_debut = '"+date_debut_sql+"' where id_abonnement ="+objet.getId_abonnement()+"");
			Statut.executeUpdate("update Abonnement set date_fin= '"+date_fin_sql+"'where id_abonnement ="+objet.getId_abonnement()+"");
			Statut.executeUpdate("update Abonnement set id_client = '"+objet.getId_client()+"'where id_abonnement ="+objet.getId_abonnement()+"");
			Statut.executeUpdate("update Abonnement set id_revue = '"+objet.getId_revue()+"'where id_abonnement ="+objet.getId_abonnement()+"");
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		affichageAbonnement();
		return true;
	}

	@Override
	public boolean delete(Abonnement objet) {
		try {
			Statement Statut = this.laConnexion.createStatement();
			int nbLignes = Statut.executeUpdate("delete from Abonnement where id_abonnement = "+objet.getId_abonnement()+"" );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		affichageAbonnement();
		return true;
	}
	
	public void  affichageAbonnement ()
	{
		
	ResultSet ResultSet;
	try 
	{
		Statement Statut = this.laConnexion.createStatement();
		ResultSet = Statut.executeQuery("select * from Abonnement");
		while (ResultSet.next())
		{
			System.out.println("libelle: "+ResultSet.getDate(2)+"\nid: "+ResultSet.getInt(1));
		}
		
		
		
	} catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}


}
