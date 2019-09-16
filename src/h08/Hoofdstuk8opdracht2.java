package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk8opdracht2 extends Applet {

    //GLOBAAL
    Button manButton;
    Button vrouwButton;
    Button jongenButton;
    Button meisjeButton;
    int mannen;
    int vrouwen;
    int jongens;
    int meisjes;
    int totaal;

    public void init() {
        manButton = new Button("Mannen");
        manButton.addActionListener(new MannenListener());
        add(manButton);
        vrouwButton = new Button("Vrouwen");
        vrouwButton.addActionListener(new VrouwenListener());
        add(vrouwButton);
        jongenButton = new Button("Jongens");
        jongenButton.addActionListener(new JongensListener());
        add(jongenButton);
        meisjeButton = new Button("Meisjes");
        meisjeButton.addActionListener(new MeisjesListener());
        add(meisjeButton);
    }

    public void paint(Graphics g) {

        totaal = mannen + vrouwen + jongens + meisjes;
        g.drawString("Aantal mannen: " + mannen, 20, 70);
        g.drawString("Aantal vrouwen: " + vrouwen, 20, 100);
        g.drawString("Aantal meisjes: " + meisjes, 20, 130);
        g.drawString("Aantal jongens: " + jongens, 20, 160);
        g.drawString("Totaal: " + totaal, 20, 200);

    }

    class MannenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannen++;
            repaint();
        }
    }

    class VrouwenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwen++;
            repaint();
        }
    }

    class JongensListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jongens++;
            repaint();
        }
    }

    class MeisjesListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            meisjes++;
            repaint();

        }
    }
}