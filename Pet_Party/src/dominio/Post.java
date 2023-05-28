package dominio;

import java.sql.Date;

public abstract class Post implements ISegnalabile {

	private Date dataCreazione;
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
	public Post() {
		super();
	}
	
	
	
}
