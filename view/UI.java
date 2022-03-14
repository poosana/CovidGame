package view;

import javax.swing.*;
import java.awt.*;

public class UI{
    GameManager gm;
    JFrame window;
    public JTextArea messageText;
    public JPanel bgPanel[] = new JPanel[10];
    public JLabel bgLabel[] = new JLabel[10];

    public UI(GameManager gm){
        this.gm = gm;
        createMainField();

        window.setVisible(true);
    }
    public void createMainField(){
        window = new JFrame("Covid Game");
        ImageIcon bg = new ImageIcon("E://bg.jpg");
        window.add(new JLabel(bg));
        window.pack();
        JButton start_button = new JButton("Start");
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}