package h04;

import java.applet.Applet;
import java.awt.*;

public class Tekenen3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
    setBackground(Color.BLACK);
    g.setColor(Color.RED);
    g.fillRect(30, 70, 150, 30);
    g.setColor(Color.WHITE);
    g.fillRect(30, 100, 150, 30);
    g.setColor(Color.BLUE);
    g.fillRect(30, 130, 150, 30);
    g.setColor(Color.yellow);
    g.fillRect(30, 130, 55, 60);



    }
}
