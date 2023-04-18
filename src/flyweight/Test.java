package flyweight;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

// Tämä koodi luo yksinkertaisen Swing GUI:n kahdella paneelilla, joilla kummallakin on reunus, joka on luotu käyttämällä BorderFactory.createRaisedBevelBorder() -metodia.
// Koodi tarkistaa sitten, ovatko kaksi reunusoliota samoja (eli ovatko ne flyweights) ja tulostaa viestin, joka kertoo, ovatko ne jaettuja vai ei.
// Kun suoritat koodin, sinun pitäisi nähdä viesti "bevel borders are shared" tulostettuna konsoliin, mikä osoittaa, että BorderFactory on käyttänyt samaa Border-oliota molemmille paneeleille.

public class Test extends JFrame {
    public static void main(String[] args) {
        // Luodaan Test-olio
        Test test = new Test();
        // Asetetaan olion koko ja sijainti
        test.setBounds(20,19,250,205);
        // Tehdään olio näkyväksi
        test.setVisible(true);
    }

    public Test() {
// Kutsutaan JFramen konstruktoria ja annetaan sille otsikko
        super("Border flyweights");

        // Luodaan kaksi JPanel-oliota
        JPanel panel = new JPanel(), panel2 = new JPanel();

        // Luodaan kaksi Border-oliota käyttäen BorderFactory-luokan createRaisedBevelBorder-metodia
        Border border = BorderFactory.createRaisedBevelBorder();
        Border border2 = BorderFactory.createRaisedBevelBorder();


        // Asetetaan paneleille rajat
        panel.setBorder(border);
        panel2.setBorder(border2);

        // Asetetaan paneleille koko
        panel.setPreferredSize(new Dimension(50,100));
        panel2.setPreferredSize(new Dimension(100,50));

        // Haetaan Container-olio ja asetetaan sen layout FlowLayoutiksi
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        // Lisätään paneelit Container-olioon
        contentPane.add(panel);
        contentPane.add(panel2);

        // Asetetaan ikkunan sulkemisnapin toiminto
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // Lisätään WindowListener, joka sulkee ohjelman kun ikkuna suljetaan
        addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });

        // Vertaillaan paneelien reunoja ja tulostetaan viesti sen mukaan ovatko ne jaettuja vai eivät
        if(border == border2)
            System.out.println("bevel borders are shared");
        else
            System.out.println("bevel borders are NOT shared");
    }
}