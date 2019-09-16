package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdrachthoofdstuk8 extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Button knopkeer;
    Button knopdelen;
    Button knopplus;
    Button knopmin;
    double getal;
    double vak1;
    double vak2;

    public void init() {
        tekstvak1 = new TextField(10);
        add(tekstvak1);
        tekstvak2 = new TextField(10);
        add(tekstvak2);
        knopdelen = new Button("/");
        knopdelenListener kk = new knopdelenListener();
        knopdelen.addActionListener(kk);
        add(knopdelen);
        knopkeer = new Button("*");
        knopkeerListener aa = new knopkeerListener();
        knopkeer.addActionListener(aa);
        add(knopkeer);
        knopplus = new Button("+");
        knopplus3Listener bb = new knopplus3Listener();
        knopplus.addActionListener(bb);
        add(knopplus);
        knopmin = new Button("-");
        knopmin4Listener cc = new knopmin4Listener();
        knopmin.addActionListener(cc);
        add(knopmin);

    }


    public void paint(Graphics g) {

    }

    class knopkeerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double vak1 = Double.parseDouble(tekstvak1.getText());
            double vak2 = Double.parseDouble(tekstvak2.getText());
            getal = (vak1 * vak2);
            tekstvak1.setText("");
            tekstvak2.setText("" + getal);

        }
    }

    class knopdelenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double vak1 = Double.parseDouble(tekstvak1.getText());
            double vak2 = Double.parseDouble(tekstvak2.getText());
            getal = (vak1 / vak2);
            tekstvak1.setText("");
            tekstvak2.setText("" + getal);
            repaint();
        }
    }

    class knopplus3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double vak1 = Double.parseDouble(tekstvak1.getText());
            double vak2 = Double.parseDouble(tekstvak2.getText());
            getal = (vak1 + vak2);
            tekstvak1.setText("");
            tekstvak2.setText("" + getal);
        }
    }

    class knopmin4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double vak1 = Double.parseDouble(tekstvak1.getText());
            double vak2 = Double.parseDouble(tekstvak2.getText());
            getal = (vak1 - vak2);
            tekstvak1.setText("");
            tekstvak2.setText("" + getal);
        }
    }
}

