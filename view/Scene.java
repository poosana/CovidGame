package view;

import javax.swing.*;
import java.awt.*;

public class Scene extends JPanel {
    public static int WIDTH = 1000;
    public static int HEIGHT = 600;

    public Scene(){
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }
}
