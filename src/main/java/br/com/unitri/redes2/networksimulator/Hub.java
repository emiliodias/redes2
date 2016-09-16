package br.com.unitri.redes2.networksimulator;

public class Hub {

	private Host[] ports = new Host[8];
	
	public void addHost(Host host, int port) {
		
		if(ports[port] != null)
			throw new RuntimeException("Já existe um equipamento nesta porta");
		
		ports[port] = host;
		
	}
	
	public void removeHost(int port) {
		
		if(ports[port] == null)
			throw new RuntimeException("Não existe um equipamento nesta porta");
		
		ports[port] = null;
		
	}
	
	public void recieve(int port, Object message) {
		
		for(int i=0;i<ports.length;i++) {
			if(ports[i]!=null && i!=port) {
				ports[i].recieveMesage(message);
			}
		}
		
	}
	
}
