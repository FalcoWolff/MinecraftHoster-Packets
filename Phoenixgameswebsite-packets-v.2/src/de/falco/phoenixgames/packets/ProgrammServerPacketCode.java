package de.falco.phoenixgames.packets;

public class ProgrammServerPacketCode {
	
	/*
	 * programmserver2server
	 */
	public static final int commandresponse = 1000;
	public static final int loginrequest = 1001;
	public static final int messageresponse = 1002;
	public static final int serverheartbeatresponse = 1003;
	public static final int serverstatusupdate = 1004;
	public static final int serverstatusupdateresponse = 1005;
	
	
	
	/*
	 * server2programmserver
	 */
	public static final int commandrequest = 1100;
	public static final int loginresponse = 1101;
	public static final int serverstatusupdaterequest = 1102;
	
	//ftp
	public static final int deleteftpuser = 1200;
	public static final int ftpuserlist = 1201;
	public static final int storeftpuser = 1202;
	
	

}
