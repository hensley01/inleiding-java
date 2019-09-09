package h04;

import java.applet.Applet;
import java.awt.*;

public class Tekenenstaafdiagram extends Applet {

    // VARIABELEN DECLAREREN
    int gewichtValerie;
    int hoogteXas;
    int gewichtJeroen;
    int gewichtHans;


    public void init() {

        //VARIABELEN INITIALISEREN
        setSize(300, 300);
        hoogteXas = 240;
        gewichtValerie = 90;
        gewichtJeroen = 200;
        gewichtHans = 160;

    }


        public void paint(Graphics g) {
    // DINGEN IN BEELD BRENGEN

            //Verticale as
g.drawLine(40, 40, 40, 240);
           // Horizontale as;
g.drawLine(40, 240, 250, 240);
// Schaalverdeling lijnen
            g.drawLine(40, 40, 250, 40);
            g.drawString("100kg", 5, 43);
            g.drawLine(40, 80, 250, 80 );
            g.drawString("80kg", 10, 83);
            g.drawLine(40, 120, 250, 120);
            g.drawString("60kg", 10, 123);
            g.drawLine(40, 160, 250, 160);
            g.drawString("40kg", 10, 163);
            g.drawLine(40, 200, 250, 200);
            g.drawString("20kg", 10, 203);
            g.drawLine(40, 240, 250, 240);
            g.drawString("0kg", 10, 243);

    // Tekenen van de Staven
            // 1.Valerie
            g.setColor(Color.red);
            g.fillRect(40, hoogteXas - gewichtValerie, 40, gewichtValerie);
            g.drawString("Valerie", 40, 265);
            // 2.Jeroen
            g.setColor(Color.BLUE);
            g.fillRect(80, hoogteXas - gewichtJeroen, 40, gewichtJeroen);
            g.drawString("Jeroen", 80, 265);
            // 3.Hans
            g.setColor(Color.BLACK);
            g.fillRect(120, hoogteXas - gewichtHans, 40, gewichtHans);
            g.drawString("Hans", 120, 265);
        }
}




