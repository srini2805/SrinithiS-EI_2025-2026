package src;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public SongIterator createIterator() {
        return new PlaylistIterator();
    }

    // Inner private class implementing SongIterator
    private class PlaylistIterator implements SongIterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < songs.size();
        }

        @Override
        public Song next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return songs.get(index++);
        }
    }
}
