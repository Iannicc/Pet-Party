package it.unibo.tw.web.beans;

public abstract class Account
{
	private String username;

	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Account() {
		super();
	}

	public Account(String password, String username) {
		super();
		this.username = username;
		this.password = password;
	}



}
