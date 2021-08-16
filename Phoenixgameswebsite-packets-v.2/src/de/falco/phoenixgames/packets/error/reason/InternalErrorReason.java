package de.falco.phoenixgames.packets.error.reason;

import de.falco.phoenixgames.packets.error.ErrorCode;

public class InternalErrorReason extends ErrorReason{
	
	public static long serialVersionUID = 269403;
	
	public InternalErrorReason(String message) {
		super(ErrorCode.InternalError, message);
	}
	
	

}
