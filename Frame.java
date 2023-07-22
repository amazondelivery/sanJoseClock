import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;

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
        this.setSize(1250, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        //this.addMouseListener(new MouseAdapter() {

        //}
        this.setTitle("San Jose's Clock");
    }

    public void paint(Graphics graph) {
        Graphics2D graphics = (Graphics2D) graph;
        graphics.drawLine(0, 0, 350, 350);
    }
}
