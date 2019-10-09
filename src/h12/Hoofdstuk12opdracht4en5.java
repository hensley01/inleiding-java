package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk12opdracht4en5 extends Applet {
    TextField tekstvak;
    Button knopzoeken;
    String s;
    int[] waardes = {5, 8, 7, 14, 25, 88, 44, 32, 43, 17};
    boolean isGevonden;
    int index;

    public void init() {

        tekstvak = new TextField();
        add(tekstvak);


        knopzoeken = new Button();
        Knopzoekenlistener aa = new Knopzoekenlistener();
        knopzoeken.addActionListener(aa);
        add(knopzoeken);


    }

    public void paint(Graphics g) {

        if (isGevonden) {
            g.drawString("Het getal is gevonden op index nr: " + index, 50, 70);
        } else {
            g.drawString("Het getal is niet gevonden ", 50, 70);
        }

    }

    class Knopzoekenlistener implements ActionListener {

        //Alle getallen uit de tekstvakken in de Array stoppen
        public void actionPerformed(ActionEvent e) {
            isGevonden = false;
            String s = tekstvak.getText();
            int input = Integer.parseInt(s);
            for (int i = 0; i <waardes.length; i++) {
                int j = waardes[i];
                if (j == input) {
                    isGevonden = true;
                    index = i;
                    break;
                }
            }
            repaint();



        }
    }
}
