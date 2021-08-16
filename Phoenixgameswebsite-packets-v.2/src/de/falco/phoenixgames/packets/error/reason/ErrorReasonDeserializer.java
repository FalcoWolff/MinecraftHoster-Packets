package de.falco.phoenixgames.packets.error.reason;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import de.falco.phoenixgames.packets.error.ErrorCode;

public class ErrorReasonDeserializer implements JsonDeserializer<ErrorReason>{

	@Override
	public ErrorReason deserialize(JsonElement element, Type arg1, JsonDeserializationContext c)
			throws JsonParseException {
		
		if(element.getAsJsonObject().has(ErrorCode.KEY_NAME)) {
			
			int errorcode = element.getAsJsonObject().get(ErrorCode.KEY_NAME).getAsInt();
			
			if(errorcode == ErrorCode.DontLoginError) {
				return c.deserialize(element, DontLoginErrorReason.class);
			}else if(errorcode == ErrorCode.FormatError) {
				return c.deserialize(element, FormatErrorReason.class);
			}else if(errorcode == ErrorCode.InternalError) {
				return c.deserialize(element, InternalErrorReason.class);
			}
			
		}
		
		throw new JsonParseException("couldnt find or handle " + ErrorCode.KEY_NAME);
		
	}

}
