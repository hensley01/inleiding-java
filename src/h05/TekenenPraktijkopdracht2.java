package h05;
import java.applet.Applet;
import java.awt.*;

    public class TekenenPraktijkopdracht2 extends Applet {

        //DECLARATIE

        Color opvulkleur;
        Color lijnkleur;
        int breedte;
        int hoogte;
        int breedte2;
        int breedte3;


        public void init() {

            //VARIABELEN INITIALISEREN
            opvulkleur = Color.YELLOW;
            lijnkleur = Color.BLUE;
            breedte = 200;
            hoogte = 200;
            breedte2 = 200;
            breedte3 = 300;


        }

        public void paint(Graphics g) {
            g.setColor(opvulkleur);
            g.drawString("Lijn", 75, 52);
            g.drawLine(30, 30, 140, 30);

            g.drawRect(30, 60, 110, 50);
            g.drawString("Rechthoek", 50, 125);

            g.drawRoundRect(30,130,110,50,10,10);
            g.drawString("Afgeronde rechthoek", 35, 200);

            g.setColor(Color.MAGENTA);
            g.fillRect(270, 30, 100, 50);
            g.setColor(Color.BLACK);
            g.drawOval(270, 30, 100, 50);
            g.drawString("Gevulde rechthoek met ovaal", 240, 93);

            g.setColor(Color.MAGENTA);
            g.fillOval(270, 110, 100, 50);
            g.setColor(Color.BLACK);
            g.drawString("Gevulde ovaal", 280, 180);

            g.setColor(Color.MAGENTA);
            g.fillArc(275, 185, 80, 80, 0, 45);
            g.setColor(Color.BLACK);
            g.drawOval(275, 185, 80, 80);
            g.drawString("Taartpunt met ovaal er omheen", 220, 280);

            g.setColor(Color.black);
            g.drawOval(50, 215, 50, 50);
            g.drawString("Cirkel", 60, 280);

        }
    }

