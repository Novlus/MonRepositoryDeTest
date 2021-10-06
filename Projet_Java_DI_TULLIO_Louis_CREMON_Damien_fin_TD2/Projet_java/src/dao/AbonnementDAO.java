package dao;

import java.time.LocalDate;
import java.util.List;

import modele.metier.Abonnement;
import modele.metier.Client;
import modele.metier.Revue;

public interface AbonnementDAO extends DAO<Abonnement>
{
	public abstract List<Abonnement> getByDatedebutDatefinIdclientIdrevue(LocalDate date_debut,LocalDate date_fin);
	public abstract List<Abonnement> getByIdclient(Client id_client);
	public abstract List<Abonnement> getByIdrevue(Revue id_revue);
}
