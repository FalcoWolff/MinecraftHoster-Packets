package de.falco.phoenixgames.packets.script2server;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ScriptClientPacketCode;
import de.falco.phoenixgames.packets.util.ServerCommand;

public class ServerStatusUpdateRequest extends Packet{

	private ServerCommand serverCommand;
	private int serverid;
	
	public ServerStatusUpdateRequest(int serverid, ServerCommand serverCommand) {
		super(ScriptClientPacketCode.serverstatusupdaterequest);
		this.serverCommand = serverCommand;
		this.serverid = serverid;
	}
	
	public ServerCommand getServerCommand() {
		return serverCommand;
	}
	
	public int getServerid() {
		return serverid;
	}
	
	public void setServerid(int serverid) {
		this.serverid = serverid;
	}
	

}
