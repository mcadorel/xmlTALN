package abstraction;

import java.util.List;

public class Edition
{

	private String acronyme;
	private String titre;
	private String ville;
	private String pays;
	private String dateDebut;
	private String dateFin;
	private List<President> presidents;
	private List<Editeur> editeurs;
	private List<TypeArticle> typesArticles;
	private String url;

	public Edition() {}
	
	public Edition(	String acronyme,
					String titre,
					String ville,
					String pays,
					String dateDebut,
					String dateFin,
					List<President> presidents,
					List<Editeur> editeurs,
					List<TypeArticle> typesArticles,
					String url) {
		this.acronyme = acronyme;
		this.titre = titre;
		this.ville = ville;
		this.pays = pays;
		this.dateDebut = dateDebut;
		this.presidents = presidents;
		this.editeurs = editeurs;
		this.typesArticles = typesArticles;
		this.url = url;

	}

	public String getAcronyme()
	{
		return acronyme;
	}

	public void setAcronyme(String acronyme)
	{
		this.acronyme = acronyme;
	}

	public String getTitre()
	{
		return titre;
	}

	public void setTitre(String titre)
	{
		this.titre = titre;
	}

	public String getVille()
	{
		return ville;
	}

	public void setVille(String ville)
	{
		this.ville = ville;
	}

	public String getPays()
	{
		return pays;
	}

	public void setPays(String pays)
	{
		this.pays = pays;
	}

	public String getDateDebut()
	{
		return dateDebut;
	}

	public void setDateDebut(String dateDebut)
	{
		this.dateDebut = dateDebut;
	}

	public String getDateFin()
	{
		return dateFin;
	}

	public void setDateFin(String dateFin)
	{
		this.dateFin = dateFin;
	}

	public List<President> getPresidents()
	{
		return presidents;
	}

	public void setPresidents(List<President> presidents)
	{
		this.presidents = presidents;
	}

	public List<Editeur> getEditeurs()
	{
		return editeurs;
	}

	public void setEditeurs(List<Editeur> editeurs)
	{
		this.editeurs = editeurs;
	}

	public List<TypeArticle> getTypesArticles()
	{
		return typesArticles;
	}

	public void setTypesArticles(List<TypeArticle> typesArticles)
	{
		this.typesArticles = typesArticles;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}
	
}
