package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Hoofdstuk8opdracht3 extends Applet {
    Button knopOK;
    TextField tekstvak;
    Label label;
    double totaal;
    double bedrag;
    double BTW;

    public void init() {
        //GEGEVENS
        tekstvak = new TextField(20);
        add(tekstvak);
        knopOK = new Button("OK");
        knopOK.addActionListener(new Hoofdstuk8opdracht3.TekstListener());
        add(knopOK);
        add(knopOK);
        label = new Label("Bedrag inclusief BTW");
        add(label);


    }

    public void paint(Graphics g) {
        g.drawString("Bedrag inclusief 21% BTW: "+ totaal,50, 50);





    }

    class TekstListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();

            bedrag = Double.parseDouble(s);
            totaal = bedrag * 1.21;
            repaint();
        }
    }
}

