package flyweight;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Test2 extends JFrame {
    private final Timer timer;
    private final JPanel panel;
    private Border border;
    private final Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};
    private int colorIndex = 0;

    public static void main(String[] args) {
        Test2 test = new Test2();
        test.setBounds(20,20,250,150);
        test.setVisible(true);
    }

    public Test2() {
        super("Border flyweights");

        panel = new JPanel();
        JPanel panel2 = new JPanel();

        border = BorderFactory.createRaisedBevelBorder();
        Border border2 = BorderFactory.createRaisedBevelBorder();

        panel.setBorder(border);
        panel2.setBorder(border2);

        panel.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        contentPane.add(panel);
        contentPane.add(panel2);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                timer.stop(); // pysäytä timer kun ikkuna suljetaan
                System.exit(0);
            }
        });

        // luo timer, joka vaihtaa paneelin reunuksen väriä
        timer = new Timer(1000, e -> {
            // vaihda paneelin reunuksen väriä
            border = BorderFactory.createLineBorder(colors[colorIndex]);
            panel.setBorder(border);
            colorIndex = (colorIndex + 1) % colors.length;
        });
        timer.start(); // käynnistä timer

        if(border == border2)
            System.out.println("bevel borders are shared");
        else
            System.out.println("bevel borders are NOT shared");
    }
}
