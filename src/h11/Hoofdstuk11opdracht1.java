package h11;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk11opdracht1 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int x = 0;

        for (teller = 0; teller < 10; teller++) {
            x += 20;
            g.drawLine(x , 50, x, 280);
            g.drawString("" + teller, x, 300);

        }
    }
}
