package pl.adriankurek;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class App extends JFrame {
    private JPanel panel;
    private JLabel label;

    public App() {
        super("MouseListener App");
        panel = new JPanel();
        label = new JLabel("Naciśnij przycisk myszy, gdy kursor jest na panelu.");

        panel.addMouseListener(new MyMouseListener());
        panel.add(label);

        add(panel);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            System.out.println("Naciśnięto przycisk myszy. (zwykłe pojedyncze kliknięcie)");
        }
        public void mousePressed(MouseEvent e) {
            System.out.println("Przycisk jest naciśnięty. (naciśnięto go, ale jeszcze nie zwolniono)!");
        }
        public void mouseReleased(MouseEvent e) {
            System.out.println("Zwolniono przycisk myszy.");
        }
        public void mouseEntered(MouseEvent e) {
            System.out.println("Kursor wszedł w obszar panelu.");
        }
        public void mouseExited(MouseEvent e) {
            System.out.println("Kursor opuścił w obszar panelu.");
        }
    }

    public static void main(String[] args) {
        new App();
    }
}