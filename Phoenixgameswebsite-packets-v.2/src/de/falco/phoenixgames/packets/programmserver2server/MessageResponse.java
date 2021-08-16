package de.falco.phoenixgames.packets.programmserver2server;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ProgrammServerPacketCode;

public class MessageResponse extends Packet{

	private String message;
	
	public MessageResponse(String message) {
		super(ProgrammServerPacketCode.messageresponse);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
