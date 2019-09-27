package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk11praktijkopdracht2 extends Applet {
    Button knopOK;
    int tafel;


    public void init() {
        knopOK = new Button();
        knopOK.setLabel("OK");
        knopOKlistener bb = new knopOKlistener();
        knopOK.addActionListener(bb);
        add(knopOK);

    }

    public void paint(Graphics g) {
        int times = 1;
        int y = 20;
        for (int i = 0; i < 10; i++) {
            g.drawString("" + times + " x " + tafel + " = " + (times * tafel), 50, y);
            times++;
            y += 20;
        }
    }

    class knopOKlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafel++;
            repaint();
        }
    }
}