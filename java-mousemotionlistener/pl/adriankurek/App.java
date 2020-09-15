package pl.adriankurek;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class App extends JFrame {
    private JPanel panel;
    private JLabel label;

    public App() {
        super("MouseMotionListener App");
        panel = new JPanel();
        label = new JLabel("Przejedź kursorem po panelu.");

        panel.addMouseMotionListener(new MyMouseMotionListener());
        panel.add(label);

        add(panel);

        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class MyMouseMotionListener implements MouseMotionListener {
        public void mouseDragged(MouseEvent e) {
            System.out.println("Pozycja kursora na panelu (NACISNIETY PRZYCISK MYSZY): x " + e.getX() + ", y " + e.getY() + ".");
        }
        public void mouseMoved(MouseEvent e) {
            System.out.println("Pozycja kursora na panelu: x " + e.getX() + ", y " + e.getY() + ".");
        }
    }

    public static void main(String[] args) {
        new App();
    }
}