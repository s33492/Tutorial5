import java.util.ArrayList;

public class Playlist {
    
    private String name;
    private String artist;
    private String title;
    private String creator;
    private ArrayList<String> Track = new ArrayList<>();
    private ArrayList<String> Playlists = new ArrayList<>();

    public Playlist(String name, String creator) {
    }


    public void addTrack(String artist, String title) {

        this.artist = artist;
        this.title = title;
        Track.add(title +" " +artist);

    }

    public void displayTracks() {
        for (int i = 0; i < Track.size(); i++) {
            System.out.println(i+1 + ". " + Track.get(i));
        }

    }

    public void createPlaylist(String name){
        this.name=name;
        Playlists.add(name);
    }
    public void createPlaylist(String name, String creator){
        this.name= name;
        this.creator = creator;
        Playlists.add(name+" "+creator);
    }

    public void addTrackToPlaylist(String artist, String title, String name) {
        this.artist = artist;
        this.title = title;
        Track.add(title +" " +artist);
        Playlists.add(name);

    }

    public void displayAllPlaylists() {
        
    }

    public void displayPlaylist(String name) {
    }

    public void searchTracks(String artist) {
    }

    public void removeTrack(String title) {
        
    }

    public int getTrackCount() {
        return Track.size();
    }

    public int getPlaylistCount() {
        return Playlists.size();
    }
}
