package de.falco.phoenixgames.packets.server2programmserver;

import java.util.ArrayList;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ProgrammServerPacketCode;
import de.falco.phoenixgames.packets.util.FtpUserData;

public class FtpUserList extends Packet{
	
	private ArrayList<FtpUserData> userList;

	public FtpUserList(ArrayList<FtpUserData> userList) {
		super(ProgrammServerPacketCode.ftpuserlist);
		this.userList = userList;
	}
	
	public FtpUserList() {
		super(ProgrammServerPacketCode.ftpuserlist);
		this.userList = new ArrayList<>();
	}
	
	public ArrayList<FtpUserData> getUserList() {
		return userList;
	}
	
	public void setUserList(ArrayList<FtpUserData> userList) {
		this.userList = userList;
	}

}
