package spinningtop;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;

public class Main extends Canvas implements MouseListener {

    static int winW = 800;
    static int winH = 600;
    int change = 1;
    int i = 0;
    Image img;

    public Main() {
        addMouseListener(this);
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("Spinning Top");
        win.setSize(winW, winH);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Main());
        win.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        try {
            img = ImageIO.read(new File("photos/tops" + i + ".gif"));
            g.drawImage(img, 0, 0, winW, winH, this);

            i += change;
            if (i < 0) {
                i = 17;
            } else {
                i %= 17;
            }
            Thread.sleep(30);
            repaint();

        } catch (Exception e) {
            System.out.println("Exception while reading file.");
        }
    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

    public void mouseClicked(MouseEvent e) {
        change = -change;
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {

    }
}
