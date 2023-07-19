package it.unibo.tw.web.beans;

import java.util.List;

public class Professionista extends UtenteStandard
{
	private String professione;
	private String specializzazione;
	private boolean abilitato;

	public String getProfessione() {
		return professione;
	}
	public void setProfessione(String professione) {
		this.professione = professione;
	}
	public String getSpecializzazione() {
		return specializzazione;
	}
	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}
	public Professionista() {
		super();
	}
	public boolean isAbilitato() {
		return abilitato;
	}
	public void setAbilitato(boolean abilitato) {
		this.abilitato = abilitato;
	}
	public Professionista(String password, String username,ProfiloProfessionista profilo, boolean bloccato, String professione, String specializzazione,
			boolean abilitato,List<UtenteStandard> followers,List<UtenteStandard> followed) {
		super(password, username,profilo, bloccato,followers,followed );
		this.professione = professione;
		this.specializzazione = specializzazione;
		this.abilitato = abilitato;
	}



}
