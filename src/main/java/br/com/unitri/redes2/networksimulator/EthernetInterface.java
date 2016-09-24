package br.com.unitri.redes2.networksimulator;

import br.com.unitri.redes2.networksimulator.arp.ARPTable;

public class EthernetInterface extends NetworkInterface {
	
	private ARPTable arpTable = new ARPTable();
	
	private Hub hub;
	
	public void setHub(Hub hub) {
		this.hub = hub;
	}
	
	public void sendMessage(int port, Object message) {
		
		IPDatagram datagram = (IPDatagram) message;
		
		EthernetFrame frame = new EthernetFrame();
		
		//Configurando o endereço MAC de origem
		frame.setSourceMacAddress(getMacAddress());
		
		String macAddress = arpTable.getMacAddress(datagram.getDestinationAddress());
		
		if(macAddress == null) {
			/*
			 * TODO: NECESSÁRIO IMPLEMENTAR O PROTOCOLO ARP PARA QUE SEJA POSSÍVEL 
			 * DESCOBRIR O ENDEREÇO MAC DE DESTINO
			 */
		} else {
			
			/*
			 * TODO: IMPLEMENTAR MECANISMO DE TIMEOUT DO ARP
			 */
			
			frame.setDestinationMacAddress(macAddress);
		}
		
		frame.setPayLoad(message);
		
		hub.recieve(port, frame);
	}

}
