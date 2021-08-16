package de.falco.phoenixgames.packets.sender;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class SenderDeserializer implements JsonDeserializer<Sender>{

	@Override
	public Sender deserialize(JsonElement element, Type type, JsonDeserializationContext c) throws JsonParseException {
		
		if(element.getAsJsonObject().has(SenderCode.KEY_NAME)) {
			
			int sendercode = element.getAsJsonObject().get(SenderCode.KEY_NAME).getAsInt();
			
			if(sendercode == SenderCode.javascriptclientsender) {
				return c.deserialize(element, JavascriptClientSender.class);
			}else if(sendercode == SenderCode.programmserversender) {
				return c.deserialize(element, ProgrammServerSender.class);
			}else if(sendercode == SenderCode.webserversender) {
				return c.deserialize(element, WebserverSender.class);
			}
			
		}
		
		throw new JsonParseException("couldnt find or handle " + SenderCode.KEY_NAME);
	}

}
