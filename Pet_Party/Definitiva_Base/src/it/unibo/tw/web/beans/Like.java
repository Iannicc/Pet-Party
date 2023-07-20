package it.unibo.tw.web.beans;

public class Like implements Comparable<Object>
{
	private String usernameUtente;
	private Post post;

	public String getUsernameUtente() {
		return usernameUtente;
	}

	public void setUsernameUtente(String usernameUtente) {
		this.usernameUtente = usernameUtente;
	}

	public Like() {
		super();
	}

	public Like(String usernameUtente, Post post) {
		super();
		this.usernameUtente = usernameUtente;
		this.post = post;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(this.getPost() == ((Like) o).getPost() && this.getUsernameUtente() == ((Like) o).getUsernameUtente()){
			return 0;
		}
		return -1;
	}



}
