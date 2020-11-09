package CompositePattern;

public class Program {

	public static void main(String args[]) {
		
		Playlist studyPlaylist = new Playlist("Study");		

		Playlist synthPopPlaylist = new Playlist("Synth Pop");
		Song synthPopSong1 = new Song("Girl Like You", "Toro Y Moi" );
		Song synthPopSong2 = new Song("Outside", "TOPS");
		synthPopPlaylist.add(synthPopSong1);
		synthPopPlaylist.add(synthPopSong2);

		
		Playlist experimentalPlaylist = new Playlist("Experimental");		
		Song experimentalSong1 = new Song("About you", "XXYYXX");
		Song experimentalSong2 = new Song("Motivation", "Clams Casino");	
		Song experimentalSong3 = new Song("Computer Vision", "Oneohtrix Point Never");
		experimentalPlaylist.add(experimentalSong1);
		experimentalPlaylist.add(experimentalSong2);
		experimentalPlaylist.add(experimentalSong3);
		float slowSpeed = 0.5f;
		experimentalPlaylist.setPlaybackSpeed(slowSpeed);
		
		experimentalPlaylist.add(synthPopPlaylist);

		studyPlaylist.add(experimentalPlaylist);

		
		Song glitchSong = new Song("Textuell", "Oval");
		float fasterSpeed = 1.25f;
		glitchSong.setPlaybackSpeed(fasterSpeed);
		glitchSong.play(); 
		String name = glitchSong.getName(); 
		String artist = glitchSong.getArtist(); 
		System.out.println ("The song name is " + name );
		System.out.println ("The song artist is " + artist );

		studyPlaylist.add(glitchSong);

		studyPlaylist.play(); 

		System.out.println ("The Playlist's name is " + studyPlaylist.getName() );
		}
	}
