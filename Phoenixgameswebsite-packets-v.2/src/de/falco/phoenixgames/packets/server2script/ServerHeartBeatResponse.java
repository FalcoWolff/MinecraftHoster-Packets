package de.falco.phoenixgames.packets.server2script;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ScriptClientPacketCode;

public class ServerHeartBeatResponse extends Packet{

	private long ram;
	private long space;
	private float cpu;
	
	public ServerHeartBeatResponse(long space, long ram, float cpu) {
		super(ScriptClientPacketCode.serverheartbeatresponse);
		this.ram = ram;
		this.cpu = cpu;
		this.space = space;
	}
	
	public long getRam() {
		return ram;
	}
	public float getCpu() {
		return cpu;
	}
	public long getSpace() {
		return space;
	}
	
	

}
