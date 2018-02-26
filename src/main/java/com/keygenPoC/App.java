package com.keygenPoC;

import javazoom.jl.decoder.JavaLayerException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 * @author rub'n
 * 46 75 63 6b 4f 66 66 5f 44 65 73 69 72 65 65 5f 46 75 63 6b 69 6e 67 5f 50 6f 6c 4f
 *
 */
public class App extends KeyGen {
    private static final String $_$$MuS$IIIC = "keygen.mp3";

    public App() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, MalformedURLException {
        super();

    }

    public static void main(String[] args) throws javazoom.jlgui.basicplayer.BasicPlayerException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, LineUnavailableException, IOException, UnsupportedAudioFileException, JavaLayerException, InterruptedException {
        final javazoom.jlgui.basicplayer.BasicPlayer player = new javazoom.jlgui.basicplayer.BasicPlayer();
        final java.io.BufferedInputStream out = new java.io.BufferedInputStream(App.class.getClassLoader().getResourceAsStream($_$$MuS$IIIC));

        player.open(out);
        player.play();
        new App();
    }
}