package de.falco.phoenixgames.packets.programmserver2server;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ProgrammServerPacketCode;

public class LoginRequest extends Packet{

	private int serverid;
	private String password;
	private long maxram;
	private long maxusage;
	private int ftpPort;
	
	public LoginRequest(int serverid, String password, long maxram, long maxusage, int ftpPort) {
		super(ProgrammServerPacketCode.loginrequest);
		this.serverid = serverid;
		this.password = password;
		this.maxram = maxram;
		this.maxusage = maxusage;
		this.ftpPort = ftpPort;
	}
	
	public long getMaxram() {
		return maxram;
	}
	public long getMaxusage() {
		return maxusage;
	}
	public String getPassword() {
		return password;
	}
	public int getServerid() {
		return serverid;
	}
	
	public int getFtpPort() {
		return ftpPort;
	}
	
	
	public void setMaxram(long maxram) {
		this.maxram = maxram;
	}
	public void setMaxusage(long maxusage) {
		this.maxusage = maxusage;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setServerid(int serverid) {
		this.serverid = serverid;
	}
	
	public void setFtpPort(int ftpPort) {
		this.ftpPort = ftpPort;
	}
	
}
