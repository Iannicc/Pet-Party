package it.unibo.tw.web.beans;

public abstract class Account 
{
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Account() {
		super();
	}

	public Account(String username) {
		super();
		this.username = username;
	}
	
	
	
}
