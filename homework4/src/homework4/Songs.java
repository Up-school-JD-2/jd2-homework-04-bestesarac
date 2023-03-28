package homework4;

import java.util.List;

public class Songs extends Albums{

	private String songName;
	private double songDuration;
	
	public Songs(String albumName, String artistName, int releaseDate, String songList, String songName,
			double songDuration) {
		super(albumName, artistName, releaseDate, songList);
		this.songName = songName;
		this.songDuration = songDuration;
		
	
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public double getSongDuration() {
		return songDuration;
	}

	public void setSongDuration(int songDuration) {
		this.songDuration = songDuration;
	}
	
	
}
