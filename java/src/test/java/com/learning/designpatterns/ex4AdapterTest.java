package com.learning.designpatterns;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import com.learning.designpatterns.ex4_Adapter.*;

class ex4AdapterTest {

    private AudioPlayer audioPlayer;

    @BeforeEach
    void setUp() {
        audioPlayer = new AudioPlayer();
    }

    @Test
    void testPlayMp3() {
        String result = audioPlayer.play("mp3", "song.mp3");
        assertEquals("Playing mp3 file: song.mp3", result);
    }

    @Test
    void testPlayVlc() {
        String result = audioPlayer.play("vlc", "movie.vlc");
        assertEquals("Playing vlc file: movie.vlc", result);
    }

    @Test
    void testPlayMp4() {
        String result = audioPlayer.play("mp4", "video.mp4");
        assertEquals("Playing mp4 file: video.mp4", result);
    }

    @Test
    void testInvalidFormat() {
        String result = audioPlayer.play("avi", "video.avi");
        assertEquals("Invalid media type: avi", result);
    }

    @Test
    void testVlcPlayerDirectly() {
        VlcPlayer vlcPlayer = new VlcPlayer();
        assertEquals("Playing vlc file: test.vlc", vlcPlayer.playVlc("test.vlc"));
        assertEquals("", vlcPlayer.playMp4("test.mp4"), "VLC player should not support MP4");
    }

    @Test
    void testMp4PlayerDirectly() {
        Mp4Player mp4Player = new Mp4Player();
        assertEquals("Playing mp4 file: test.mp4", mp4Player.playMp4("test.mp4"));
        assertEquals("", mp4Player.playVlc("test.vlc"), "MP4 player should not support VLC");
    }

    @Test
    void testMediaAdapterWithVlc() {
        MediaAdapter adapter = new MediaAdapter("vlc");
        String result = adapter.play("vlc", "test.vlc");
        assertEquals("Playing vlc file: test.vlc", result);
    }

    @Test
    void testMediaAdapterWithMp4() {
        MediaAdapter adapter = new MediaAdapter("mp4");
        String result = adapter.play("mp4", "test.mp4");
        assertEquals("Playing mp4 file: test.mp4", result);
    }

    @Test
    void testCaseInsensitiveFormats() {
        assertEquals("Playing mp3 file: song.mp3", audioPlayer.play("MP3", "song.mp3"));
        assertEquals("Playing vlc file: movie.vlc", audioPlayer.play("VLC", "movie.vlc"));
        assertEquals("Playing mp4 file: video.mp4", audioPlayer.play("MP4", "video.mp4"));
    }
}
