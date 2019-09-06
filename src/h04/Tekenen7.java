package h04;

import java.applet.Applet;
import java.awt.*;

public class Tekenen7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(100, 100, 60, 120);
        g.setColor(Color.RED);
        g.fillOval(123, 120, 18, 18);
        g.setColor(Color.GREEN);
        g.fillOval(123, 190, 18, 18);
        g.setColor(Color.YELLOW);
        g.fillOval(123, 155, 18, 18);
    }
}

