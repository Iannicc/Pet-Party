package it.unibo.tw.web.beans;

import java.sql.Blob;
import java.sql.Date;
import java.util.*;

public abstract class Post implements ISegnalabile {

	private Date dataCreazione;
	private String media;
	private String descrizione;
	private List<Commento> commenti= new ArrayList<Commento>();
	private Set<Like>likes = new TreeSet<Like>();
	
	public Date getDataCreazione() {
		return dataCreazione;
	}
	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}
	public Post() {
		super();
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public List<Commento> getCommenti() {
		return commenti;
	}
	public void setCommenti(List<Commento> commenti) {
		this.commenti = commenti;
	}
	public Set<Like> getLikes() {
		return likes;
	}
	public void setLikes(Set<Like> likes) {
		this.likes = likes;
	}
	
	public boolean addCommento(Commento c)
	{
		return this.commenti.add(c);
	}
	
	public boolean removeCommento(Commento c)
	{
		return this.commenti.remove(c);
	}
	
	public boolean addLike(Like l)
	{
		return this.likes.add(l);
	}
	
	public boolean removeCommento(Like l)
	{
		return this.likes.remove(l);
	}
	public Post(Date dataCreazione, String media, String descrizione, List<Commento> commenti,
			Set<Like> likes) {
		super();
		this.dataCreazione = dataCreazione;
		this.media = media;
		this.descrizione = descrizione;
		this.commenti = commenti;
		this.likes = likes;
	}
	
	
	
}
