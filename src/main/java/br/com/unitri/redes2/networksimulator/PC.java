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
		
		networkInterfaces.get(0).sendMessage(port, message);;
		
	}
	
}
