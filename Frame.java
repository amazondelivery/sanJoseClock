import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frame extends JFrame {

    /**
     * Thank you Coderguy194 from CodeProject.com for helping me make
    undecorated windows moveable.
     */

    int posX = 0;
    int posY = 0;

    public Frame() {
        this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(625, 250);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                posX = e.getX();
                posY = e.getY();
            }
        });

        this.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                setLocation (e.getXOnScreen() - posX, e.getYOnScreen() - posY);
            }
        });
        this.setTitle("San Jose's Clock");
    }

    public void paint(Graphics graph) {
        Graphics2D graphics = (Graphics2D) graph;
        graphics.setStroke(new BasicStroke(3));
        graphics.drawLine(0, 0, 10, 10);
    }
}
