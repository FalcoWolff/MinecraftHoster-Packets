package de.falco.phoenixgames.packets.error;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.PacketCode;
import de.falco.phoenixgames.packets.error.reason.ErrorReason;

/**
 * is a very often used errorpacket for every connection
 * only send when a packet cause an error
 * 
 * @author Falco Wolf
 */
public class ErrorPacket extends Packet{
	
	//{packetid=2001}
	
	private ErrorReason reason;
	
	public ErrorPacket(ErrorReason reason) {
		super(PacketCode.errorpacket);
		this.reason = reason;
	}
	
	public ErrorReason getReason() {
		return reason;
	}
	
	
	
	public void setReason(ErrorReason reason) {
		this.reason = reason;
	}
	
}
