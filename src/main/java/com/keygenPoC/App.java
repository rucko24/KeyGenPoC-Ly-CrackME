package com.keygenPoC;


/**
 * @author rub'n
 * 46 75 63 6b 4f 66 66 5f 44 65 73 69 72 65 65 5f 46 75 63 6b 69 6e 67 5f 50 6f 6c 4f
 *
 */
public class App extends KeyGen {

    public App() {
        super();

    }

    public static void main(String[] args) {
        try {
            final javazoom.jlgui.basicplayer.BasicPlayer player = new javazoom.jlgui.basicplayer.BasicPlayer();
            final java.io.BufferedInputStream out = new java.io.BufferedInputStream(App.class.getClassLoader().getResourceAsStream("keygen.mp3"));

            player.open(out);
            player.play();
            new App();
        } catch (Exception ex) {}

    }
}