import javax.swing.*;
import java.awt.*;


public class Gui extends JPanel {

    private JMenuBar jcomp1;

    public Gui() {
        //construct components
        JTabbedPane tabs = new JTabbedPane();

        //construct preComponents
        JMenu fileMenu = new JMenu ("File");
        JMenuItem printItem = new JMenuItem ("Print");
        fileMenu.add (printItem);
        JMenuItem exitItem = new JMenuItem ("Exit");
        fileMenu.add (exitItem);
        JMenu helpMenu = new JMenu ("Help");
        JMenuItem contentsItem = new JMenuItem ("Contents");
        helpMenu.add(contentsItem);
        JMenuItem aboutItem = new JMenuItem ("About");
        helpMenu.add(aboutItem);


        JPanel Panel1 = new JPanel();
        JPanel Panel2 = new JPanel();
        Panel1.setBounds(50, 50, 50, 50);
        Panel2.setBounds(100, 100, 100, 100);

        Panel1.setBackground(Color.black);
        Panel2.setBackground(Color.blue);


        tabs.addTab("One", new fill_Blanks_Tab());
        tabs.addTab("Essay", new Essays());


        //construct components
        jcomp1 = new JMenuBar();
        jcomp1.add(fileMenu);
        jcomp1.add(helpMenu);

        jcomp1.setBounds(0, 0, 800, 20);
        tabs.setBounds(0, 20, 800, 600);

        add(jcomp1);
        add(tabs);

        //   add(Panel1);
        //   add (Panel2);

        //adjust size and set layout
        setPreferredSize (new Dimension (800, 600));
        setLayout (null);

        //set component bounds (only needed by Absolute Positioning)
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Gui());
        frame.pack();
        frame.setVisible (true);
    }
}
