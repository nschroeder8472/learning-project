"""
Exercise: Adapter Pattern (Structural)

Implement the Adapter pattern to make incompatible interfaces work together.
Create adapters for different media players to work with a common interface.

Requirements:
1. Create a MediaPlayer interface/base class with play() method
2. Create AdvancedMediaPlayer interface with play_vlc() and play_mp4() methods
3. Implement concrete classes: VlcPlayer and Mp4Player
4. Create MediaAdapter to adapt AdvancedMediaPlayer to MediaPlayer interface
5. Create AudioPlayer that uses MediaAdapter for advanced formats

Example:
    player = AudioPlayer()
    player.play("mp3", "song.mp3")  # Plays directly
    player.play("vlc", "movie.vlc") # Uses adapter
    player.play("mp4", "video.mp4") # Uses adapter

Use Cases: Legacy code integration, third-party library integration

Time Complexity: O(1) for adapter operations
Space Complexity: O(1)
"""

from abc import ABC, abstractmethod
from typing import Optional


class MediaPlayer(ABC):
    """Target interface that our client expects."""

    @abstractmethod
    def play(self, audio_type: str, file_name: str) -> str:
        """
        Plays media of given type.
        Args:
            audio_type: The type of audio (mp3, vlc, mp4)
            file_name: The name of the file to play
        Returns:
            A message indicating what is being played, or error message
        """
        pass


class AdvancedMediaPlayer(ABC):
    """The incompatible interface we need to adapt."""

    @abstractmethod
    def play_vlc(self, file_name: str) -> str:
        pass

    @abstractmethod
    def play_mp4(self, file_name: str) -> str:
        pass


class VlcPlayer(AdvancedMediaPlayer):
    """Concrete implementation for VLC format."""

    def play_vlc(self, file_name: str) -> str:
        """
        TODO: Implement to return "Playing vlc file: {file_name}"
        """
        raise NotImplementedError("Not implemented yet")

    def play_mp4(self, file_name: str) -> str:
        """
        TODO: VLC player doesn't support mp4, return empty string
        """
        raise NotImplementedError("Not implemented yet")


class Mp4Player(AdvancedMediaPlayer):
    """Concrete implementation for MP4 format."""

    def play_vlc(self, file_name: str) -> str:
        """
        TODO: MP4 player doesn't support vlc, return empty string
        """
        raise NotImplementedError("Not implemented yet")

    def play_mp4(self, file_name: str) -> str:
        """
        TODO: Implement to return "Playing mp4 file: {file_name}"
        """
        raise NotImplementedError("Not implemented yet")


class MediaAdapter(MediaPlayer):
    """Adapter that adapts AdvancedMediaPlayer to MediaPlayer interface."""

    def __init__(self, audio_type: str):
        """
        TODO: Create appropriate AdvancedMediaPlayer based on audio_type
        "vlc" -> VlcPlayer, "mp4" -> Mp4Player
        """
        self.advanced_player: Optional[AdvancedMediaPlayer] = None
        raise NotImplementedError("Not implemented yet")

    def play(self, audio_type: str, file_name: str) -> str:
        """
        TODO: Delegate to appropriate advanced player method
        """
        raise NotImplementedError("Not implemented yet")


class AudioPlayer(MediaPlayer):
    """Main player that uses adapter for advanced formats."""

    def __init__(self):
        self.media_adapter: Optional[MediaAdapter] = None

    def play(self, audio_type: str, file_name: str) -> str:
        """
        TODO: Implement play method
        If audio_type is "mp3", return "Playing mp3 file: {file_name}"
        For "vlc" or "mp4", create and use MediaAdapter
        For unsupported formats, return "Invalid media type: {audio_type}"
        Hint: Make comparison case-insensitive
        """
        raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    player = AudioPlayer()

    print(player.play("mp3", "song.mp3"))
    print(player.play("vlc", "movie.vlc"))
    print(player.play("mp4", "video.mp4"))
    print(player.play("avi", "clip.avi"))
