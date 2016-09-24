package br.com.unitri.redes2.networksimulator;

public class IPDatagram {

	private String version;
	private String IHL;
	private String DSCP;
	private String ECN;
	private String totalLength;
	private String identification;
	private String flags;
	private String fragmentOffset;
	private String timeToLive;
	private String protocol;
	private String headerChecksum;
	private String sourceAddress;
	private String destinationAddress;
	private Object payLoad;

	public IPDatagram() {

	}

	public void init() {
		this.version = "4";
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getIHL() {
		return IHL;
	}

	public void setIHL(String iHL) {
		IHL = iHL;
	}

	public String getDSCP() {
		return DSCP;
	}

	public void setDSCP(String dSCP) {
		DSCP = dSCP;
	}

	public String getECN() {
		return ECN;
	}

	public void setECN(String eCN) {
		ECN = eCN;
	}

	public String getTotalLength() {
		return totalLength;
	}

	public void setTotalLength(String totalLength) {
		this.totalLength = totalLength;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getFlags() {
		return flags;
	}

	public void setFlags(String flags) {
		this.flags = flags;
	}

	public String getFragmentOffset() {
		return fragmentOffset;
	}

	public void setFragmentOffset(String fragmentOffset) {
		this.fragmentOffset = fragmentOffset;
	}

	public String getTimeToLive() {
		return timeToLive;
	}

	public void setTimeToLive(String timeToLive) {
		this.timeToLive = timeToLive;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getHeaderChecksum() {
		return headerChecksum;
	}

	public void setHeaderChecksum(String headerChecksum) {
		this.headerChecksum = headerChecksum;
	}

	public String getSourceAddress() {
		return sourceAddress;
	}

	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public Object getPayLoad() {
		return payLoad;
	}

	public void setPayLoad(Object payLoad) {
		this.payLoad = payLoad;
	}

	public String toString() {

		String resposta = String.format("Origem: %s, Destino: %s, Mensagem: %s", this.sourceAddress,
				this.destinationAddress, this.payLoad);
		
		return resposta;

	}

}
