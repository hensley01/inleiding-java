package h06;

import java.applet.Applet;
import java.awt.*;


public class Hoofdstuk6opdracht1 extends Applet {
    int a;
    int b;
    int uitkomst;

    public void init() {
        a = 113;
        b = 4;
        uitkomst = (a / b);
    }

    public void paint(Graphics g) {
        g.drawString("Jan=" + uitkomst, 20, 20);
        g.drawString("Ali=" + uitkomst, 20, 40);
        g.drawString("Jeannette=" + uitkomst, 20, 60);
        g.drawString("Hensley=" + uitkomst, 20, 80);


    }
}