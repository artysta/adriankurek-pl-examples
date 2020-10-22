package pl.adriankurek;

import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame {
    private JLabel label;
    private JPanel panel;

    public App() {
        super("KeyAdapter App");

        label = new JLabel("Naciśnij jakiś klawisz.");
        label.setFocusable(true);
        label.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent event) {
                if (event.getKeyChar() == KeyEvent.CHAR_UNDEFINED) {
                    label.setText("Naciśnij inny klawisz!");
                } else {
                    label.setText("Naciśnięto klawisz: " + event.getKeyChar());
                }
            }
        });

        panel = new JPanel();
        panel.add(label);

        add(panel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}
