package dao;

import java.sql.*;
import java.util.List;

import modele.metier.Client;
import connexion.Connexion;

public class MySQLClientDAO implements DAO<Client>
{

	private static MySQLClientDAO instance;
	private MySQLClientDAO() {}
	public static MySQLClientDAO getInstance() {
	if (instance==null) {
	instance = new MySQLClientDAO();
	}
	return instance;
	}
	@Override
	public Client getById(int id) 
	{
		Client client = null;
	
		try {
		Connexion c1 = new Connexion();
		Connection laConnexion= c1.creeConnexion();
		PreparedStatement requete = laConnexion.prepareStatement("select * from Client where no_client=?");
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
			return client;
	}
	
	public List<Client> getByNomPrenomNorueVoieCodepostalVillePays(String nom, String prenom, String no_rue, String voie, String code_postal,String ville, String Pays)
	{
		List<Client> client = null;
		try {
			Connexion c1 = new Connexion();
			Connection laConnexion= c1.creeConnexion();
			PreparedStatement requete = laConnexion.prepareStatement("select * from Client where nom=? and prenom=? and no_rue=? and voie=? and code_postal=? and ville =? and pays=?" );
			requete.setString(1,nom); requete.setString(2, prenom); requete.setString(3,no_rue); requete.setString(4, voie); requete.setString(5, code_postal); requete.setString(6, ville); requete.setString(7, Pays);
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
				return client;

	}

	@Override
	public boolean create(Client objet) {
		try {
			Connexion c1 = new Connexion();
			Connection laConnexion= c1.creeConnexion();
			
				
				PreparedStatement requete = laConnexion.prepareStatement("insert into CLient (nom,prenom,no_rue,voie,code_postal,ville,pays) values(?, ?, ?, ?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
				requete.setString(1, objet.getNom()); requete.setString(2, objet.getPrenom()); requete.setString(3, objet.getNo_rue());requete.setString(4, objet.getVoie());requete.setString(5, objet.getCode_postal());requete.setString(6, objet.getVille()); requete.setString(7, objet.getPays());
			
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
		return true;
	}
	

	@Override
	public boolean update(Client objet) {
		try {
			Connexion c1 = new Connexion();
			Connection laConnexion= c1.creeConnexion();
			Statement Statut = laConnexion.createStatement();
			
			
			Statut.executeUpdate("update Client set nom = '"+objet.getNom()+"' where id_client ="+objet.getId_client()+"");
			Statut.executeUpdate("update Client set prenom = '"+objet.getPrenom()+"'where id_client ="+objet.getId_client()+"");
			Statut.executeUpdate("update Client set no_rue = '"+objet.getNo_rue()+"'where id_client ="+objet.getId_client()+"");
			Statut.executeUpdate("update Client set voie = '"+objet.getVoie()+"'where id_client ="+objet.getId_client()+"");
			Statut.executeUpdate("update Client set code_postal = '"+objet.getCode_postal()+"'where id_client ="+objet.getId_client()+"");
			Statut.executeUpdate("update Client set ville = '"+objet.getVille()+"' where id_client ="+objet.getId_client()+"");
			Statut.executeUpdate("update Client set pays = '"+objet.getPays()+"'where id_client ="+objet.getId_client()+"");
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean delete(Client objet) 
	{
		try {
			Connexion c1 = new Connexion();
			Connection laConnexion= c1.creeConnexion();
			Statement Statut = laConnexion.createStatement();
			int nbLignes = Statut.executeUpdate("delete from Client where id_client = "+objet.getId_client()+"" );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}
