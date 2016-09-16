package br.com.unitri.redes2.networksimulator;

import java.util.ArrayList;
import java.util.List;

public class Host {

	protected List<Object> buffer = new ArrayList<Object>();
	
	public void recieveMesage(Object mensage) {
		buffer.add(mensage);
	}
	
}
