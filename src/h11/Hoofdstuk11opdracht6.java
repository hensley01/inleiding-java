package h11;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk11opdracht6 extends Applet {


    public void init() {
        setSize(300, 300);
    }

    //GEGEVENS
    public void paint(Graphics g) {
        int x = 150;
        int y = 150;
        int width = 10;
        int height = 10;
        for (int i = 0; i < 5; i++) {
            g.drawOval(x, y, width, height);
            x -= 5;
            y -= 5;
            width += 10;
            height += 10;

        }
    }
}

