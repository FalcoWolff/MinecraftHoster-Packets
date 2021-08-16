package de.falco.phoenixgames.packets.error.reason;

public abstract class ErrorReason {
	
	private String message;
	private int errorcode;
	
	public ErrorReason(int errorcode, String message) {
		this.message = message;
		this.errorcode = errorcode;
	}
	
	public String getMessage() {
		return message;
	}
	
	public int getErrorcode() {
		return errorcode;
	}
	
}
