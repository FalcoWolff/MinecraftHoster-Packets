package de.falco.phoenixgames.packets.server2programmserver;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ProgrammServerPacketCode;
import de.falco.phoenixgames.packets.sender.Sender;

public class CommandRequest extends Packet{
	
	private Sender sender;
	private String cmd;
	private String debugmessage;
	
	
	
	public CommandRequest(Sender sender, String cmd, String debugmessage) {
		super(ProgrammServerPacketCode.commandrequest);
		this.cmd = cmd;
		this.debugmessage = debugmessage;
		this.sender = sender;
	}
	
	public String getCmd() {
		return cmd;
	}
	public String getDebugmessage() {
		return debugmessage;
	}
	public Sender getSender() {
		return sender;
	}
	
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	public void setDebugmessage(String debugmessage) {
		this.debugmessage = debugmessage;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	

}
