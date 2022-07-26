package de.falco.phoenixgames.packets.server2programmserver;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ProgrammServerPacketCode;
import de.falco.phoenixgames.packets.sender.Sender;
import de.falco.phoenixgames.packets.util.ServerCommand;

public class ServerStatusUpdateRequest extends Packet{
	
	private ServerCommand serverCommand;
	private Sender sender;
	
	public ServerStatusUpdateRequest(Sender sender, ServerCommand serverCommand) {
		super(ProgrammServerPacketCode.serverstatusupdaterequest);
		this.serverCommand = serverCommand;
		this.sender = sender;
	}
	
	public ServerCommand getServerCommand() {
		return serverCommand;
	}
	
	public void setServerCommand(ServerCommand serverCommand) {
		this.serverCommand = serverCommand;
	}
	
	public Sender getSender() {
		return sender;
	}
	
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	
}
