package pl.adriankurek;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class App extends JFrame {
    private JTextArea txtArea;

    public App() {
        super("KeyListener App");

        txtArea = new JTextArea();

        txtArea.setLineWrap(true);
        txtArea.addKeyListener(new MyKeyListener());

        add(txtArea);

        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class MyKeyListener implements KeyListener {
        public void keyPressed(KeyEvent event) {
            if(event.getKeyChar() == KeyEvent.CHAR_UNDEFINED) {
                System.out.println("CHAR CODE: " + event.getKeyCode());
            } else {
                System.out.println("Naciśnięto klawisz " + event.getKeyChar() + ". CHAR CODE: " + event.getKeyCode() + ".");
            }
        }
        public void keyReleased(KeyEvent event) {
            // Puszczono przycisk.
        }
        public void keyTyped(KeyEvent event) {
            // Naciśnięto przycisk.
        }
    }

    public static void main(String[] args) {
        new App();
    }
}