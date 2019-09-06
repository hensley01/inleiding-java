package h04;


import java.applet.Applet;
import java.awt.*;

public class Tekenen4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.yellow);
        g.drawRect(40, 100, 80, 100);

        g.setColor(Color.red);
        g.drawLine(40, 100, 80, 50);
        g.drawLine(80, 50, 120, 100);

        g.drawRect(60, 160, 20, 40);
        g.drawRect(100, 120, 10, 20);



    }
}