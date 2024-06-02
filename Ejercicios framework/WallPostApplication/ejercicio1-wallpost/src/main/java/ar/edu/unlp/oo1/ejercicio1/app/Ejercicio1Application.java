package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {
	private static final Logger app = Logger.getLogger("logger");
	private static FileHandler fileHandler;
	
    static {
        try {
            fileHandler = new FileHandler("log.txt", true); // Append mode
            app.addHandler(fileHandler);
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
