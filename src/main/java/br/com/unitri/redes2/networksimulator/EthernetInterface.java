package br.com.unitri.redes2.networksimulator;

public class EthernetInterface extends NetworkInterface {
	
	private Hub hub;
	
	private IPConfig ip;
	
	public void configIP(IPConfig ip) {
		this.ip = ip;
	}
	
	public void setHub(Hub hub) {
		this.hub = hub;
	}
	
	public void sendMessage(int port, Object message) {
		hub.recieve(port, message);
	}

}
