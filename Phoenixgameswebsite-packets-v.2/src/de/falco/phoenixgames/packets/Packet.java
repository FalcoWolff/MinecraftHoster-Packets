package de.falco.phoenixgames.packets;

/**
 * super-class for all packets <br>sended between javascript <=> servlet and programmserver <=> servlet
 * 
 * @author Falco Wolf
 * @Copyright Phoenixgames.net
 * @version 1.0
 */
public abstract class Packet {
	
	private final int packetid;
	private long timestamp;
	
	public Packet(int packetid) {
		this.packetid = packetid;
		this.timestamp = System.currentTimeMillis();
	}
	
	public long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	public int getPacketid() {
		return packetid;
	}

}
