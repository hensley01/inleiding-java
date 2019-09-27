package h11;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk11Opdracht4 extends Applet {
    int teller = 0;
    int antwoord = 0;
    String tafelvandrie;
    int y;


    public void init() {
    }

    public void paint(Graphics g) {
        while (teller < 11) {
            y += 20;
            g.drawString("3 x " + (teller +" = " + antwoord), 305, y);
            teller++;
            antwoord = teller * 3;
        }
    }
}
