package ejer12;

public class WifiConn implements Connection{
	private String pict;
	
	public WifiConn(String pict) {
		this.pict = pict;
	}
	

	public String sendData(String data, long crc) {
		return "Informacion con Wifi: "+data+" "+crc;
	}

	public String pict() {
		return pict;
	}

}
