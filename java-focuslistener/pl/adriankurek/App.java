package pl.adriankurek;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

public class App extends JFrame {
    private JPanel panel;
    private JButton btn1;
    private JButton btn2;
    public App() {
        super("FocusListener App");
        panel = new JPanel();
        btn1 = new JButton("Tak");
        btn2 = new JButton("Nie");
        FocusListener listener = new MyFocusListener();
        btn1.addFocusListener(listener);
        btn2.addFocusListener(listener);
        panel.add(btn1);
        panel.add(btn2);
    
        add(panel);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    class MyFocusListener implements FocusListener {
        public void focusGained(FocusEvent fe) {
            System.out.println("Przycisk \"" + ((JButton)fe.getSource()).getText() + "\" zyskał focus.");
        }
         
        public void focusLost(FocusEvent fe) {
            System.out.println("Przycisk \"" + ((JButton)fe.getSource()).getText() + "\" stracił focus.");            
        }
    }
    public static void main(String[] args) {
        new App();
    }
}