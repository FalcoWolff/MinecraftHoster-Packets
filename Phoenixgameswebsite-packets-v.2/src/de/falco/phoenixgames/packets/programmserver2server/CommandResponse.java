package de.falco.phoenixgames.packets.programmserver2server;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ProgrammServerPacketCode;
import de.falco.phoenixgames.packets.sender.Sender;

public class CommandResponse extends Packet{
	
	private CommandResponseStatus status;
	private Sender sender;
	private String cmd;
	
	public CommandResponse(Sender sender, String cmd, CommandResponseStatus status) {
		super(ProgrammServerPacketCode.commandresponse);
		this.sender = sender;
		this.cmd = cmd;
		this.status = status;
	}
	
	public enum CommandResponseStatus {
		success,noprocess;
	}
	
	public String getCmd() {
		return cmd;
	}
	public CommandResponseStatus getStatus() {
		return status;
	}
	public Sender getSender() {
		return sender;
	}
	
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	public void setStatus(CommandResponseStatus status) {
		this.status = status;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}

}
