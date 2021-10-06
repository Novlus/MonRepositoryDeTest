package modele.metier;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Abonnement 
{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date_debut == null) ? 0 : date_debut.hashCode());
		result = prime * result + ((date_fin == null) ? 0 : date_fin.hashCode());
		result = prime * result + id_abonnement;
		result = prime * result + id_client;
		result = prime * result + id_revue;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Abonnement other = (Abonnement) obj;
		if (id_abonnement != other.id_abonnement)
			return false;
		return true;
	}

	private int id_abonnement;
	DateTimeFormatter formatage = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate date_debut;
	private LocalDate date_fin;
	private int id_client;
	private int id_revue;
	
	public Abonnement (LocalDate date_debut, LocalDate date_fin, int id_client, int id_revue) 
	{
		this(-1,date_debut,date_fin,id_client,id_revue);
		
	}
	
	public Abonnement(int id_abonnement,LocalDate date_debut2, LocalDate date_fin2, int id_client2, int id_revue2) 
	{
		this.setId_abonnement(id_abonnement);
		this.setDate_debut(date_debut2);
		this.setDate_fin(date_fin2);
		this.setId_client(id_client2);
		this.setId_revue(id_revue2);
	}
	
	public int getId_abonnement() 
	{
		return this.id_abonnement;
	}

	public void setId_abonnement(int id_abonnement) 
	{
		this.id_abonnement = id_abonnement;
		
		
	}

	public LocalDate getDate_debut() 
	{
		return this.date_debut;
		
	}

	public void setDate_debut(LocalDate date_debut) {
		if (date_debut == null ) {
			throw new IllegalArgumentException("date de debut de l'abonnement vide !");
		}
		this.date_debut = date_debut;
	}

	public LocalDate getDate_fin() {
		return this.date_fin;
	}

	public void setDate_fin(LocalDate date_fin) {
		if (date_fin == null ) {
			throw new IllegalArgumentException("date de fin de l'abonnement vide !");
		}
		this.date_fin = date_fin;
	}

	public int getId_client() 
	{
		return this.id_client;
	}

	public void setId_client(int id_client) {
		this.id_client = id_client;
	}

	public int getId_revue() {
		return this.id_revue;
	}

	public void setId_revue(int id_revue) {
		this.id_revue = id_revue;
		
	}

	@Override
	public String toString() {
		return"("+(this.id_abonnement>=0?this.id_abonnement:"nouveau")+")"+this.date_debut+','+this.date_fin+','+this.id_client+','+this.id_revue ;
	}

}
