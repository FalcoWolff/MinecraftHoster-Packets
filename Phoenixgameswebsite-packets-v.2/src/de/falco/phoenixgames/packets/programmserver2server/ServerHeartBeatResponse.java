package de.falco.phoenixgames.packets.programmserver2server;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ProgrammServerPacketCode;

public class ServerHeartBeatResponse extends Packet{

	private long space;
	private long ram;
	private float cpu;
	
	public ServerHeartBeatResponse(long space, long ram, float cpu) {
		super(ProgrammServerPacketCode.serverheartbeatresponse);
		this.space = space;
		this.ram = ram;
		this.cpu = cpu;
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
