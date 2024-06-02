package ExtencionLog;

import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class ToUpperCaseFormatter extends SimpleFormatter {

	public String format (LogRecord  record) {
		return super.format(record).toUpperCase();
	}
}
