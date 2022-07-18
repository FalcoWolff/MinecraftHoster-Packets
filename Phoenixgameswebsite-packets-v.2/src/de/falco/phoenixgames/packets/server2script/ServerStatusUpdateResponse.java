package de.falco.phoenixgames.packets.server2script;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ScriptClientPacketCode;
import de.falco.phoenixgames.packets.util.ServerUpdateStatus;

public class ServerStatusUpdateResponse extends Packet{

	private ServerUpdateStatus status;
	private int serverid;
	
	public ServerStatusUpdateResponse(int serverid, ServerUpdateStatus status) {
		super(ScriptClientPacketCode.serverstatusupdateresponse);
		this.status = status;
		this.serverid = serverid;
	}
	
	public int getServerid() {
		return serverid;
	}
	public void setServerid(int serverid) {
		this.serverid = serverid;
	}
	
	public ServerUpdateStatus getStatus() {
		return status;
	}
	public void setStatus(ServerUpdateStatus status) {
		this.status = status;
	}

}
