package dao;

import modele.metier.Periodicite;

public interface PeriodiciteDAO extends DAO<Periodicite>
{
	public abstract Periodicite getByLibelle(String libelle);
}
