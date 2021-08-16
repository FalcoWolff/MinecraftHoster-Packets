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
	
	public Packet(int packetid) {
		this.packetid = packetid;
	}
	
	public int getPacketid() {
		return packetid;
	}

}
