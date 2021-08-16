package de.falco.phoenixgames.packets.server2programmserver;

import de.falco.console.pexsystem.ServerStatus;
import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ProgrammServerPacketCode;
import de.falco.phoenixgames.packets.sender.Sender;

public class ServerStatusUpdateRequest extends Packet{
	
	private ServerStatus serverstatus;
	private Sender sender;
	
	public ServerStatusUpdateRequest(Sender sender, ServerStatus ServerStatus) {
		super(ProgrammServerPacketCode.serverstatusupdaterequest);
		this.serverstatus = ServerStatus;
		this.sender = sender;
	}
	
	public ServerStatus getServerStatus() {
		return serverstatus;
	}
	public Sender getSender() {
		return sender;
	}
	
	public void setServerStatus(ServerStatus serverStatus) {
		serverstatus = serverStatus;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	
	

}
