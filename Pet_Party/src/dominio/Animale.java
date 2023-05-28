package dominio;

import java.util.*;

public class Animale extends Profilo 
{
	private String razza;
	private String specie;
	private Sesso sex;
	private List<PostAnimale> posts=new ArrayList<PostAnimale>();
	
	
	
	public List<PostAnimale> getPosts() {
		return posts;
	}
	public void setPosts(List<PostAnimale> posts) {
		this.posts = posts;
	}
	public String getRazza() {
		return razza;
	}
	public void setRazza(String razza) {
		this.razza = razza;
	}
	public String getSpecie() {
		return specie;
	}
	public void setSpecie(String specie) {
		this.specie = specie;
	}
	public Sesso getSex() {
		return sex;
	}
	public void setSex(Sesso sex) {
		this.sex = sex;
	}
	public Animale() {
		super();
	}
	
	
}
