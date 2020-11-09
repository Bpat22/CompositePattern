package CompositePattern;

import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	} 
	
	public void play() {
		/*if(this.playlist.isEmpty()==false) {
			for(IComponent song : this.playlist)
				song.play();
		}else {
			return;
		}*/
		for(IComponent song : playlist) {
			song.play();
		}	
	}
	
	public void setPlaybackSpeed(float speed) {
		for (IComponent song : playlist) {
			song.setPlaybackSpeed(speed);
		}
		/*if(this.playlist.isEmpty() == false) {
			for (IComponent song : this.playlist)
				song.setPlaybackSpeed(speed);
		}else {
			return;
		}*/
	}
	
	public String getName() {
		return this.playlistName;
	}

	public void add(IComponent component) {
		this.playlist.add(component);
	}
	
	public void remove (IComponent component) {
		this.playlist.remove(component);
	}
}

