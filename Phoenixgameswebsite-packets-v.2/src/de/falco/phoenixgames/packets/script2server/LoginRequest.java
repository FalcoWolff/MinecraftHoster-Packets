package de.falco.phoenixgames.packets.script2server;

import de.falco.phoenixgames.packets.Packet;
import de.falco.phoenixgames.packets.ScriptClientPacketCode;

public class LoginRequest extends Packet{
	
	private String token;
	
	public LoginRequest(String token) {
		super(ScriptClientPacketCode.loginrequest);
		this.token = token;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	

}
