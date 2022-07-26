package de.falco.phoenixgames.packets.server2programmserver;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ProgrammServerPacketCode;

public class DeleteFtpUser extends Packet{
	
	private String username;
	
	public DeleteFtpUser(String username) {
		super(ProgrammServerPacketCode.deleteftpuser);
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}

}
