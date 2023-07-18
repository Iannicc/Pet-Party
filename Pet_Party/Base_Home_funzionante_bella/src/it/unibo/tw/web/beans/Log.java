package it.unibo.tw.web.beans;

import java.util.*;

public class Log 
{
	private List<VoceDiLog> voci = new ArrayList<VoceDiLog>();

	public List<VoceDiLog> getVoci() {
		return voci;
	}

	public void setVoci(List<VoceDiLog> voci) {
		this.voci = voci;
	}

	public Log() {
		super();
	}
	
	public void addVoce(VoceDiLog vdl)
	{
		this.voci.add(vdl);
	}

	public Log(List<VoceDiLog> voci) {
		super();
		this.voci = voci;
	}
	
	
	
}
