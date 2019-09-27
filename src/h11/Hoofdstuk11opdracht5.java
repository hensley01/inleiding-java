package h11;

import java.applet.Applet;
import java.awt.*;

public class Hoofdstuk11opdracht5 extends Applet {


   //GEGEVENS
    public void init() {
        setSize(500, 500);
    }


    //UITWERKINGEN
    public void paint(Graphics g) {
        int x = 20;
        int y = 20;
        int width = 50;
        int height = 50;

        for (int i = 0; 1 < 5; i++) {
            for (int j = 0; j < 5; j++) {
                g.drawRect(x, y, width, height);
               x += width;
               y += height;




            }
        }
    }
}
