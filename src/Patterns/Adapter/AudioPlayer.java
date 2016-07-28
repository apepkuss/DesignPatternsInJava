package Patterns.Adapter;

public class AudioPlayer implements MediaPlayer {
	private MediaAdapter adapter;
	
	@Override
	public void play(String mediaType, String fileName) {
		if (mediaType.equalsIgnoreCase("MP3"))
			System.out.println("Playing " + fileName + "." + mediaType);
		else if (mediaType.equalsIgnoreCase("VLC") || mediaType.equalsIgnoreCase("MP4")) {
			adapter = new MediaAdapter(mediaType);
			adapter.play(mediaType, fileName);
		}
		else
			System.out.println("Invalid media type: " + mediaType);
	}
}
