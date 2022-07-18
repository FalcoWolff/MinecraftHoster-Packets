package de.falco.phoenixgames.packets.server2script;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ScriptClientPacketCode;
import de.falco.phoenixgames.packets.util.CommandResponseStatus;

public class CommandResponse extends Packet{
	
	private CommandResponseStatus status;
	
	public CommandResponse(CommandResponseStatus status) {
		super(ScriptClientPacketCode.commandresponse);
		this.status = status;
	}
	
	public CommandResponseStatus getStatus() {
		return status;
	}

}
