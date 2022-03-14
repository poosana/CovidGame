package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class CovidGameScreen extends JFrame {
    public CovidGameScreen(){
        //สร้างหน้าจอหลัก
        setTitle("COVID Game");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,1,0,0));
        start();
        setVisible(true);
    }

    public void start(){
        //ใส่หน้าจอย่อย
        Scene s = new Scene();
        add(s);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new CovidGameScreen();
    }
}
