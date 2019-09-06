package h04;

import java.applet.Applet;
import java.awt.*;

public class Tekenen1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.YELLOW);
        g.setColor(Color.BLACK);
        g.drawLine(100, 200, 175, 100);
        g.drawLine(100, 200,  250, 200);
        g.drawLine(250, 200, 175, 100);

    }
}

