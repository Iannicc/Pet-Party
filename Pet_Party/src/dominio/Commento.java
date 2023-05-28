package dominio;

import java.sql.Date;

public class Commento implements ISegnalabile {
	private String contenuto;
	private Date dataCreazione;
	public String getContenuto() {
		return contenuto;
	}
	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}
	
	public Commento() {
		super();
	}
	@Override
	public void Segnala(Segnalazione s) {
		// TODO Auto-generated method stub

	}
	public Date getDataCreazione() {
		return dataCreazione;
	}
	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}
	
	

}
