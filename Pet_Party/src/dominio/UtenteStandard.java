package dominio;

public class UtenteStandard extends Account 
{
	private ProfiloUtente profilo;
	
	public ProfiloUtente getProfilo() {
		return profilo;
	}
	public void setProfilo(ProfiloUtente profilo) {
		this.profilo = profilo;
	}
	
	public UtenteStandard() {
		super();
	}
	
	
	
}
