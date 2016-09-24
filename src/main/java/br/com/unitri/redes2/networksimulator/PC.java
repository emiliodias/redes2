package br.com.unitri.redes2.networksimulator;

import java.util.ArrayList;
import java.util.List;

public class PC extends Host {
	
	private List<NetworkInterface> networkInterfaces = new ArrayList<NetworkInterface>();

	public void addInterface(NetworkInterface networkInterface) {
		this.networkInterfaces.add(networkInterface);
	}
	
	public void send(int port, String destination, Object message) {
		
		//Deverá pegar a interface de acordo com o destino, montar cabeçalho IP e etc...
		
		IPDatagram datagram = new IPDatagram();
		datagram.setPayLoad(message);
		
		String ipAddress = networkInterfaces.get(0).getIPConfig().getAddress();
		
		datagram.setSourceAddress(ipAddress);
		datagram.setDestinationAddress(destination);
		
		networkInterfaces.get(0).sendMessage(port, datagram);
		
	}
	
}