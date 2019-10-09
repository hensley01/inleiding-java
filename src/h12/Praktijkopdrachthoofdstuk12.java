package h12;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdrachthoofdstuk12 extends Applet {
    String[] namen;
    String[] telnummers;
    Button knopOK;
    Label labelnaam;
    Label labeltelnr;
    TextField tekstvaknaam;
    TextField tekstvaktelnr;
    int index;


    public void init() {
        namen = new String[10];
        telnummers = new String[10];
        labelnaam = new Label("Naam");
        add(labelnaam);
        tekstvaknaam = new TextField(10);
        add(tekstvaknaam);
        labeltelnr = new Label("telelefoon nummer");
        add(labeltelnr);
        tekstvaktelnr = new TextField(10);
        add(tekstvaktelnr);
        knopOK = new Button("OK");
        KnopOKpraktijkopdrachtlistener cc = new KnopOKpraktijkopdrachtlistener();
        knopOK.addActionListener(cc);
        add(knopOK);

    }

    public void paint(Graphics g) {
        int x = 50;
        int x2 = 100;
        int y = 120;

        if (index == 10) {
            for (int i = 0; i < namen.length; i++) {
                g.drawString(namen[i], x, y);
                g.drawString(telnummers[i], x2, y);
                y += 20;
            }


        }

    }

    class KnopOKpraktijkopdrachtlistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = tekstvaknaam.getText();
            namen[index] = s;
            String d = tekstvaktelnr.getText();
            telnummers[index] = d;
            index++;

            if (index ==10) {
                repaint(); 
            }
        }
    }
}