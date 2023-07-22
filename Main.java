import java.awt.Graphics2D;
import javax.swing.JFrame;

public class Main {
    public static void main(String args[]) {
        Frame frame = new Frame();
        JFrame jFrame = new JFrame("Le Clock");


        Switch[][] switchArray = new Switch[8][20];
        for (int i = 0; i < switchArray.length; i++) {
            for (int k = 0; k < switchArray[0].length; k++) {
                switchArray[i][k] = new Switch();
            }
        }

    }
}
