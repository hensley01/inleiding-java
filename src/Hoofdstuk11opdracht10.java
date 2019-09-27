package h11;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk11opdracht10 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
       int x = 20;
       int y = 20;
        int width = 20;
        int height = 20;
        for (int j = 0; j < 4 ; j++) {
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, width, height);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, width, height);
                }
                x +=width;
            }

            //tweede rij
            x = 20;
            y += height;
            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, width, height);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, width, height);
                }
                x += width;
            }
            x = 20;
            y += height;
        }
    }
}
