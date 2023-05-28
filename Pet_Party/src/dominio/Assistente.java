package dominio;

import java.util.*;

public class Assistente extends Account
{
	private List<Segnalazione> segnalazioni=new ArrayList<Segnalazione>();

	public List<Segnalazione> getSegnalazioni() {
		return segnalazioni;
	}

	public void setSegnalazioni(List<Segnalazione> segnalazioni) {
		this.segnalazioni = segnalazioni;
	}

	public Assistente() {
		super();
	}
	
	
}
