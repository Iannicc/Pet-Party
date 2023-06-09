package dominio;

import java.sql.Blob;

public abstract class Profilo 
{
	private String nome;
	private String descrizione;
	private Blob image;
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
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
	public Profilo() {
		super();
	}
	
	
}
