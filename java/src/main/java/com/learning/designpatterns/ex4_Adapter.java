package com.learning.designpatterns;

/**
 * Exercise: Adapter Pattern (Structural)
 *
 * Implement the Adapter pattern to make incompatible interfaces work together.
 * Create adapters for different media players to work with a common interface.
 *
 * Requirements:
 * 1. Create a MediaPlayer interface with play() method
 * 2. Create AdvancedMediaPlayer interface with playVlc() and playMp4() methods
 * 3. Implement concrete classes: VlcPlayer and Mp4Player
 * 4. Create MediaAdapter to adapt AdvancedMediaPlayer to MediaPlayer interface
 * 5. Create AudioPlayer that uses MediaAdapter for advanced formats
 *
 * Example:
 * AudioPlayer player = new AudioPlayer();
 * player.play("mp3", "song.mp3");  // Plays directly
 * player.play("vlc", "movie.vlc"); // Uses adapter
 * player.play("mp4", "video.mp4"); // Uses adapter
 *
 * Use Cases: Legacy code integration, third-party library integration
 *
 * Time Complexity: O(1) for adapter operations
 * Space Complexity: O(1)
 */
public class ex4_Adapter {

    /**
     * MediaPlayer interface - the target interface our client expects.
     */
    public interface MediaPlayer {
        /**
         * Plays media of given type.
         * @param audioType The type of audio (mp3, vlc, mp4)
         * @param fileName The name of the file to play
         * @return A message indicating what is being played, or error message
         */
        String play(String audioType, String fileName);
    }

    /**
     * AdvancedMediaPlayer interface - the incompatible interface we need to adapt.
     */
    public interface AdvancedMediaPlayer {
        String playVlc(String fileName);
        String playMp4(String fileName);
    }

    /**
     * VlcPlayer - concrete implementation of AdvancedMediaPlayer.
     */
    public static class VlcPlayer implements AdvancedMediaPlayer {
        // TODO: Implement playVlc to return "Playing vlc file: [fileName]"
        @Override
        public String playVlc(String fileName) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        // TODO: VLC player doesn't support mp4, return empty string
        @Override
        public String playMp4(String fileName) {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Mp4Player - concrete implementation of AdvancedMediaPlayer.
     */
    public static class Mp4Player implements AdvancedMediaPlayer {
        // TODO: MP4 player doesn't support vlc, return empty string
        @Override
        public String playVlc(String fileName) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        // TODO: Implement playMp4 to return "Playing mp4 file: [fileName]"
        @Override
        public String playMp4(String fileName) {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * MediaAdapter - adapts AdvancedMediaPlayer to MediaPlayer interface.
     */
    public static class MediaAdapter implements MediaPlayer {
        private AdvancedMediaPlayer advancedPlayer;

        public MediaAdapter(String audioType) {
            // TODO: Create appropriate AdvancedMediaPlayer based on audioType
            // "vlc" -> VlcPlayer, "mp4" -> Mp4Player
            throw new UnsupportedOperationException("Not implemented yet");
        }

        // TODO: Implement play method that delegates to appropriate advanced player method
        @Override
        public String play(String audioType, String fileName) {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * AudioPlayer - the main player that uses adapter for advanced formats.
     */
    public static class AudioPlayer implements MediaPlayer {
        private MediaAdapter mediaAdapter;

        // TODO: Implement play method
        // If audioType is "mp3", return "Playing mp3 file: [fileName]"
        // For "vlc" or "mp4", use MediaAdapter
        // For unsupported formats, return "Invalid media type: [audioType]"
        @Override
        public String play(String audioType, String fileName) {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }
}
