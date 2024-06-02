package ejer12;

public class cuatroGConnectionAdapter implements Connection{
	private cuatroGConnection  cuatroG = new cuatroGConnection("4G logo");

	@Override
	public String sendData(String data, long crc) {
		return cuatroG.transmit(data, crc);
	}

	@Override
	public String pict() {
		return cuatroG.getSymb();
	}

}
