package h04;

import java.applet.Applet;
import java.awt.*;

public class Tekenen8 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRoundRect(100, 100, 100, 100, 5, 5);
        g.setColor(Color.black);
        g.fillOval(120,117,20,20);
        g.setColor(Color.BLACK);
        g.fillOval(160, 117, 20, 20);
        g.setColor(Color.BLACK);
        g.fillOval(120, 147, 20, 20);
        g.setColor(Color.BLACK);
        g.fillOval(120, 177, 20, 20);
        g.setColor(Color.BLACK);
        g.fillOval(160, 147, 20, 20);
        g.setColor(Color.BLACK);
        g.fillOval(160, 177, 20, 20);
    }
}