package br.com.unitri.redes2.networksimulator;

public class EthernetFrame {
	
	private String preamble;
	private String destinationAddress;
	private String sourceAddress;
	private String typeLength;
	private String userData;
	private String frameCheckSequence;
	private Object payLoad;
	
	public String getPreamble() {
		return preamble;
	}
	public void setPreamble(String preamble) {
		this.preamble = preamble;
	}
	public String getDestinationMacAddress() {
		return destinationAddress;
	}
	public void setDestinationMacAddress(String destinationMacAddress) {
		this.destinationAddress = destinationMacAddress;
	}
	public String getSourceMacAddress() {
		return sourceAddress;
	}
	public void setSourceMacAddress(String sourceMacAddress) {
		this.sourceAddress = sourceMacAddress;
	}
	public String getTypeLength() {
		return typeLength;
	}
	public void setTypeLength(String typeLength) {
		this.typeLength = typeLength;
	}
	public String getUserData() {
		return userData;
	}
	public void setUserData(String userData) {
		this.userData = userData;
	}
	public String getFrameCheckSequence() {
		return frameCheckSequence;
	}
	public void setFrameCheckSequence(String frameCheckSequence) {
		this.frameCheckSequence = frameCheckSequence;
	}
	public Object getPayLoad() {
		return payLoad;
	}
	public void setPayLoad(Object payLoad) {
		this.payLoad = payLoad;
	}

}
