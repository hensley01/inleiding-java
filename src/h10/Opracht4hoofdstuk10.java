package h10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opracht4hoofdstuk10 extends Applet {
    TextField tekstvakmaand;
    TextField tekstvakjaar;
    Label labelmaand;
    Label labeljaar;
    String s, tekst;
    int dag;
    int jaartal;

    public void init() {
        tekstvakmaand = new TextField("", 10);
        labelmaand = new Label(" maand");
        tekstvakmaand.addActionListener(new TekstvakListener());
        add(labelmaand);
        add(tekstvakmaand);
        tekst = "";
        tekstvakjaar = new TextField("", 10);
        labeljaar = new Label("Jaar");
        tekst = "";
        add(labeljaar);
        add(tekstvakjaar);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvakmaand.getText();
            jaartal = Integer.parseInt(s);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                tekst = "" + jaartal + " is een schrikkeljaar";
            } else {
                tekst = "" + jaartal + " is geen schrikkeljaar";
                dag = Integer.parseInt(s);
                switch (dag) {
                    case 1:
                        tekst = "Januari" + "aantal dagen: 31";
                        break;
                    case 2:
                        tekst = "Februari" + "aantal dagen: 28 ";
                        break;
                    case 3:
                        tekst = "Maart" + "aantal dagen: 31";
                        break;
                    case 4:
                        tekst = "April" + "aantal dagen: 30";
                        break;
                    case 5:
                        tekst = "Mei" + "aantal dagen: 31";
                        break;
                    case 6:
                        tekst = "Juni" + "aantal dagen: 30";
                        break;
                    case 7:
                        tekst = "Juli" + "aantal dagen: 31";
                        break;
                    case 8:
                        tekst = "Augustus" + "aantal dagen: 31";
                        break;
                    case 9:
                        tekst = "September" + "aantal dagen: 30";
                        break;
                    case 10:
                        tekst = "Oktober" + "aantal dagen: 31 ";
                        break;
                    case 11:
                        tekst = "November" + "aantal jaren: 30";
                        break;
                    case 12:
                        tekst = "December" + "aantal dagen: 31";
                        break;
                    default:
                        tekst = "U hebt een verkeerd nummer ingetikt!";
                        break;
                }
                repaint();
            }
        }
    }
}


