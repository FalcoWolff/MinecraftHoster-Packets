package de.falco.phoenixgames.packets.server2script;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ScriptClientPacketCode;

public class ServerHeartBeatResponse extends Packet{

	private long ram;
	private long usage;
	
	public ServerHeartBeatResponse(long usage,long ram) {
		super(ScriptClientPacketCode.serverheartbeatresponse);
		this.ram = ram;
		this.usage = usage;
	}
	
	public long getRam() {
		return ram;
	}
	public long getUsage() {
		return usage;
	}
	
	

}
