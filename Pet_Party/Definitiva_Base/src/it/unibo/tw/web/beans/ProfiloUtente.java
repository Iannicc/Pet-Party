package it.unibo.tw.web.beans;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

public class ProfiloUtente extends Profilo 
{
	private String Cognome;
	private String telefono;
	private List<Animale> animali=new ArrayList<Animale>();

	
	
	public List<Animale> getAnimali() {
		return animali;
	}
	public void setAnimali(List<Animale> animali) {
		this.animali = animali;
	}
	public String getCognome() {
		return Cognome;
	}
	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public ProfiloUtente() {
		super();
	}
	
	public ProfiloUtente(String nome, String descrizione, String immagine, String cognome, String telefono, List<Animale> animali) {
		super(nome,descrizione,immagine);
		Cognome = cognome;
		this.telefono = telefono;
		this.animali = animali;
	}
	
	
	
}
