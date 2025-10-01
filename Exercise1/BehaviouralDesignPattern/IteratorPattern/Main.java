import src.*;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song A"));
        playlist.addSong(new Song("Song B"));
        playlist.addSong(new Song("Song C"));

        SongIterator iterator = playlist.createIterator();

        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Playing: " + song.getName());
        }
    }
}
