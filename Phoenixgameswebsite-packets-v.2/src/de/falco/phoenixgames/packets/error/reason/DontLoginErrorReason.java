package de.falco.phoenixgames.packets.error.reason;

import de.falco.phoenixgames.packets.error.ErrorCode;

public class DontLoginErrorReason extends ErrorReason{

	public static long serialVersionUID = 579772692;
	
	public DontLoginErrorReason() {
		super(ErrorCode.DontLoginError, "dont logged in! Operation not available.");
	}

}
