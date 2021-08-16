package de.falco.phoenixgames.packets.server2script;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ScriptClientPacketCode;

public class MessageResponse extends Packet{
	
	private String message;
	
	public MessageResponse(String message) {
		super(ScriptClientPacketCode.messageresponse);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

}
