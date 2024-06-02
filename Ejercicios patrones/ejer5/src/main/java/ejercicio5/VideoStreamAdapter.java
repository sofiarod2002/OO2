package ejercicio5;

public class VideoStreamAdapter extends Media{
	private VideoStream vs = new VideoStream();
	
	public String play() {
		return vs.reproduce();
	}

}
