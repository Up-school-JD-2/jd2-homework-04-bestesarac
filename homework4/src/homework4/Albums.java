package homework4;

import java.util.ArrayList;
import java.util.List;

public abstract class Albums {
	
	private String albumName;
	private String artistName;
	private int releaseDate;
	private String songList;
	
	

	public Albums(String albumName, String artistName, int releaseDate,String songList) {
		this.albumName = albumName;
		this.artistName = artistName;
		this.releaseDate = releaseDate;
		this.songList = songList;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public int getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getSongList() {
		return songList;
	}
	public void setSongList(String songList) {
		this.songList = songList;
	}

}
