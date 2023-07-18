package it.unibo.tw.web.beans;

import java.awt.image.BufferedImage;
import java.sql.Date;
import java.util.*;

public abstract class Post implements ISegnalabile {

	private Date dataCreazione;
	private BufferedImage media;
	private String descrizione;
	private List<Commento> commenti= new ArrayList<Commento>();
	private Set<Like>likes = new TreeSet<Like>();
	protected String base64;
	
	public Date getDataCreazione() {
		return dataCreazione;
	}
	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}
	public Post() {
		super();
	}
	public BufferedImage getMedia() {
		return media;
	}
	public void setMedia(BufferedImage media) {
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
	public Post(Date dataCreazione, BufferedImage media, String descrizione, List<Commento> commenti,
			Set<Like> likes) {
		super();
		this.dataCreazione = dataCreazione;
		this.media = media;
		this.descrizione = descrizione;
		this.commenti = commenti;
		this.likes = likes;
	}
	
	public Post(Date dataCreazione, BufferedImage media, String descrizione, List<Commento> commenti,
			Set<Like> likes, String base64) {
		super();
		this.dataCreazione = dataCreazione;
		this.media = media;
		this.descrizione = descrizione;
		this.commenti = commenti;
		this.likes = likes;
		this.base64 = base64;
	}
	
	
	public String getBase64() {
		return base64;
	}
	public void setBase64(String base64) {
		this.base64 = base64;
	}
	
	
	
}
