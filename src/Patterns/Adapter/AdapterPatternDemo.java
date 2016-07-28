package Patterns.Adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		
		MediaPlayer myPlayer = new AudioPlayer();
		
		myPlayer.play("mp3", "Thrilling.mp3");
		myPlayer.play("mp4", "alone.mp4");
		myPlayer.play("vlc", "far far away.vlc");
		myPlayer.play("avi", "mind me.avi");
	}

}
