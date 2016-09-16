package br.com.unitri.redes2.networksimulator;

public class Main {

	public static void main(String[] args) {
		
		PC pc = new PC();
		EthernetInterface ethernet = new EthernetInterface();
		IPConfig ipConfig = new IPConfig("192.168.0.1");
		ethernet.configIP(ipConfig);
		pc.addInterface(ethernet);
		
		PC pc2 = new PC();
		EthernetInterface ethernet2 = new EthernetInterface();
		IPConfig ipConfig2 = new IPConfig("192.168.0.2");
		ethernet2.configIP(ipConfig2);
		pc2.addInterface(ethernet2);
		
		Hub hub = new Hub();
		hub.addHost(pc, 0);
		hub.addHost(pc2, 1);
		
		ethernet.setHub(hub);
		ethernet2.setHub(hub);
		
		pc.send(0, "192.168.0.1", "Testando o envio de uma mensagem");
		
		System.out.println(pc.buffer);
		System.out.println(pc2.buffer);
		
	}
	
}
