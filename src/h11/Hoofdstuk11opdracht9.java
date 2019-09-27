package h11;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk11opdracht9 extends Applet {


    public void init() {
        setSize(300, 300);
    }

    public void paint(Graphics g) {
        int x = 20;
        int y = 20;
        int height = 20;
        int width = 20;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, width, height);
                g.drawRect(x, y, width, height);
                x += width;
            }

            //tweede rij
            x = 20;
            y += height;

            for (int kolomm = 0; kolomm < 8; kolomm++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, width, height);
                } else {
                    g.setColor(Color.BLACK);
                    g.fillRect(x, y, width, height);

                }
                x += width;

            }
        }
    }
}



