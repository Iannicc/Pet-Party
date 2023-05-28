package dominio;

import java.util.*;

public class ProfiloProfessionista extends ProfiloUtente 
{
	private List<ProPost> pubblicazioni= new ArrayList<ProPost>();

	public List<ProPost> getPubblicazioni() {
		return pubblicazioni;
	}

	public void setPubblicazioni(List<ProPost> pubblicazioni) {
		this.pubblicazioni = pubblicazioni;
	}

	public ProfiloProfessionista() {
		super();
	}
	
	
}
