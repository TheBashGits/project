import javax.swing.*;
import java.awt.*;


public class Gui extends JPanel {

    private static String essay = "Essay";
    private static String truefalse = "True/False";
    private static String mcb = "Multple Choice Basic";
    private static String mca = "Multple Choice Advance";
    private static String numerical = "Numerical";
    private static String matching = "Matching";
    private static String fillblanks = "Fill Blanks";


    private JMenuBar jcomp1;

    public Gui() {
        //construct components
        JTabbedPane tabs = new JTabbedPane();


        //construct preComponents
        JMenu fileMenu = new JMenu ("File");
        JMenuItem q1 = new JMenuItem ("Print");
        JMenuItem q2 = new JMenuItem ("Print");
        JMenuItem q3 = new JMenuItem ("Print");
        JMenuItem q4 = new JMenuItem ("Print");
        JMenuItem q5 = new JMenuItem ("Print");
        JMenuItem q6 = new JMenuItem ("Print");
        JMenuItem q7 = new JMenuItem ("Print");
        fileMenu.add (q1);
        fileMenu.add (q2);
        fileMenu.add (q3);
        fileMenu.add (q4);
        fileMenu.add (q5);
        fileMenu.add (q6);
        fileMenu.add (q7);



        JPanel Panel1 = new JPanel();
        JPanel Panel2 = new JPanel();
        Panel1.setBounds(50, 50, 50, 50);
        Panel2.setBounds(100, 100, 100, 100);

        Panel1.setBackground(Color.black);
        Panel2.setBackground(Color.blue);


        tabs.addTab("One", new fill_Blanks_Tab());
        tabs.addTab("Two", Panel2);


        //construct components
        jcomp1 = new JMenuBar();
        jcomp1.add(fileMenu);
     //   jcomp1.add(helpMenu);

        jcomp1.setBounds(0, 0, 800, 20);
        tabs.setBounds(0, 20, 800, 600);

        add(jcomp1);
        add(new fill_Blanks_Tab());
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
