package de.falco.phoenixgames.packets.programmserver2server;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ProgrammServerPacketCode;
import de.falco.console.pexsystem.ServerStatus;

public class ServerStatusUpdate extends Packet{

	private ServerStatus ServerStatus;

	public ServerStatusUpdate(ServerStatus ServerStatus) {
		super(ProgrammServerPacketCode.serverstatusupdate);
		this.ServerStatus = ServerStatus;
	}

	public ServerStatus getServerStatus() {
		return ServerStatus;
	}

	public void setServerStatus(ServerStatus serverStatus) {
		ServerStatus = serverStatus;
	}

}