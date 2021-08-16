package de.falco.phoenixgames.packets.script2server;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ScriptClientPacketCode;
import de.falco.console.pexsystem.ServerStatus;

public class ServerStatusUpdateRequest extends Packet{

	private ServerStatus ServerStatus;
	private int serverid;
	
	public ServerStatusUpdateRequest(int serverid, ServerStatus status) {
		super(ScriptClientPacketCode.serverstatusupdaterequest);
		this.ServerStatus = status;
		this.serverid = serverid;
	}
	
	public ServerStatus getServerStatus() {
		return ServerStatus;
	}
	
	public int getServerid() {
		return serverid;
	}
	
	public void setServerid(int serverid) {
		this.serverid = serverid;
	}
	

}
