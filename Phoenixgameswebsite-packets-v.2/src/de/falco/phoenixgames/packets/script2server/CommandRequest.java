package de.falco.phoenixgames.packets.script2server;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ScriptClientPacketCode;

public class CommandRequest extends Packet{
	
	private String command;
	
	public CommandRequest(String command) {
		super(ScriptClientPacketCode.commandrequest);
		this.command = command;
	}
	
	
	public String getCommand() {
		return command;
	}

}
