package it.unibo.tw.web.beans;

import java.awt.image.BufferedImage;
import java.sql.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PostAnimale extends Post 
{
	Set <Animale> animali = new TreeSet<Animale>();
	
	public Set<Animale> getAnimali() {
		return animali;
	}

	public void setAnimali(Set<Animale> animali) {
		this.animali = animali;
	}

	public PostAnimale()
	{
		super();
	}
	
	public PostAnimale(Date dataCreazione, BufferedImage media, String descrizione, List<Commento> commenti, Set<Like> likes , Set<Animale> animali) {
		super(dataCreazione,media,descrizione,commenti,likes);
		this.animali=animali;
	}
	public PostAnimale(Date dataCreazione, BufferedImage media, String descrizione, List<Commento> commenti, Set<Like> likes , Set<Animale> animali, String base64) {
		super(dataCreazione,media,descrizione,commenti,likes, base64);
		this.animali=animali;
	}

}
