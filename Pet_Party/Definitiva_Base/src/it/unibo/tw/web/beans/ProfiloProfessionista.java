package it.unibo.tw.web.beans;

import java.util.ArrayList;
import java.util.List;

public class ProfiloProfessionista extends ProfiloUtente
{

	private List<ProPost> pubblicazioni= new ArrayList<>();

	private String zona;


	public List<ProPost> getPubblicazioni() {
		return pubblicazioni;
	}

	public void setPubblicazioni(List<ProPost> pubblicazioni) {
		this.pubblicazioni = pubblicazioni;
	}

	public ProfiloProfessionista() {
		super();
	}

	public boolean condividiProPost(ProPost pp)
	{
		return this.pubblicazioni.add(pp);
	}

	public boolean rimuoviProPost(ProPost pp)
	{
		return this.pubblicazioni.remove(pp);
	}

	public ProfiloProfessionista(String nome, String descrizione, String immagine, String cognome, String zona, String telefono, List<Animale> animali,
		List<ProPost> pubblicazioni) {
		super(nome,descrizione,immagine,cognome,telefono,animali);
		this.pubblicazioni = pubblicazioni;
		this.setZona(zona);
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}



}
