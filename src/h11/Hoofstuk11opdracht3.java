package h11;

import java.applet.Applet;
import java.awt.*;

public class Hoofstuk11opdracht3 extends Applet {
   int a;
   int b;
   int c;


    public void init() {
        setSize(500, 500);
        a = 0;
        b = 1;
        c = a + b;

    }

    public void paint(Graphics g) {
        int x = 10;
        int y = 20;

        for (int i = 0; i < 15; i++) {
            g.drawString("" + c, x, y);
            x += 50;
            a = b;
            b = c;
            c = a + b;
        }
    }
}
