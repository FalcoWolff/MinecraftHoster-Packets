package de.falco.phoenixgames.packets.server2script;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ScriptClientPacketCode;
import de.falco.phoenixgames.packets.util.ServerStatus;

public class ServerStatusUpdate extends Packet{

	private ServerStatus serverstatus;
	private int serverid;
	
	public ServerStatusUpdate(int serverid, ServerStatus ProgrammServerStatus) {
		super(ScriptClientPacketCode.serverstatusupdate);
		this.serverstatus = ProgrammServerStatus;
		this.serverid = serverid;
	}
	
	public ServerStatus getServerStatus() {
		return serverstatus;
	}
	public int getServerid() {
		return serverid;
	}
	

}
