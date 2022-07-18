package de.falco.phoenixgames.packets.util;

public enum ServerStatus {
	
	committed, //Programmserver is not connected to Webserver
	online, //Programmserver connected | service is running
	offline, //Programmserver connected | service is not running
	restarting, //Programmserver connected | service restarting | blocked commands
	shutingDown, //Programmserver connected | service is shuting down | blocked commands
	killExecution, //Programmserver connected | service get killed | blocked commands
	starting, //Programmserver connected | service boot up | blocked commands
	connectionLost //Programmserver is not connected
	
}
