package dominio;

import java.util.*;

public class CondivisionePro 
{
	private Professionista autore;
	private List<ProPost> pubblicati=new ArrayList<ProPost>();
	private Date timeStamp;
	
	
	public Professionista getAutore() {
		return autore;
	}
	public void setAutore(Professionista autore) {
		this.autore = autore;
	}
	public List<ProPost> getPubblicati() {
		return pubblicati;
	}
	public void setPubblicati(List<ProPost> pubblicati) {
		this.pubblicati = pubblicati;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public CondivisionePro() {
		super();
	}
	
	
}
