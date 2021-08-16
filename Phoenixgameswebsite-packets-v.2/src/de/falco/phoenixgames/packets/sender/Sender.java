package de.falco.phoenixgames.packets.sender;

/**
 * superclass for alle Senders used in servlet <=> programmserver connection
 * 
 * @author Falco Wolf
 *
 */
public abstract class Sender {
	
	private int senderid;
	
	public Sender(int senderid) {
		this.senderid = senderid;
	}
	
	public int getSenderid() {
		return senderid;
	}
	
}
