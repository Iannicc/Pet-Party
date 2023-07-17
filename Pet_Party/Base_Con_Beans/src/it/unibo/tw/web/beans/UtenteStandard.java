package it.unibo.tw.web.beans;

import java.util.ArrayList;
import java.util.List;

public class UtenteStandard extends Account 
{
	private List<UtenteStandard> followers= new ArrayList<UtenteStandard>();
	private List<UtenteStandard> followed= new ArrayList<UtenteStandard>();
	
	private ProfiloUtente profilo;
	private boolean bloccato;
	public ProfiloUtente getProfilo() {
		return profilo;
	}
	public void setProfilo(ProfiloUtente profilo) {
		this.profilo = profilo;
	}
	
	
	
	public UtenteStandard(String username,ProfiloUtente profilo, boolean bloccato,List<UtenteStandard> followers,List<UtenteStandard> followed) {
		super(username);
		this.followers=followers;
		this.followed=followed;
		this.profilo = profilo;
		this.bloccato = bloccato;
	}
	public UtenteStandard() {
		super();
		bloccato=false;
	}
	public boolean isBloccato() {
		return bloccato;
	}
	public void setBloccato(boolean bloccato) {
		this.bloccato = bloccato;
	}
	
	
	public List<UtenteStandard> getFollowers() {
		return followers;
	}
	public void setFollowers(List<UtenteStandard> followers) {
		this.followers = followers;
	}
	public List<UtenteStandard> getFollowed() {
		return followed;
	}
	public void setFollowed(List<UtenteStandard> followed) {
		this.followed = followed;
	}
	
	public boolean addFollower(UtenteStandard u)
	{
		return this.followers.add(u);
	}
	
	public boolean removeFollower(UtenteStandard u)
	{
		return this.followers.remove(u);
	}
	
	public boolean addFollowed(UtenteStandard u)
	{
		return this.followed.add(u);
	}
	
	public boolean removeFollowed(UtenteStandard u)
	{
		return this.followed.remove(u);
	}
	
}
