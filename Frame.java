import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {
    public Frame() {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setSize(1250, 500);
       this.setLocationRelativeTo(null);
       this.setVisible(true);
    }

    public void paint(Graphics graph) {
        Graphics2D graphics = (Graphics2D) graph;
        graphics.drawLine(0, 0, 350, 350);
    }
}
