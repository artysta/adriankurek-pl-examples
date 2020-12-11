package pl.adriankurek;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {
    private JPanel panel;
    private JLabel label;

    public App() {
        super("MouseAdapter App");

        panel = new JPanel();
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent event) {
                panel.setBackground(Color.MAGENTA);
            }
            
            @Override
            public void mouseReleased(MouseEvent event) {
                panel.setBackground(Color.CYAN);
            }
        });

        label = new JLabel("Naciśnij przycisk myszy.");

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
