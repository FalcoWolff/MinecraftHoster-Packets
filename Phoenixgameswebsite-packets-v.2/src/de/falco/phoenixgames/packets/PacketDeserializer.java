package de.falco.phoenixgames.packets;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class PacketDeserializer implements JsonDeserializer<Packet>{

	@Override
	public Packet deserialize(JsonElement element, Type type, JsonDeserializationContext c) throws JsonParseException {
		
		int packetcode = element.getAsJsonObject().get(PacketCode.KEY_NAME).getAsInt();
		
		Class<?> clazz = null;
		
		if(packetcode == PacketCode.errorpacket) {
			clazz = de.falco.phoenixgames.packets.error.ErrorPacket.class;
		}
		
		if(packetcode == ProgrammServerPacketCode.commandresponse) {
			clazz = de.falco.phoenixgames.packets.programmserver2server.CommandResponse.class;
		}else if(packetcode == ProgrammServerPacketCode.loginrequest) {
			clazz = de.falco.phoenixgames.packets.programmserver2server.LoginRequest.class;
		}else if(packetcode == ProgrammServerPacketCode.messageresponse) {
			clazz = de.falco.phoenixgames.packets.programmserver2server.MessageResponse.class;
		}else if(packetcode == ProgrammServerPacketCode.serverheartbeatresponse) {
			clazz = de.falco.phoenixgames.packets.programmserver2server.ServerHeartBeatResponse.class;
		}else if(packetcode == ProgrammServerPacketCode.serverstatusupdate) {
			clazz = de.falco.phoenixgames.packets.programmserver2server.ServerStatusUpdate.class;
		}else if(packetcode == ProgrammServerPacketCode.serverstatusupdateresponse) {
			clazz = de.falco.phoenixgames.packets.programmserver2server.ServerStatusUpdateResponse.class;
		}
		
		if(packetcode == ProgrammServerPacketCode.commandrequest) {
			clazz = de.falco.phoenixgames.packets.server2programmserver.CommandRequest.class;
		}else if(packetcode == ProgrammServerPacketCode.loginresponse) {
			clazz = de.falco.phoenixgames.packets.server2programmserver.LoginResponse.class;
		}else if(packetcode == ProgrammServerPacketCode.serverstatusupdaterequest) {
			clazz = de.falco.phoenixgames.packets.server2programmserver.ServerStatusUpdateRequest.class;
		}
		
		if(packetcode == ScriptClientPacketCode.commandrequest) {
			clazz = de.falco.phoenixgames.packets.script2server.CommandRequest.class;
		}else if(packetcode == ScriptClientPacketCode.loginrequest) {
			clazz = de.falco.phoenixgames.packets.script2server.LoginRequest.class;
		}else if(packetcode == ScriptClientPacketCode.serverenterrequest) {
			clazz = de.falco.phoenixgames.packets.script2server.ServerEnterRequest.class;
		}else if(packetcode == ScriptClientPacketCode.serverstatusupdaterequest) {
			clazz = de.falco.phoenixgames.packets.script2server.ServerStatusUpdateRequest.class;
		}
		
		if(packetcode == ScriptClientPacketCode.commandresponse) {
			clazz = de.falco.phoenixgames.packets.server2script.CommandResponse.class;
		}else if(packetcode == ScriptClientPacketCode.loginresponse) {
			clazz = de.falco.phoenixgames.packets.server2script.LoginResponse.class;
		}else if(packetcode == ScriptClientPacketCode.messageresponse) {
			clazz = de.falco.phoenixgames.packets.server2script.MessageResponse.class;
		}else if(packetcode == ScriptClientPacketCode.playerchangeupdate) {
			clazz = de.falco.phoenixgames.packets.server2script.PlayerChangeUpdate.class;
		}else if(packetcode == ScriptClientPacketCode.serverenterresponse) {
			clazz = de.falco.phoenixgames.packets.server2script.ServerEnterResponse.class;
		}else if(packetcode == ScriptClientPacketCode.serverheartbeatresponse) {
			clazz = de.falco.phoenixgames.packets.server2script.ServerHeartBeatResponse.class;
		}else if(packetcode == ScriptClientPacketCode.serverstatusupdate) {
			clazz = de.falco.phoenixgames.packets.server2script.ServerStatusUpdate.class;
		}else if(packetcode == ScriptClientPacketCode.serverstatusupdateresponse) {
			clazz = de.falco.phoenixgames.packets.server2script.ServerStatusUpdateResponse.class;
		}
		
		if(clazz == null) {
			throw new JsonParseException("couldnt handle " + PacketCode.KEY_NAME);
		}
		
		return c.deserialize(element, clazz);
	}

}
