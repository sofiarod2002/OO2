package ejer12;

public class cuatroGConnection {
	private String Symb;
	
	public cuatroGConnection(String symb) {
		this.Symb = symb;
	}
	
	public String transmit(String data, long crc) {
		return "Informacion con 4G: "+data+" "+crc;
	}

	public String getSymb() {
		return Symb;
	}

	
}
