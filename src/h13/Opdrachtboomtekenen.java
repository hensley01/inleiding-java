package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdrachtboomtekenen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setSize(1000, 1000);
        tekenBoomcirkel(g);
        tekenBoomstam(g);
    }

    void tekenBoomcirkel(Graphics g) {
        int y = 40;
        int width = 40;
        int height = 60;
        for (int i = 0; i < 6; i++) {
            int x = 40;
            for (int j = 0; j < 10; j++) {
                g.setColor(Color.GREEN);
                g.fillOval(x, y, width, height);
                x += 100;
            }
            y += 100;
        }
    }

    void tekenBoomstam(Graphics g) {
        int y = 100;
        int width = 15;
        int height = 30;
        for (int i = 0; i < 6; i++) {
            int x = 53;
            for (int j = 0; j < 10; j++) {
                g.setColor(Color.ORANGE);
                g.fillRect(x, y, width, height);
                x += 100;
            }
            y += 100;
        }
    }
}

