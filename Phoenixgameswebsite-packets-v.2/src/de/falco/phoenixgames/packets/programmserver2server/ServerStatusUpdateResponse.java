package de.falco.phoenixgames.packets.programmserver2server;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ProgrammServerPacketCode;
import de.falco.phoenixgames.packets.sender.Sender;

public class ServerStatusUpdateResponse extends Packet{

	private ServerStatusUpdateResponseStatus status;
	private Sender sender;
	
	public ServerStatusUpdateResponse(Sender sender, ServerStatusUpdateResponseStatus status) {
		super(ProgrammServerPacketCode.serverstatusupdateresponse);
		this.sender = sender;
		this.status = status;
	}
	
	public enum ServerStatusUpdateResponseStatus {
		
		success,nochange;
		
	}
	
	public ServerStatusUpdateResponseStatus getStatus() {
		return status;
	}
	public Sender getSender() {
		return sender;
	}
	
	public void setStatus(ServerStatusUpdateResponseStatus status) {
		this.status = status;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}

}
