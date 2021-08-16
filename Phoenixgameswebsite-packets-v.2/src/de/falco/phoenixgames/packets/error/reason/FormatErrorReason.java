package de.falco.phoenixgames.packets.error.reason;

import de.falco.phoenixgames.packets.error.ErrorCode;

public class FormatErrorReason extends ErrorReason{

	public static long serialVersionUID = 972551043;
	
	private String data;
	
	public FormatErrorReason(String data) {
		super(ErrorCode.FormatError, "data packet: '" + data + "' is wrong formatted");
		this.data = data;
	}
	
	public String getData() {
		return data;
	}

}
