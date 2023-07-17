package it.unibo.tw.web.beans;

import java.sql.Blob;
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
	
	public PostAnimale(Date dataCreazione, Blob media, String descrizione, List<Commento> commenti, Set<Like> likes , Set<Animale> animali) {
		super(dataCreazione,media,descrizione,commenti,likes);
		this.animali=animali;
	}
}
