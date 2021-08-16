package de.falco.phoenixgames.packets.server2script;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ScriptClientPacketCode;

public class ServerStatusUpdateResponse extends Packet{

	private ServerStatusUpdateResponseStatus ServerUpdate;
	private int serverid;
	
	public ServerStatusUpdateResponse(int serverid, ServerStatusUpdateResponseStatus status) {
		super(ScriptClientPacketCode.serverstatusupdateresponse);
		this.ServerUpdate = status;
		this.serverid = serverid;
	}
	
	public enum ServerStatusUpdateResponseStatus {
		success,nopermission,nochange,restarting,hostdown;
	}
	
	public ServerStatusUpdateResponseStatus getServerStatus() {
		return ServerUpdate;
	}
	public void setServerStatus(ServerStatusUpdateResponseStatus serverStatus) {
		ServerUpdate = serverStatus;
	}
	
	public int getServerid() {
		return serverid;
	}
	public void setServerid(int serverid) {
		this.serverid = serverid;
	}
	public void setServerUpdate(ServerStatusUpdateResponseStatus serverUpdate) {
		ServerUpdate = serverUpdate;
	}

}
