package EightQueensGA;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by dmngu9 on 1/28/2017.
 */
public class Queen {
    private BufferedImage img = null;
    private static int width = 70;
    private static int height = 70;

    public Queen() {
        try{
            this.img = ImageIO.read(new File("C:/Users/dmngu9/IdeaProjects/EightQueensWithGeneticAlgo" +
                                                "/image/queen.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void paint(Graphics g, int x, int y){
        g.drawImage(this.img, x, y, null);
    }

}
