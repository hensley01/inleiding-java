package h06;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk6opdracht2 extends Applet {
    int teller1;
    int teller2;
    int teller3;
    int teller4;
    // GEGEVENS
    public void init() {
        teller1= 60;
        teller2 = 60;
        teller3 = 24;
        teller4 = 365;



    }

    public void paint(Graphics g) {
        // UITWERKINGEN
        g.drawString("seconden in één uur=" + teller1 * teller2, 20, 20);
        g.drawString("seconden in één dag=" + teller1 * teller2 * teller3, 20, 40);
        g.drawString("seconden in één jaar=" + teller1 * teller2 * teller3 * teller4, 20, 60);
    }
}