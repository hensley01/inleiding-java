package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class praktijkopdrachthoofdstuk10  extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int cijfer;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("ingevoerde cijfer");
        tekstvak.addActionListener(new Cijferlistener());
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }

    class Cijferlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            switch (cijfer) {
                case 1:
                    tekst = "1 Slecht";
                    break;
                case 2:
                    tekst = "2 Slecht ";
                    break;
                case 3:
                    tekst = "3 Slecht";
                    break;
                case 4:
                    tekst = "4 Slecht";
                    break;
                case 5:
                    tekst = "5 Matig";
                    break;
                case 6:
                    tekst = "6 Voldoende";
                    break;
                case 7:
                    tekst = "7 Voldoende";
                    break;
                case 8:
                    tekst = "8 GOed";
                    break;
                case 9:
                    tekst = "9 Goed";
                    break;
                case 10:
                    tekst = "10 Goed";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt!";
                    break;

            }
            repaint();
        }
    }
}