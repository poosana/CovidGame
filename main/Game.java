package main;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Game extends JFrame {

    private GameScreen gameScreen;

    private BufferedImage img;

    public Game() {

        ImportImg();

        setSize(620,640);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        gameScreen = new GameScreen(img);
        add(gameScreen);
    }

    private void ImportImg(){
        InputStream is = getClass().getResourceAsStream("");
        try{
            img = ImageIO.read(is);
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Game game = new Game();
    }
}
