package modele.metier;

public class Revue 
{
	private int id_revue;
	private String titre;
	private String description;
	private float tarif_numero;
	private String visuel;
	private int id_periodicite;
	
	public Revue (String titre, String description, float tarif_numero,String visuel, int id_periodicite) 
	{
		this(-1,titre,description,tarif_numero,visuel,id_periodicite);
	
		
		
		
		
	}

	public Revue(int id_revue, String titre2, String description2, float tarif_numero2, String visuel2, int id_periodicite2) 
	{
		this.setId_revue(id_revue);
		this.setTitre(titre2);
		this.setDescription(description2);
		this.setTarif_numero(tarif_numero2);
		this.setVisuel(visuel2);
		this.setId_periodicite(id_periodicite2);
	}

	public int getId_revue() {
		return this.id_revue;
	}

	public void setId_revue(int id_revue) {
		this.id_revue = id_revue;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) 
	{
		if (titre == null || titre.trim().length()==0) {
			throw new IllegalArgumentException("Titre de la revue vide !");
		}
		this.titre = titre;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) 
	{
		if (description == null || description.trim().length()==0) 
		{
			throw new IllegalArgumentException("description de la revue vide !");
		}
		this.description = description;
	}

	public float getTarif_numero() {
		return this.tarif_numero;
	}

	public void setTarif_numero(float tarif_numero) 
	{
		if (tarif_numero ==0)
	{
		throw new IllegalArgumentException("tarif_numero de la revue vide !");
	}
		this.tarif_numero = tarif_numero;
	}

	public String getVisuel() 
	{
		return this. visuel;
	}

	public void setVisuel(String visuel) 
	{
		if (visuel == null || visuel.trim().length()==0) 
		{
			throw new IllegalArgumentException("visuel de la revue vide !");
		}
		this.visuel = visuel;
	}

	public int getId_periodicite() {
		return this.id_periodicite;
	}

	public void setId_periodicite(int id_periodicite) 
	{
		if (id_periodicite ==0) 
		{
			throw new IllegalArgumentException("tarif_numero de la revue vide !");
		}
		this.id_periodicite = id_periodicite;
	}

	@Override
	public String toString() 
	{
		return "("+(this.id_revue>=0?this.id_revue:"nouveau")+")"+this.titre+this.description+this.tarif_numero+this.visuel+this.id_periodicite;
	}
}
