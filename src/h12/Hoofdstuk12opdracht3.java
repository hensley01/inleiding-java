package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Hoofdstuk12opdracht3 extends Applet {
    TextField[] tekstvakken;
    Button knopOK;

    public void init() {

        tekstvakken = new TextField[5];
        for (int i = 0; i < tekstvakken.length; i++) {
            tekstvakken[i] = new TextField();
            add(tekstvakken[i]);

        }
        knopOK = new Button("Ok");
        KnopOklistener kl = new KnopOklistener();
        knopOK.addActionListener(kl);
        add(knopOK);
    }


    public void paint(Graphics g) {
    }


    class KnopOklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            //Alle getallen uit de tekstvakken in de Array stoppen


            int[] waardes = new int[5];
            for (int i = 0; i < waardes.length; i++) {
                waardes[i] = Integer.parseInt(tekstvakken[i].getText());
                repaint();


            }
            Arrays.sort(waardes);

            // Array sorteren

            for (int i = 0; i < waardes.length; i++) {
                int waarde = waardes[i];
                tekstvakken[i].setText("" + waarde);

            }
        }
    }
}

