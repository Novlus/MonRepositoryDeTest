package modele.metier;

public class Periodicite 
{
	private int id_periodicite;
	public int getId_periodicite() {
		return this.id_periodicite;
	}

	public void setId_periodicite(int id_periodicite) {
		this.id_periodicite = id_periodicite;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		if (libelle == null || libelle.trim().length()==0) {
			throw new IllegalArgumentException("Libelle de la periodicite vide !");
		}
		this.libelle = libelle;
	}
	
	public String toString() 
	{
		return"("+(this.id_periodicite>=0?this.id_periodicite:"nouveau")+")"+this.libelle;
	}

	private String libelle;
	
	public Periodicite (String libelle) 
	{
		this(-1,libelle);
	}

	public Periodicite(int id_periodicite, String libelle2) 
	{
		this.setId_periodicite(id_periodicite);
		this.setLibelle(libelle2);
	}

}
