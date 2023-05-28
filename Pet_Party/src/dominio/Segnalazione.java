package dominio;

import java.sql.Date;

public class Segnalazione 
{
	private Date timeStamp;
	private int Id;
	private Motivo motivo;
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Motivo getMotivo() {
		return motivo;
	}
	public void setMotivo(Motivo motivo) {
		this.motivo = motivo;
	}
	public Segnalazione() {
		super();
	}
	
	
}
