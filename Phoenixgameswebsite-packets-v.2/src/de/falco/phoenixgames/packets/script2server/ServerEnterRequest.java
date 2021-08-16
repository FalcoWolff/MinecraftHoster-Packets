package de.falco.phoenixgames.packets.script2server;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ScriptClientPacketCode;

/*
 * removed because of servlet securityfilter
 */
@Deprecated
public class ServerEnterRequest extends Packet{

	private int serverid;
	
	public ServerEnterRequest(int serverid) {
		super(ScriptClientPacketCode.serverenterrequest);
		this.serverid = serverid;
	}
	
	public int getServerid() {
		return serverid;
	}

}
