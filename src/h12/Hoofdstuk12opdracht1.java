package h12;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk12opdracht1 extends Applet {
    double belastbaarinkomen[];
    double tellerkeer;


    public void init() {
        belastbaarinkomen = new double[10];
        for (int teller = 0; teller < belastbaarinkomen.length; teller++) {
            belastbaarinkomen[teller] = 100 * teller + 100;
        }

    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 20;
        for (int teller = 0; teller < belastbaarinkomen.length; teller++) {
            g.drawString("" + belastbaarinkomen[teller], x, y);
            y += 20;
        }
        int totaal = 0;

        for (int i = 0; i < belastbaarinkomen.length; i++) {
            totaal += belastbaarinkomen[i];
        }
        g.drawString("Gemiddelde: " + (totaal / belastbaarinkomen.length), x, y);
    }
}
