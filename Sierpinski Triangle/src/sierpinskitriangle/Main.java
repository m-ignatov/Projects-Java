package sierpinskitriangle;

import javax.swing.JFrame;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class DemoGraphics extends Canvas {

    @Override
    public void paint(Graphics g) {
        int x = 512;
        int y = 382;

        int x1 = 512;
        int y1 = 109;
        int x2 = 146;
        int y2 = 654;
        int x3 = 876;
        int y3 = 654;

        for (int i = 1; i <= 50000; i++) {
            g.drawLine(x, y, x, y);
            
            /* try {
            Thread.sleep(1);
            } catch (InterruptedException ex) {
            Logger.getLogger(DemoGraphics.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            
            int range = 3;
            int num = (int) (Math.random() * range) + 1;

            switch (num) {
                case 1: {
                    int dx = x - x1;
                    int dy = y - y1;
                    x = x - dx / 2;
                    y = y - dy / 2;
                    break;
                }
                case 2: {
                    int dx = x - x2;
                    int dy = y - y2;
                    x = x - dx / 2;
                    y = y - dy / 2;
                    break;
                }
                case 3: {
                    int dx = x - x3;
                    int dy = y - y3;
                    x = x - dx / 2;
                    y = y - dy / 2;
                    break;
                }
                default:
                    break;
            }

        }
        g.drawString("Sierpinski Triangle", 462, 484);
    }
}

public class Main {

    static int winW = 1024;
    static int winH = 768;

    public static void main(String[] args) {
        
        JFrame win = new JFrame("Sierpinski Triangle");
        win.setSize(winW, winH);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DemoGraphics canvas = new DemoGraphics();
        win.add(canvas);
        win.setVisible(true);
    }
}
