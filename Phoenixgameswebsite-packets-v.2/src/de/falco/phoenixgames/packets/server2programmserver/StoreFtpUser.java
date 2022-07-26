package de.falco.phoenixgames.packets.server2programmserver;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ProgrammServerPacketCode;
import de.falco.phoenixgames.packets.util.FtpUserData;

public class StoreFtpUser extends Packet{
	
	private FtpUserData data;
	
	public StoreFtpUser(FtpUserData data) {
		super(ProgrammServerPacketCode.storeftpuser);
		this.data = data;
	}
	
	public FtpUserData getData() {
		return data;
	}

}
