package de.falco.phoenixgames.packets.programmserver2server;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ProgrammServerPacketCode;

public class ServerHeartBeatResponse extends Packet{

	private long usage;
	private long ram;
	
	public ServerHeartBeatResponse(long usage, long ram) {
		super(ProgrammServerPacketCode.serverheartbeatresponse);
		this.usage = usage;
		this.ram = ram;
	}
	
	
	public long getRam() {
		return ram;
	}
	public long getUsage() {
		return usage;
	}
	
	
	public void setRam(long ram) {
		this.ram = ram;
	}
	public void setUsage(long usage) {
		this.usage = usage;
	}
}
