package dominio;

public class Professionista extends UtenteStandard 
{
	private String professione;
	private String specializzazione;
	public String getProfessione() {
		return professione;
	}
	public void setProfessione(String professione) {
		this.professione = professione;
	}
	public String getSpecializzazione() {
		return specializzazione;
	}
	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}
	public Professionista() {
		super();
	}
	
	
}
