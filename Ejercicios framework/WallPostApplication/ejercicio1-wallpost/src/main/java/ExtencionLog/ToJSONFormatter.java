package ExtencionLog;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import org.json.simple.JSONObject;

public class ToJSONFormatter extends Formatter {

	public String format (LogRecord  record) {
		JSONObject objetoJSON = new JSONObject();
		objetoJSON.put("Message: ", record.getMessage());
		objetoJSON.put("Level: ", record.getLevel());
		return objetoJSON.toJSONString();
	}


}
