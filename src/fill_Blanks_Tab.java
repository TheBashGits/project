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
    int press_Cnt = 0;
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

        setLayout(new MigLayout("debug", "[]10[] ","[] [] [] [] [] [] [] [] []"));

        /* Label definitions*/
        JLabel Question_Title = new JLabel("Queston title:");
        JLabel Question_Start = new JLabel("Queston start:");
        JLabel Blanks = new JLabel("Blanks:");
        JPanel Blank_panel = new JPanel();
        JLabel Question_End = new JLabel("Queston End:");
        JLabel Gift_Output = new JLabel("Gift Output:");

        /*panel component creation*/
        JTextField Question_Title_Text = new JTextField(20);
        JTextField Question_Start_Text = new JTextField(20);
        JTextField Blanks_Choice_0 = new JTextField(20);
        JTextField Blanks_Choice_1 = new JTextField(20);
        JTextField Blanks_Choice_2 = new JTextField(20);
        JTextField Blanks_Choice_3 = new JTextField(20);
        JRadioButton Choice_0_correct = new JRadioButton("Correct");
        JRadioButton Choice_1_correct = new JRadioButton("Correct");
        JRadioButton Choice_2_correct = new JRadioButton("Correct");
        JRadioButton Choice_3_correct = new JRadioButton("Correct");
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
        Blank_panel.setPreferredSize(new Dimension(0,200));
        Blank_panel.setBorder(BorderFactory.createTitledBorder("Choice"));
        Blank_panel.setLayout(new MigLayout("debug", "[] [] ","[] [] [] []"));

        Blank_panel.add(Blanks_Choice_0, "cell 0 0, sg 1,split 2");
        Blank_panel.add(Choice_0_correct, "cell 1 0,pushx,growx,wrap");
        Blank_panel.add(Blanks_Choice_1, "cell 0 2, sg 1,split 2");
        Blank_panel.add(Choice_1_correct, "cell 1 2,pushx,growx,wrap");
        Blank_panel.add(Blanks_Choice_2, "cell 0 3, sg 1,split 2");
        Blank_panel.add(Choice_2_correct, "cell 0 3,pushx,growx,wrap");
        Blank_panel.add(Blanks_Choice_3, "cell 0 4, sg 1,split 2");
        Blank_panel.add(Choice_3_correct, "cell 1 4,pushx,growx,wrap");
        Blanks_Choice_0.setVisible(false);
        Choice_0_correct.setVisible(false);
        Blanks_Choice_1.setVisible(false);
        Choice_1_correct.setVisible(false);
        Blanks_Choice_2.setVisible(false);
        Choice_2_correct.setVisible(false);
        Blanks_Choice_3.setVisible(false);
        Choice_3_correct.setVisible(false);

        add(Blank_panel,"pushx,growx,wrap");
        add(Remove_Blank, "right,sg 1,split 2");
        add(Add_Blank);


        add(Question_End, "cell 0 4,sg 1,split 2");
        add(Question_End_Text, "pushx,growx,wrap");

        add(Clear_Question_Text,"right,sg 1,wrap");
        add(Create_Gift_Code,"right,sg 1");

        add(Gift_Output, "cell 0 8, sg 1,split 2");
        add(Gift_Output_Text, "pushx,growx,wrap");

        /*Creation of the button action listeners*/
        Remove_Blank.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(press_Cnt == 0) {
                    Blanks_Choice_0.setVisible(false);
                    Choice_0_correct.setVisible(false);
                   // press_Cnt--;
                }else if(press_Cnt == 1)
                {
                    Blanks_Choice_1.setVisible(false);
                    Choice_1_correct.setVisible(false);
                    press_Cnt--;
                    Blank_panel.repaint();
                }else if(press_Cnt == 2)
                {
                    Blanks_Choice_2.setVisible(false);
                    Choice_2_correct.setVisible(false);
                    press_Cnt--;
                    Blank_panel.repaint();
                }else if(press_Cnt == 3)
                {
                    Blanks_Choice_3.setVisible(false);
                    Choice_3_correct.setVisible(false);
                    press_Cnt--;
                    Blank_panel.repaint();
                }


            }
        });
        Add_Blank.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                if(press_Cnt == 0) {
//                    Blank_panel.add(Blanks_Choice_0, "cell 0 0, sg 1,split 2");
//                    Blank_panel.add(Choice_0_correct, "cell 1 0,pushx,growx,wrap");
                    Blanks_Choice_0.setVisible(true);
                    Choice_0_correct.setVisible(true);
                    press_Cnt++;
                }else if(press_Cnt == 1)
                {
//                    Blank_panel.add(Blanks_Choice_1, "cell 1 2, sg 1,split 2");
//                    Blank_panel.add(Choice_1_correct, "cell 1 2,pushx,growx,wrap");
                    Blanks_Choice_0.setVisible(true);
                    Choice_0_correct.setVisible(true);
                    press_Cnt++;
                    Blank_panel.repaint();
                }else if(press_Cnt == 2)
                {
//                    Blank_panel.add(Blanks_Choice_2, "cell 0 3, sg 1,split 2");
//                    Blank_panel.add(Choice_2_correct, "cell 0 3,pushx,growx,wrap");
                    Blanks_Choice_0.setVisible(true);
                    Choice_0_correct.setVisible(true);
                    press_Cnt++;
                    Blank_panel.repaint();
                }else if(press_Cnt == 3)
                {
//                    Blank_panel.add(Blanks_Choice_3, "cell 0 4, sg 1,split 2");
//                    Blank_panel.add(Choice_3_correct, "cell 1 4,pushx,growx,wrap");
                    Blanks_Choice_0.setVisible(true);
                    Choice_0_correct.setVisible(true);
                    //press_Cnt++;
                    Blank_panel.repaint();
                }

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

