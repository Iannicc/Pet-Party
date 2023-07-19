package it.unibo.tw.web.beans;

import java.sql.Date;

public class Commento implements ISegnalabile {
	private String contenuto;
	private Date dataCreazione;
	private String usernameCreatore;
	public String getContenuto() {
		return contenuto;
	}
	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}

	public Commento() {
		super();
	}
	public Date getDataCreazione() {
		return dataCreazione;
	}
	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}
	public String getUsernameCreatore() {
		return usernameCreatore;
	}
	public void setUsernameCreatore(String usernameCreatore) {
		this.usernameCreatore = usernameCreatore;
	}
	public Commento(String contenuto, Date dataCreazione, String usernameCreatore) {
		super();
		this.contenuto = contenuto;
		this.dataCreazione = dataCreazione;
		this.usernameCreatore = usernameCreatore;
	}



}
