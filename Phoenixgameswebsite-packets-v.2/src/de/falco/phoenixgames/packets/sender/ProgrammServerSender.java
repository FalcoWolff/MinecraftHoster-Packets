package de.falco.phoenixgames.packets.sender;

public class ProgrammServerSender extends Sender{
	
	private int programmserverid;
	
	public ProgrammServerSender(int programmserverid) {
		super(SenderCode.programmserversender);
		this.programmserverid = programmserverid;
	}
	
	public int getProgrammserverid() {
		return programmserverid;
	}
	public void setProgrammserverid(int programmserverid) {
		this.programmserverid = programmserverid;
	}

}
