package painting;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Main extends Canvas implements MouseListener, MouseMotionListener {

    boolean isExit = false;
    static int winW = 800;
    static int winH = 600;
    int x, y, xOld = x + 1, yOld = y + 1;

    public Main() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(x, y, xOld, yOld);
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("Paint");
        win.setSize(winW, winH);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Main());
        win.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        xOld = x;
        yOld = y;
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
        isExit = true;
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        xOld = x;
        yOld = y;
        x = e.getX();
        y = e.getY();
        repaint();
    }

    @Override
    public void update(Graphics g) {
        if (isExit == false) {
            paint(g);
        } else {
            isExit = false;
            g.clearRect(0, 0, winW, winH);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
