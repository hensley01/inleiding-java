package h11;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk11opdracht7 extends Applet {


    public void init() {
        setSize(1000, 1000);

    }

    public void paint(Graphics g) {
        int x = 500;
        int y = 250;
        int width = 10;
        int height = 10;
        for (int i = 0; i < 50; i++) {
            g.drawOval(x, y, width, height);
            x -= 5;
            y -= 5;
            width += 10;
            height += 10;
        }
    }
}
