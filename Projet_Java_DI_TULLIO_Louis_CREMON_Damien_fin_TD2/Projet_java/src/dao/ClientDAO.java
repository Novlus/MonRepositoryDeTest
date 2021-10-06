package dao;

import java.util.List;

import modele.metier.Client;

public interface ClientDAO extends DAO<Client>
{
	public abstract List<Client> getByNomPrenomNorueVoieCodepostalVillePays(String nom, String prenom, String no_rue, String voie, String code_postal,String ville, String Pays);
}
