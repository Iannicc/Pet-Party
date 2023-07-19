package it.unibo.tw.web.beans;

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
	public Segnalazione(Date timeStamp, int id, Motivo motivo) {
		super();
		this.timeStamp = timeStamp;
		Id = id;
		this.motivo = motivo;
	}



}
