package it.unibo.tw.web.beans;

import java.util.*;

public class Assistente extends Account
{
	private List<Segnalazione> segnalazioni=new ArrayList<Segnalazione>();

	public List<Segnalazione> getSegnalazioni() {
		return segnalazioni;
	}

	public void setSegnalazioni(List<Segnalazione> segnalazioni) {
		this.segnalazioni = segnalazioni;
	}

	public Assistente() {
		super();
	}
	
	
	
	public Assistente(String username, List<Segnalazione> segnalazioni, String password) {
		super(username, password);
		this.segnalazioni = segnalazioni;
	}

	public boolean addSegnalazione(Segnalazione s)
	{
		return this.segnalazioni.add(s);
	}
	
	public boolean removeSegnalazione(Segnalazione s)
	{
		return this.segnalazioni.remove(s);
	}
	
}
