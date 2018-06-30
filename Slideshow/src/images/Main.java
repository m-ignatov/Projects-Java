package images;

import java.awt.*;
import java.io.File;
import javax.swing.JFrame;
import javax.imageio.ImageIO;

class ImageDemo extends Canvas {

    Image img;
    static int imgW = 960;
    static int imgH = 640;
    static int offsetXImage = 30;
    static int offsetYImage = 50;
    
    static int fontSize = 30;    
    static int offsetXText = 30;
    static int offsetYText = 40;
   
    String subdir = "photos/";
    String arr[] = new String[]{subdir + "esen1.png", subdir + "esen2.png", subdir + "esen3.png", subdir + "esen4.png", subdir + "esen5.png"};

    @Override
    public void paint(Graphics g) {

        Font f = new Font("Tahoma", Font.BOLD, fontSize);
        g.setColor(Color.orange);
        g.setFont(f);
        g.drawString("Autumn in Rodopite", offsetXText, offsetYText);

        int i = 0;
        while (true) {
            try {
                img = ImageIO.read(new File(arr[i % 5]));
                i++;
                g.drawImage(img, offsetXImage, offsetYImage, imgW, imgH, this);
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class Main {

    static int winW = 1024;
    static int winH = 750;

    public static void main(String[] args) throws Exception {
        JFrame win = new JFrame("Slideshow");

        win.setSize(winW, winH);
        win.setResizable(false);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new ImageDemo());
        win.setVisible(true);
    }
}
