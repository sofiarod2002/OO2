package ExtencionLog;

import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class RestrictedHandler extends FileHandler{
	private Set<String> censoredWords = new HashSet<>(Arrays.asList("switch-statements","envidiar-atributos"));

    public RestrictedHandler(String pattern, boolean append) throws IOException, SecurityException {
        super(pattern, append);
    }
	
    @Override
    public void publish(LogRecord record) {
        // Censurar el mensaje del registro
        String censoredMessage = censorString(record.getMessage());
        
        // Crear un nuevo LogRecord con el mensaje censurado
        LogRecord censoredRecord = new LogRecord(record.getLevel(), censoredMessage);
        censoredRecord.setLoggerName(record.getLoggerName());
        censoredRecord.setParameters(record.getParameters());
        censoredRecord.setResourceBundle(record.getResourceBundle());
        censoredRecord.setResourceBundleName(record.getResourceBundleName());
        censoredRecord.setSequenceNumber(record.getSequenceNumber());
        censoredRecord.setSourceClassName(record.getSourceClassName());
        censoredRecord.setSourceMethodName(record.getSourceMethodName());
        censoredRecord.setThrown(record.getThrown());

        // Llamar al método publish de la superclase con el registro censurado
        super.publish(censoredRecord);
    }
	 
	 private String censorString(String message) {
	        String[] words = message.split("\\s+");
	        for (int i = 0; i < words.length; i++) {
	            // Eliminar puntuación para comparar solo las palabras
	            String word = words[i].replaceAll("[^a-zA-Z]", "");
	            if (censoredWords.contains(word.toLowerCase())) {
	                // Reemplazar la palabra censurada por ***
	                words[i] = words[i].replace(word, "***");
	            }
	        }
	        // Volver a ensamblar el mensaje censurado
	        return String.join(" ", words);
	    }
	 



}
