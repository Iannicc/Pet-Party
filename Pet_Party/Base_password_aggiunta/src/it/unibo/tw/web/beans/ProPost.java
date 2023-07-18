package it.unibo.tw.web.beans;

import java.sql.Blob;
import java.sql.Date;
import java.util.List;
import java.util.Set;

public class ProPost extends Post
{
	
	
	public ProPost()
	{
		super();
	}

	public ProPost(Date dataCreazione, String media, String descrizione, List<Commento> commenti, Set<Like> likes) {
		super(dataCreazione,media,descrizione,commenti,likes);
	}
}
