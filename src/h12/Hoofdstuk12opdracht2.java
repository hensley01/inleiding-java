package h12;
import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk12opdracht2 extends Applet {

    Button[] knoppenzonderfunctie;


    public void init() {

        knoppenzonderfunctie = new Button[25];

        for (int i = 0; i < knoppenzonderfunctie.length; i++) {
            knoppenzonderfunctie[i] = new Button();
            add(knoppenzonderfunctie[i]);

        }



        }

    public void paint(Graphics g) {



    }
}
