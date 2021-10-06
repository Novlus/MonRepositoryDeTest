package dao;

import java.util.List;

import modele.metier.Periodicite;
import modele.metier.Revue;

public interface RevueDAO extends DAO<Revue>
{
	public abstract List<Revue> getByTitreDescriptionTarifVisuelIdPeriodicite(String titre, String description, float tarif_numero, String visuel);
	public abstract List<Revue> getById_periodicite(Periodicite id_periodicite);
}
