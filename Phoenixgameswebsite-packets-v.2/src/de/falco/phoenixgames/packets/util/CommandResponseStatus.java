package de.falco.phoenixgames.packets.util;

/*
 * status of CommandResponse packet
 */
public enum CommandResponseStatus {
	
	success, 
	nopermission, 
	hostdown,
	restarting, 
	shutingDown, 
	killExecution, 
	starting, 
	connectionLost,
	offline
	;

}
