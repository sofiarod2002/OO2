package ejer12;

public class Dispositivo {
	private CRC crc; 
	private Ringer ringer = new Ringer();
	private Display display = new Display();
	private Connection connection;
	
	public Dispositivo() {
		this.crc = new CRC16_Calculator();
		this.connection = new WifiConn("Wifi logo");
	}
	
	public String send (String data) {
		long crc = this.crc.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	public String conectarCon(Connection nueva) {
		this.connection = nueva;
		return connection.pict() + " "+ringer.ring();
	}
	
	public void configurarCRC(CRC nuevo) {
		this.crc = nuevo;
	}
	
	//SOLO LO USO PARA EL TEST
	public CRC getCRC () {
		return this.crc;
	}

}
