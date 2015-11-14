import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Tabs extends JPanel{public Tabs() {
        JTabbedPane tabbedpane = new JTabbedPane();


        JFrame jfr = new JFrame("Hello");
        JLabel label1 = new JLabel("One");
        JLabel label2 = new JLabel("Two");
        JButton button1 = new JButton("one");
        JButton button2 = new JButton("two");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.add(label1);
        panel1.add(button1);
        panel2.add(label2);
        panel2.add(button2);

        tabbedpane.addTab("One", panel1);
        tabbedpane.setTabComponentAt(0, new JLabel("One"));
        tabbedpane.addTab("Two", panel1);
        tabbedpane.setTabComponentAt(1, new JLabel("Two"));

        add(tabbedpane);
        setPreferredSize(new Dimension(796, 566));
        setLayout(null);


    }

    public static void main(String args[]) {
        JFrame f = new JFrame("Got JTabbedPane?");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new Tabs());
        f.pack();
        f.setVisible(true);

    }
}