package br.com.unitri.redes2.networksimulator;

public abstract class NetworkInterface {
	
	private String name;
	
	private IPConfig ip;
	
	private String macAddress;
	
	public void configIP(IPConfig ip) {
		this.ip = ip;
	}
	
	public IPConfig getIPConfig() {
		return this.ip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void sendMessage(int port, Object message);

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

}
