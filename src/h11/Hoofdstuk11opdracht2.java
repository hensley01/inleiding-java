package h11;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk11opdracht2 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int tellergetallen = 0;
        int y = 0;

            y += 20;
            g.drawLine(50,40, 220, 40);
            g.drawString("11,12,13,14,15,16,17,18,19,2" + tellergetallen, 50, 60);
            tellergetallen++;
        }
    }

