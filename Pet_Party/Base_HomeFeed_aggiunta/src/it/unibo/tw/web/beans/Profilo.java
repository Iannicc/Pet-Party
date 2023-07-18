package it.unibo.tw.web.beans;

import java.sql.Blob;

public abstract class Profilo 
{
	private String nome;
	private String descrizione;
	private String image;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Profilo() {
		super();
	}
	public Profilo(String nome, String descrizione, String image) {
		super();
		this.nome = nome;
		this.descrizione = descrizione;
		this.image = image;
	}
	
	
	
}
