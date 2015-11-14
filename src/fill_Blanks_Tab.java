/**
 * Created by Aonghus on 14/11/2015.
 */
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fill_Blanks_Tab  extends JPanel
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Fill Blanks");
       //frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new fill_Blanks_Tab());
        frame.pack();
        //frame.setLocation(300, 300);
        frame.setVisible(true);
    }

    public fill_Blanks_Tab()
    {
        /*Fill_Blanks panel creation*/
       //JPanel panel = new JPanel();
        setPreferredSize(new Dimension(800,600));
        setLayout(null);
        setBorder(BorderFactory.createTitledBorder("Fill Blanks"));

        setLayout(new MigLayout("debug", "[]10[] ","[] [] [] [] [] []"));

        /* Label definitions*/
        JLabel Question_Title = new JLabel("Queston title:");
        JLabel Question_Start = new JLabel("Queston start:");
        JLabel Blanks = new JLabel("Blanks:");
        JLabel Question_End = new JLabel("Queston End:");
        JLabel Gift_Output = new JLabel("Gift Output:");

        /*panel component creation*/
        JTextField Question_Title_Text = new JTextField(20);
        JTextField Question_Start_Text = new JTextField(20);
        JTextField Blanks_Text = new JTextField(20);
        JButton Remove_Blank = new JButton("Remove Blank");
        JButton Add_Blank = new JButton("Add Blank");
        JButton Clear_Question_Text = new JButton("Clear Question");
        JButton Create_Gift_Code = new JButton("Create Gift Code");
        JButton Clear_Gift_List = new JButton("Clear Gift List");

        JTextField Question_End_Text = new JTextField(20);
        JTextField Gift_Output_Text = new JTextField(20);



        /*panel additions*/
        add(Question_Title, "left, sg 1,split 2");
        add(Question_Title_Text, "pushx,growx,wrap");

        add(Question_Start, "left, sg 1,split 2");
        add(Question_Start_Text, "pushx,growx,wrap");

        add(Blanks, "left,sg 1,split 2");
        add(Blanks_Text, "pushx,growx,wrap");
        add(Remove_Blank, "right,sg 1,split 2");
        add(Add_Blank, "span");


        add(Question_End, "right,sg 1,split 2");
        add(Question_End_Text, "pushx,growx,wrap");
        //panel.add(Clear_Question_Text);
        // panel.add(Create_Gift_Code);

        add(Gift_Output, "left, sg 1,split 2");
        add(Gift_Output_Text, "pushx,growx,wrap");

        /*Creation of the button action listeners*/
        Remove_Blank.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Add_Blank.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Clear_Question_Text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Create_Gift_Code.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Clear_Gift_List.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}

