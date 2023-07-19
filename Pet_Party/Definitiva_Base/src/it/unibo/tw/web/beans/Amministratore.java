package it.unibo.tw.web.beans;

import java.util.List;

public class Amministratore extends Assistente
{
	public Amministratore()
	{
		super();
	}

	public Amministratore(String username,List<Segnalazione> segnalazioni, String password )
	{
		super(username, segnalazioni, password);
	}

}
