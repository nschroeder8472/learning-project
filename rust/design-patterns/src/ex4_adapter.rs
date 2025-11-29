/// Exercise: Adapter Pattern (Structural)
///
/// Implement the Adapter pattern to make incompatible interfaces work together.
/// Create adapters for different media players to work with a common interface.
///
/// Requirements:
/// 1. Create MediaPlayer trait with play() method
/// 2. Create AdvancedMediaPlayer trait with play_vlc() and play_mp4() methods
/// 3. Implement VlcPlayer and Mp4Player
/// 4. Create MediaAdapter to adapt AdvancedMediaPlayer to MediaPlayer
/// 5. Create AudioPlayer that uses MediaAdapter for advanced formats
///
/// Example:
/// ```
/// let player = AudioPlayer::new();
/// player.play("mp3", "song.mp3");
/// player.play("vlc", "movie.vlc");
/// ```
///
/// Use Cases: Legacy code integration, third-party library integration
///
/// Time Complexity: O(1) for adapter operations
/// Space Complexity: O(1)

pub trait MediaPlayer {
    fn play(&self, audio_type: &str, file_name: &str) -> String;
}

pub trait AdvancedMediaPlayer {
    fn play_vlc(&self, file_name: &str) -> String;
    fn play_mp4(&self, file_name: &str) -> String;
}

/// VlcPlayer - plays VLC format.
pub struct VlcPlayer;

impl AdvancedMediaPlayer for VlcPlayer {
    /// TODO: Return "Playing vlc file: {file_name}"
    fn play_vlc(&self, file_name: &str) -> String {
        unimplemented!("Not implemented yet")
    }

    /// TODO: VLC doesn't support MP4, return empty string
    fn play_mp4(&self, _file_name: &str) -> String {
        unimplemented!("Not implemented yet")
    }
}

/// Mp4Player - plays MP4 format.
pub struct Mp4Player;

impl AdvancedMediaPlayer for Mp4Player {
    /// TODO: MP4 doesn't support VLC, return empty string
    fn play_vlc(&self, _file_name: &str) -> String {
        unimplemented!("Not implemented yet")
    }

    /// TODO: Return "Playing mp4 file: {file_name}"
    fn play_mp4(&self, file_name: &str) -> String {
        unimplemented!("Not implemented yet")
    }
}

/// MediaAdapter adapts AdvancedMediaPlayer to MediaPlayer interface.
pub struct MediaAdapter {
    advanced_player: Box<dyn AdvancedMediaPlayer>,
}

impl MediaAdapter {
    /// TODO: Create appropriate AdvancedMediaPlayer based on audio_type
    /// "vlc" -> VlcPlayer, "mp4" -> Mp4Player
    pub fn new(audio_type: &str) -> Self {
        unimplemented!("Not implemented yet")
    }
}

impl MediaPlayer for MediaAdapter {
    /// TODO: Delegate to appropriate advanced player method
    fn play(&self, audio_type: &str, file_name: &str) -> String {
        unimplemented!("Not implemented yet")
    }
}

/// AudioPlayer - main player that uses adapter for advanced formats.
pub struct AudioPlayer;

impl AudioPlayer {
    pub fn new() -> Self {
        AudioPlayer
    }
}

impl MediaPlayer for AudioPlayer {
    /// TODO: Implement play method
    /// If audio_type is "mp3", return "Playing mp3 file: {file_name}"
    /// For "vlc" or "mp4", create and use MediaAdapter
    /// For unsupported formats, return "Invalid media type: {audio_type}"
    /// Hint: Use to_lowercase() for case-insensitive comparison
    fn play(&self, audio_type: &str, file_name: &str) -> String {
        unimplemented!("Not implemented yet")
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_play_mp3() {
        let player = AudioPlayer::new();
        assert_eq!(
            player.play("mp3", "song.mp3"),
            "Playing mp3 file: song.mp3"
        );
    }

    #[test]
    fn test_play_vlc() {
        let player = AudioPlayer::new();
        assert_eq!(
            player.play("vlc", "movie.vlc"),
            "Playing vlc file: movie.vlc"
        );
    }

    #[test]
    fn test_play_mp4() {
        let player = AudioPlayer::new();
        assert_eq!(
            player.play("mp4", "video.mp4"),
            "Playing mp4 file: video.mp4"
        );
    }

    #[test]
    fn test_invalid_format() {
        let player = AudioPlayer::new();
        assert_eq!(
            player.play("avi", "video.avi"),
            "Invalid media type: avi"
        );
    }

    #[test]
    fn test_vlc_player_directly() {
        let vlc = VlcPlayer;
        assert_eq!(vlc.play_vlc("test.vlc"), "Playing vlc file: test.vlc");
        assert_eq!(vlc.play_mp4("test.mp4"), "");
    }

    #[test]
    fn test_mp4_player_directly() {
        let mp4 = Mp4Player;
        assert_eq!(mp4.play_mp4("test.mp4"), "Playing mp4 file: test.mp4");
        assert_eq!(mp4.play_vlc("test.vlc"), "");
    }

    #[test]
    fn test_case_insensitive() {
        let player = AudioPlayer::new();
        assert_eq!(
            player.play("MP3", "song.mp3"),
            "Playing mp3 file: song.mp3"
        );
        assert_eq!(
            player.play("VLC", "movie.vlc"),
            "Playing vlc file: movie.vlc"
        );
    }
}
