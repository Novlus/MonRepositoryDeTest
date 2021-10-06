package modele.metier;

public class Periodicite 
{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_periodicite;
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
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
		Periodicite other = (Periodicite) obj;
		if (id_periodicite != other.id_periodicite)
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return true;
		return true;
	}



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
