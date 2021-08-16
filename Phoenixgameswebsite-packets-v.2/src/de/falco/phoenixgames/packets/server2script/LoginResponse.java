package de.falco.phoenixgames.packets.server2script;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ScriptClientPacketCode;

public class LoginResponse extends Packet{
	
	public enum LoginStatus {
		
		success, 
		noaccess,
		oldtoken;
		
		
	}
	
	private LoginStatus LoginStatus;
	
	public LoginResponse(LoginStatus reason) {
		super(ScriptClientPacketCode.loginresponse);
		this.LoginStatus = reason;
	}
	
	public LoginStatus getLoginStatus() {
		return LoginStatus;
	}

}
