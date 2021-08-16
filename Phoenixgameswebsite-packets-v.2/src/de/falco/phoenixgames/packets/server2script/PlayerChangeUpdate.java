package de.falco.phoenixgames.packets.server2script;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ScriptClientPacketCode;

/*
 * not implemented
 */
@Deprecated
public class PlayerChangeUpdate extends Packet{

	private int serverid;
	private int usercount;
	
	public PlayerChangeUpdate(int serverid, int usercount) {
		super(ScriptClientPacketCode.playerchangeupdate);
		this.serverid = serverid;
		this.usercount = usercount;
	}
	
	public int getServerid() {
		return serverid;
	}
	
	public int getUsercount() {
		return usercount;
	}
	

}
