package dominio;

import java.util.ArrayList;
import java.util.List;

public class ProfiloUtente extends Profilo 
{
	private String Cognome;
	private String zona;
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
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
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
	
}
