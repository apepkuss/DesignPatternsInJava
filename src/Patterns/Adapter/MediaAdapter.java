package Patterns.Adapter;

public class MediaAdapter implements MediaPlayer {
	
	private AdvancedMediaPlayer advancedPlayer;
	
	public MediaAdapter(String mediaType) {
		if (mediaType.equalsIgnoreCase("VLC"))
			this.advancedPlayer = new VlcPlayer();
		else if (mediaType.equalsIgnoreCase("MP4"))
			this.advancedPlayer = new Mp4Player();
	}
	
	@Override
	public void play(String mediaType, String fileName) {
		if (mediaType.equalsIgnoreCase("VLC"))
			this.advancedPlayer.playVlc(fileName);
		else if (mediaType.equalsIgnoreCase("MP4"))
			this.advancedPlayer.playMp4(fileName);
	}
}
