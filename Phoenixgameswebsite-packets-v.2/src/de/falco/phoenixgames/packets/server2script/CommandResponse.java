package de.falco.phoenixgames.packets.server2script;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ScriptClientPacketCode;

public class CommandResponse extends Packet{
	
	public enum CommandStatus {
		
		success, 
		nopermission,
		hostdown,
		hostrestard;
		
	}
	
	private CommandStatus CommandStatus;
	
	public CommandResponse(CommandStatus reason) {
		super(ScriptClientPacketCode.commandresponse);
		this.CommandStatus = reason;
	}
	
	public CommandStatus getCommandStatus() {
		return CommandStatus;
	}

}
