import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;
import java.awt.*;

//Preperation for megring first tabs

public class Gui extends JPanel {

    private static String essay = "Essay";
    private static String truefalse = "True/False";
    private static String mcb = "Multple Choice Basic";
    private static String mca = "Multple Choice Advance";
    private static String numerical = "Numerical";
    private static String matching = "Matching";
    private static String fillblanks = "Fill Blanks";
    String test;


    private JMenuBar jcomp1;

    public Gui() {
        //construct components
       setPreferredSize (new Dimension (2000, 2000));
      //  setLayout (null);
        JTabbedPane tabs = new JTabbedPane();

        setLayout(new MigLayout());

        //construct preComponents of File menu
        JMenu fileMenu = new JMenu ("File");
        JMenuItem q1 = new JMenuItem (essay);
        JMenuItem q2 = new JMenuItem (truefalse);
        JMenuItem q3 = new JMenuItem (mcb);
        JMenuItem q4 = new JMenuItem (mca);
        JMenuItem q5 = new JMenuItem (numerical);
        JMenuItem q6 = new JMenuItem (matching);
        JMenuItem q7 = new JMenuItem (fillblanks);


        q1.addMenuKeyListener(new MenuKeyListener() {
            @Override
            public void menuKeyTyped(MenuKeyEvent e) {

            }

            @Override
            public void menuKeyPressed(MenuKeyEvent e) {

            }

            @Override
            public void menuKeyReleased(MenuKeyEvent e) {

            }
        });

        //Adding components into File Menu
        fileMenu.add (q1);
        fileMenu.add (q2);
        fileMenu.add (q3);
        fileMenu.add (q4);
        fileMenu.add (q5);
        fileMenu.add (q6);
        fileMenu.add (q7);

        //Creating Tabs for files
        JPanel Tab1 = new JPanel();
        JPanel Tab2 = new JPanel();
        JPanel Tab3 = new JPanel();
        JPanel Tab4 = new JPanel();
        JPanel Tab5 = new JPanel();
        JPanel Tab6 = new JPanel();
        JPanel Tab7 = new JPanel();
        //Setting test collors code
        Tab1.setBackground(Color.black);
        Tab2.setBackground(Color.blue);
        Tab3.setBackground(Color.yellow);
        Tab4.setBackground(Color.CYAN);
        Tab5.setBackground(Color.red);
        Tab6.setBackground(Color.green);
        Tab7.setBackground(Color.pink);


     //   tabs.addTab(essay, new fill_Blanks_Tab());
        tabs.addTab(essay,new Essays());
        tabs.addTab(truefalse, new true_false());
        tabs.addTab(mcb, new multiple_choice_basic());
        tabs.addTab(mca, new Multiple_Choice_Advanced());
        tabs.addTab(numerical, new Numerical());
        tabs.addTab(matching, new matching_tab());
        tabs.addTab(fillblanks, new fill_Blanks_Tab());

        //construct components
        jcomp1 = new JMenuBar();
        jcomp1.add(fileMenu);

        add(jcomp1," grow,wrap");
        add(tabs,"grow,push");
    }


    public static void main (String[] args) {

        JFrame frame = new JFrame ("MyPanel");
        frame.setLayout(new MigLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Gui(), "span");
        frame.setPreferredSize(new Dimension(800,700));
        frame.pack();
        frame.setVisible (true);
    }
}
