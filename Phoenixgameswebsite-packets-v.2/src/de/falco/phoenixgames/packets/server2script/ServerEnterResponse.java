package de.falco.phoenixgames.packets.server2script;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ScriptClientPacketCode;

/*
 * removed because of servlet securityfilter
 */
@Deprecated
public class ServerEnterResponse extends Packet{

	private ServerEnterStatus ServerEnterStatus;
	
	public ServerEnterResponse(ServerEnterStatus status) {
		super(ScriptClientPacketCode.serverenterresponse);
		this.ServerEnterStatus = status;
	}
	
	public ServerEnterStatus getServerEnterStatus() {
		return ServerEnterStatus;
	}
	
	public enum ServerEnterStatus{
		
		
		success,nopermission,servernotexists;
		
		
	}

}
