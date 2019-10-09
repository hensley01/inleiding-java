package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht6hoofdstuk12 extends Applet {
    TextField tekstvak;
    Button knopOK;
    int[] waardes = {1, 3, 4, 6, 7, 7, 8, 9, 4, 1};
    int aantal;
    int input;

    public void init() {
        tekstvak = new TextField(20);
        add(tekstvak);
        knopOK = new Button("OK");
        KnopOKlistener aa = new KnopOKlistener();
        knopOK.addActionListener(aa);
        add(knopOK);
        aantal = 0;
    }


    public void paint(Graphics g) {
        g.drawString("De waarde: " +  input + " komt " + aantal + " keer voor", 20, 50);
    }

    class KnopOKlistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            input = Integer.parseInt(s);
            for (int i = 0; i < waardes.length; i++) {
                int h = waardes[i];
                if (h == input) {
                    aantal++;
                }

            }
            repaint();
        }
    }
}