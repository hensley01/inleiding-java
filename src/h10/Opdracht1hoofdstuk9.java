package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1hoofdstuk9 extends Applet {

    TextField tekstvak;
    boolean firstNumber;
    int maxinput;
    int mininput;
    int userinput;

    public void init() {
        tekstvak = new TextField(20);
        tekstvak.addActionListener(new TekstListener());
        add(tekstvak);
        mininput = 0;
        maxinput = 0;
        firstNumber = true;
    }

    public void paint(Graphics g) {
        g.drawString("Max input" + maxinput, 40 ,50);
        g.drawString("Min input" + mininput, 40, 100);
    }

    class TekstListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            userinput = Integer.parseInt(s);
            if (firstNumber) {
                maxinput = userinput;
                mininput = userinput;
                firstNumber = false;
                repaint();
            } else {

                if (userinput > maxinput) {
                    maxinput = userinput;
                }
                else if (userinput < mininput) {
                    mininput = userinput;
                }

                repaint();
            }
        }
    }
}

