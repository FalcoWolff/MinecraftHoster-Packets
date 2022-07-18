package de.falco.phoenixgames.packets.util;

/*
 * status of ServerStatusUpdateResponse packet
 */
public enum ServerUpdateStatus {
	
	success, 
	nochange, 
	nopermission, 
	hostdown,
	restarting, 
	shutingDown, 
	killExecution, 
	starting, 
	connectionLost 

}
