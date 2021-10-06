package modele.metier;

public class Client 
{
	private int id_client;
	private String nom;
	private String prenom;
	private String no_rue;
	private String voie;
	private String code_postal;
	private String ville;
	private String pays;
	
	public Client(String nom,String prenom, String no_rue, String voie, String code_postal, String ville, String pays)
	{
		this(-1,nom,prenom,no_rue,voie,code_postal,ville,pays);
	}
	
	public Client(int id_client, String nom2, String prenom2, String no_rue2, String voie2, String code_postal2, String ville2,
			String pays2) {
		
		this.setId_client(id_client);
		this.setNom(nom2);
		this.setPrenom(prenom2);
		this.setNo_rue(no_rue2);
		this.setVoie(voie2);
		this.setCode_postal(code_postal2);
		this.setVille(ville2);
		this.setPays(pays2);
	}

	public int getId_client() {
		return this.id_client;
	}
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}
	public String getNom() {
		return this.nom;
	}


	public void setNom(String nom) 
	{
		if (nom== null || nom.trim().length()==0) 
		{
			throw new IllegalArgumentException("nom du Client vide !");
		}
		this.nom = nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public void setPrenom(String prenom) {
		if (prenom == null || prenom.trim().length()==0) 
		{
			throw new IllegalArgumentException("prenom du client vide !");
		}
		this.prenom = prenom;
	}
	public String getNo_rue() {
		return this.no_rue;
	}
	public void setNo_rue(String no_rue) {
		if (no_rue == null || no_rue.trim().length()==0) 
		{
			throw new IllegalArgumentException("numero de rue  du client vide !");
		}
		this.no_rue = no_rue;
	}
	public String getVoie() {
		return this.voie;
	}
	public void setVoie(String voie) {
		if (voie == null || voie.trim().length()==0) 
		{
			throw new IllegalArgumentException("voie du client vide !");
		}
		this.voie = voie;
	}
	public String getCode_postal() {
		return this.code_postal;
	}
	public void setCode_postal(String code_postal) {
		if (code_postal == null || code_postal.trim().length()==0) 
		{
			throw new IllegalArgumentException("code_postal du client vide !");
		}
		this.code_postal = code_postal;
	}
	public String getVille() {
		return this.ville;
	}
	public void setVille(String ville) {
		if (ville == null || ville.trim().length()==0) 
		{
			throw new IllegalArgumentException("ville du client vide !");
		}
		this.ville = ville;
	}
	public String getPays() {
		return this.pays;
	}
	public void setPays(String pays) {
		if (pays == null || pays.trim().length()==0) 
		{
			throw new IllegalArgumentException("pays du client vide !");
		}
		this.pays = pays;
	}
	
	@Override
	public String toString() 
	{
		return"("+(this.id_client>=0?this.id_client:"nouveau")+")"+this.nom+','+this.prenom+','+this.no_rue+','+this.voie+','+this.code_postal+','+this.ville+','+this.pays;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code_postal == null) ? 0 : code_postal.hashCode());
		result = prime * result + id_client;
		result = prime * result + ((no_rue == null) ? 0 : no_rue.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((pays == null) ? 0 : pays.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((ville == null) ? 0 : ville.hashCode());
		result = prime * result + ((voie == null) ? 0 : voie.hashCode());
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
		Client other = (Client) obj; 
		if (id_client != other.id_client)
			return false;
		return true;
	}
	
}
