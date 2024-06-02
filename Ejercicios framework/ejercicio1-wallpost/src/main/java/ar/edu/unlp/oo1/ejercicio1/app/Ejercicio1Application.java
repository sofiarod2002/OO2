package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;

import ExtencionLog.RestrictedHandler;
import ExtencionLog.ToJSONFormatter;
import ExtencionLog.ToUpperCaseFormatter;
import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {
	private static final Logger app = Logger.getLogger("app");
	private static FileHandler fileHandler;
	private static RestrictedHandler restrictedHandler;
	
    static {
        try {
        	restrictedHandler = new RestrictedHandler("log.txt", true); // Append mode
            //fileHandler.setFormatter(new ToUpperCaseFormatter());
        	restrictedHandler.setFormatter(new ToJSONFormatter());
            app.addHandler(restrictedHandler);
            app.setLevel(Level.INFO);
            app.setUseParentHandlers(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public static void main(String[] args) throws SecurityException, IOException {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
	}

}
