package de.falco.phoenixgames.packets.programmserver2server;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ProgrammServerPacketCode;
import de.falco.phoenixgames.packets.sender.Sender;
import de.falco.phoenixgames.packets.util.ServerUpdateStatus;

@Deprecated
public class ServerStatusUpdateResponse extends Packet{

	private ServerUpdateStatus status;
	private Sender sender;
	
	public ServerStatusUpdateResponse(Sender sender, ServerUpdateStatus status) {
		super(ProgrammServerPacketCode.serverstatusupdateresponse);
		this.sender = sender;
		this.status = status;
	}
	
	public ServerUpdateStatus getStatus() {
		return status;
	}
	public Sender getSender() {
		return sender;
	}
	
	public void setStatus(ServerUpdateStatus status) {
		this.status = status;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}

}
