package br.com.unitri.redes2.networksimulator;

public abstract class NetworkInterface {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void sendMessage(int port, Object message);

}
