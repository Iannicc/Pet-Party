package it.unibo.tw.web.beans;

import java.util.ArrayList;
import java.util.List;

public class Animale extends Profilo
{
	private String razza;
	private String specie;
	private Sesso sex;
	private List<PostAnimale> posts=new ArrayList<>();



	public Animale(String nome, String descrizione, String immagine,String razza, String specie, Sesso sex, List<PostAnimale> posts) {
		super(nome,descrizione,immagine);
		this.razza = razza;
		this.specie = specie;
		this.sex = sex;
		this.posts = posts;
	}
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

	public boolean condividiPost(PostAnimale p)
	{
		return this.posts.add(p);
	}

	public boolean rimuoviPost(PostAnimale p)
	{
		return this.posts.add(p);
	}

}
