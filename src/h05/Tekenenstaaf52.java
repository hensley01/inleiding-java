package h05;

import java.applet.Applet;
import java.awt.*;

public class Tekenenstaaf52 extends Applet {

    public void init() {
        setBackground(Color.black);
    }


    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.drawString("Valery",60, 250);
        g.setColor(Color.GREEN);
        g.drawString("Jeroen", 100, 250);
        g.drawRect(60, 160, 40,40);
        g.setColor(Color.RED);
        g.drawRect(100, 100, 40, 100);
        g.setColor(Color.BLUE);
        g.drawString("Hans", 140, 250);
        g.drawRect(140,120,40,80);
        g.drawString("0-", 30, 203);
        g.drawString("20-",30, 183);
        g.drawString("40-", 30, 163);
        g.drawString("60-", 30, 143);
        g.drawString("80-", 30, 123);
        g.drawString("100-", 30, 103);


    }
}