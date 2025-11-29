"""Tests for Adapter Pattern."""

import pytest
from design_patterns.ex4_adapter import (
    AudioPlayer, VlcPlayer, Mp4Player, MediaAdapter
)


def test_play_mp3():
    """Test playing MP3 file directly."""
    player = AudioPlayer()
    result = player.play("mp3", "song.mp3")
    assert result == "Playing mp3 file: song.mp3"


def test_play_vlc():
    """Test playing VLC file through adapter."""
    player = AudioPlayer()
    result = player.play("vlc", "movie.vlc")
    assert result == "Playing vlc file: movie.vlc"


def test_play_mp4():
    """Test playing MP4 file through adapter."""
    player = AudioPlayer()
    result = player.play("mp4", "video.mp4")
    assert result == "Playing mp4 file: video.mp4"


def test_invalid_format():
    """Test unsupported media format."""
    player = AudioPlayer()
    result = player.play("avi", "video.avi")
    assert result == "Invalid media type: avi"


def test_vlc_player_directly():
    """Test VlcPlayer directly."""
    vlc_player = VlcPlayer()
    assert vlc_player.play_vlc("test.vlc") == "Playing vlc file: test.vlc"
    assert vlc_player.play_mp4("test.mp4") == ""


def test_mp4_player_directly():
    """Test Mp4Player directly."""
    mp4_player = Mp4Player()
    assert mp4_player.play_mp4("test.mp4") == "Playing mp4 file: test.mp4"
    assert mp4_player.play_vlc("test.vlc") == ""


def test_media_adapter_with_vlc():
    """Test MediaAdapter with VLC format."""
    adapter = MediaAdapter("vlc")
    result = adapter.play("vlc", "test.vlc")
    assert result == "Playing vlc file: test.vlc"


def test_media_adapter_with_mp4():
    """Test MediaAdapter with MP4 format."""
    adapter = MediaAdapter("mp4")
    result = adapter.play("mp4", "test.mp4")
    assert result == "Playing mp4 file: test.mp4"


def test_case_insensitive_formats():
    """Test case-insensitive format handling."""
    player = AudioPlayer()
    assert player.play("MP3", "song.mp3") == "Playing mp3 file: song.mp3"
    assert player.play("VLC", "movie.vlc") == "Playing vlc file: movie.vlc"
    assert player.play("MP4", "video.mp4") == "Playing mp4 file: video.mp4"
