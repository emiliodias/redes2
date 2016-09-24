package br.com.unitri.redes2.networksimulator.arp;

import java.util.HashMap;
import java.util.Map;

public class ARPTable {

	/**
	 * KEY: IP ADDRESS
	 * VALUE: MAC ADDRESS
	 */
	private Map<String, String> address = new HashMap<String, String>();
	
	public void addEntry(String ipAddress, String macAddress) {
		address.put(ipAddress, macAddress);
	}
	
	public String getMacAddress(String ipAddress) {
		return address.get(ipAddress);
	}
}
