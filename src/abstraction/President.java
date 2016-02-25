package abstraction;

public class President
{
	
	private String prenom, nom;

	public President() {}
	
	public President(String prenom, String nom) {
		this.setPrenom(prenom);
		this.setNom(nom);
	}

	private String getNom()
	{
		return nom;
	}

	private void setNom(String nom)
	{
		this.nom = nom;
	}

	private String getPrenom()
	{
		return prenom;
	}

	private void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}
	
}
