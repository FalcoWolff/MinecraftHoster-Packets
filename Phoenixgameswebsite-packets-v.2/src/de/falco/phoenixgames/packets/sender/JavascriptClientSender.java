package de.falco.phoenixgames.packets.sender;

public class JavascriptClientSender extends Sender{
	
	private int userid;
	
	public JavascriptClientSender(int userid) {
		super(SenderCode.javascriptclientsender);
		this.userid = userid;
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}

}
