package de.falco.phoenixgames.packets.server2programmserver;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ProgrammServerPacketCode;

public class LoginResponse extends Packet{

	private LoginStatus LoginStatus;
	
	public LoginResponse(LoginStatus status) {
		super(ProgrammServerPacketCode.loginresponse);
		this.LoginStatus = status;
	}
	
	public LoginStatus getLoginStatus() {
		return LoginStatus;
	}
	public void setLoginStatus(LoginStatus loginStatus) {
		LoginStatus = loginStatus;
	}
	
	public enum LoginStatus {
		success,noaccess, unknownid,alreadyconnected;
	}

}
