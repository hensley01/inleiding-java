package h11;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk11opdracht8 extends Applet {


    public void init() {
        setSize(2000, 2000);

    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int width = 5;
        int height = 5;
        for (int i = 0; i < 100; i++) {
            g.drawOval(x, y, width, height);

            width += 5;
            height += 5;

        }

    }

}
