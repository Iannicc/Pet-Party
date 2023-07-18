package it.unibo.tw.web.beans;

import java.sql.Date;

public class VoceDiLog 
{
	private Date timestamp;
	private String descrizione;
	private String operazione;
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getOperazione() {
		return operazione;
	}
	public void setOperazione(String operazione) {
		this.operazione = operazione;
	}
	public VoceDiLog() {
		super();
	}
	public VoceDiLog(Date timestamp, String descrizione, String operazione) {
		super();
		this.timestamp = timestamp;
		this.descrizione = descrizione;
		this.operazione = operazione;
	}
	
	
	
}
