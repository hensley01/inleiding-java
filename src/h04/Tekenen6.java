package h04;

import java.applet.Applet;
import java.awt.*;

public class Tekenen6 extends Applet {

    public void init() {
        setBackground(Color.BLUE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillArc(20, 20, 100, 50, 90, 45);
        g.drawOval(20, 20, 100, 50);
        g.fillOval(20, 80, 100, 50);

    }

}
