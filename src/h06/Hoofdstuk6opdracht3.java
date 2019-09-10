package h06;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk6opdracht3 extends Applet {

    int teller1;
    int teller2;
    int uitkomst;

    public void init() {
        //GEGEVENS
        teller1 = 2147483647;
        teller2 = 1;
        uitkomst = teller1 + teller2;
    }

    public void paint(Graphics g) {
        //UITWERKING
        g.drawString("positief + positief =" + uitkomst, 20, 100);

    }
}
