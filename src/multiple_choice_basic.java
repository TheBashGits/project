import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aonghus on 22/11/2015.
 */


public class multiple_choice_basic  extends JPanel
{
    int press_Cnt = 0;
    String gift_code_output;
    String blank1 = "";
    String blank2 = "";
    String blank3 = "";
    String blank4 = "";
    String blank5 = "";
    String blank6 = "";
    String blank7 = "";
    String blank8 = "";
    String blank9 = "";
    String blank10 = "";
    String blank11 = "";
    String blank12 = "";
    String blank13 = "";
    String blank14 = "";

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("multiple_choice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new multiple_choice_basic());
        frame.pack();
        frame.setVisible(true);
    }

    public multiple_choice_basic()
    {
        /*Matching panel creation*/
        setPreferredSize(new Dimension(800,600));
        setLayout(null);
        setBorder(BorderFactory.createTitledBorder("multiple_choice"));
        setLayout(new MigLayout("", "[] ","[] [] [] [] [] "));

        /* Label definitions*/
        JLabel Question_Title = new JLabel("Queston title:");
        JLabel Question = new JLabel("Question");
        JPanel Q_panel_0 = new JPanel();
        JPanel Blank_panel_1 = new JPanel();
        JPanel Blank_panel_2 = new JPanel();
        JLabel Gift_Output = new JLabel("Gift Output:");
        //JLabel Question = new JLabel("Question");
        JLabel Answer = new JLabel("Answer");
        /*panel component creation*/
        JTextArea Question_Title_Text = new JTextArea(2,20);
        JTextArea Question_Text = new JTextArea(8,20);

        JTextArea Question_0 = new JTextArea();
        JTextArea Answer_0 = new JTextArea();
        JTextArea Question_1 = new JTextArea();
        JTextArea Answer_1 = new JTextArea();
        JTextArea Question_2 = new JTextArea();
        JTextArea Answer_2 = new JTextArea();
        JTextArea Question_3 = new JTextArea();
        JTextArea Answer_3 = new JTextArea();
        JTextArea Question_4 = new JTextArea();
        JTextArea Answer_4 = new JTextArea();
        JTextArea Question_5 = new JTextArea();
        JTextArea Answer_5 = new JTextArea();
        JTextArea Question_6 = new JTextArea();
        JTextArea Answer_6 = new JTextArea();

        JRadioButton Choice_0_correct = new JRadioButton("Correct");
        JRadioButton Choice_1_correct = new JRadioButton("Correct");
        JRadioButton Choice_2_correct = new JRadioButton("Correct");
        JRadioButton Choice_3_correct = new JRadioButton("Correct");
        JRadioButton Choice_4_correct = new JRadioButton("Correct");
        JRadioButton Choice_5_correct = new JRadioButton("Correct");
        JRadioButton Choice_6_correct = new JRadioButton("Correct");


        JLabel dummy1 = new JLabel(" ");
        JLabel dummy2 = new JLabel(" ");

        JButton Remove = new JButton("Remove");
        JButton Add_Q_A = new JButton("Add Q&A");
        JButton Clear_Question_Text = new JButton("Clear Question");
        JButton Create_Gift_Code = new JButton("Create Gift Code");
        JButton Clear_Gift_List = new JButton("Clear Gift List");
        JTextArea Gift_Output_Text = new JTextArea();
        Question_0.setVisible(true);




        /*panel additions*/
        add(Question_Title,"right,sg 2,split 2,span");
        add(Question_Title_Text, "pushx,growx,wrap");
        add(Question,"right,sg 2,split 2,span");
        add(Question_Text,"pushx,growx,wrap");
        add(Answer,"right,sg 2,split 2,span");
        JScrollPane panelPane = new JScrollPane(Q_panel_0);
        panelPane.setPreferredSize(new Dimension(0, 80));
        panelPane.setVerticalScrollBarPolicy(panelPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(panelPane, "pushx,growx");

        Q_panel_0.setPreferredSize(new Dimension(0, 250));
        Q_panel_0.setBorder(BorderFactory.createTitledBorder(""));
        Q_panel_0.setLayout(new MigLayout("", "[] [] [] []", "[] [] [] []"));


        Q_panel_0.add(new JLabel("Answer"), "left,pushx,growx");
        Q_panel_0.add(new JLabel("Feedback"), "pushx,growx,wrap");

        Q_panel_0.add(Question_0, "left,pushx,growx");
        Q_panel_0.add(Answer_0, "left,sg 1,pushx,growx");
        Q_panel_0.add(Choice_0_correct,"wrap");

        Q_panel_0.add(Question_1, "left,sg 1,pushx,growx");
        Q_panel_0.add(Answer_1, "left,sg 1,pushx,growx");
        Q_panel_0.add(Choice_1_correct,"wrap");

        Q_panel_0.add(Question_2,"left,sg 1,pushx,growx");
        Q_panel_0.add(Answer_2,"left,sg 1,pushx,growx");
        Q_panel_0.add(Choice_2_correct,"wrap");

        Q_panel_0.add(Question_3,"left,sg 1,pushx,growx");
        Q_panel_0.add(Answer_3,"left,sg 1,pushx,growx");
        Q_panel_0.add(Choice_3_correct,"wrap");

        Q_panel_0.add(Question_4,"left,sg 1,pushx,growx");
        Q_panel_0.add(Answer_4,"left,sg 1,pushx,growx");
        Q_panel_0.add(Choice_4_correct,"wrap");

        Q_panel_0.add(Question_5,"left,sg 1,pushx,growx");
        Q_panel_0.add(Answer_5,"left,sg 1,pushx,growx");
        Q_panel_0.add(Choice_5_correct,"wrap");

        Q_panel_0.add(Question_6,"left,sg 1,pushx,growx");
        Q_panel_0.add(Answer_6,"left,sg 1,pushx,growx");
        Q_panel_0.add(Choice_6_correct,"wrap");


        Blank_panel_1.setLayout(new MigLayout("", "[]","[]"));
        Blank_panel_1.setBorder(BorderFactory.createTitledBorder("Remove Selected"));
        Blank_panel_2.setLayout(new MigLayout("", "[grow]","[] []"));
        add(dummy1,"left,sg 2,split 2");
        add(Blank_panel_1,"left,sg 1");
        add(Blank_panel_2,"right,sg 1,span");

        Question_1.setVisible(false);
        Answer_1.setVisible(false);
        Question_2.setVisible(false);
        Answer_2.setVisible(false);
        Question_3.setVisible(false);
        Answer_3.setVisible(false);
        Question_4.setVisible(false);
        Answer_4.setVisible(false);
        Question_5.setVisible(false);
        Answer_5.setVisible(false);
        Question_6.setVisible(false);
        Answer_6.setVisible(false);
        Choice_1_correct.setVisible(false);
        Choice_2_correct.setVisible(false);
        Choice_3_correct.setVisible(false);
        Choice_4_correct.setVisible(false);
        Choice_5_correct.setVisible(false);
        Choice_6_correct.setVisible(false);


        Blank_panel_1.add(Add_Q_A,"left,sg 1,span");
        Blank_panel_1.add(Remove,"left,sg 1");
        Blank_panel_2.add(Clear_Question_Text,"right,sg 1,wrap");
        Blank_panel_2.add(Create_Gift_Code,"right,sg 1,span");
        add(Gift_Output,"right,sg 2,split 2,span");

        JScrollPane panelPane2 = new JScrollPane(Gift_Output_Text);
        panelPane2.setPreferredSize(new Dimension(0,80));
        panelPane2.setVerticalScrollBarPolicy(panelPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(panelPane2, "pushx,growx,pushy,growy,wrap");
        add(dummy2,"right,sg 2,split 2,span");
        add(Clear_Gift_List,"right,wrap");

        /*Creation of the button action listeners*/
        Remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
//                if(press_Cnt == 0)
//                {
//                    Answer_0.setVisible(false);
//                    Question_0.setVisible(false);
//                    Choice_0_correct.setVisible(false);
//                    Choice_0_correct.setSelected(false);
//                }else
                if(Question_6.isVisible() == true) {
                    Answer_6.setVisible(false);
                    Question_6.setVisible(false);
                    Choice_6_correct.setVisible(false);
                    Choice_6_correct.setSelected(false);
                }else if(Question_5.isVisible() == true) {
                    Question_5.setVisible(false);
                    Answer_5.setVisible(false);
                    Choice_5_correct.setVisible(false);
                    Choice_5_correct.setSelected(false);
                }else if(Question_4.isVisible() == true) {
                    Question_4.setVisible(false);
                    Answer_4.setVisible(false);
                    Choice_4_correct.setVisible(false);
                    Choice_4_correct.setSelected(false);
                }else if(Question_3.isVisible() == true) {
                    Question_3.setVisible(false);
                    Answer_3.setVisible(false);
                    Choice_3_correct.setVisible(false);
                    Choice_3_correct.setSelected(false);
                } else if(Question_2.isVisible() == true) {
                    Question_2.setVisible(false);
                    Answer_2.setVisible(false);
                    Choice_2_correct.setVisible(false);
                    Choice_2_correct.setSelected(false);
                } else if(Question_1.isVisible() == true) {
                    Question_1.setVisible(false);
                    Answer_1.setVisible(false);
                    Choice_1_correct.setVisible(false);
                    Choice_1_correct.setSelected(false);
                }
            }
        });
        Add_Q_A.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(Question_0.isVisible() == false)
                {
                    Answer_0.setVisible(true);
                    Question_0.setVisible(true);
                    Choice_0_correct.setVisible(true);
                }else if(Question_1.isVisible() == false)
                {
                    Answer_1.setVisible(true);
                    Question_1.setVisible(true);
                    Choice_1_correct.setVisible(true);
                }else if(Question_2.isVisible() == false)
                {
                    Question_2.setVisible(true);
                    Answer_2.setVisible(true);
                    Choice_2_correct.setVisible(true);
                }else if(Question_3.isVisible() == false)
                {
                    Question_3.setVisible(true);
                    Answer_3.setVisible(true);
                    Choice_3_correct.setVisible(true);

                } else if(Question_4.isVisible() == false)
                {
                    Question_4.setVisible(true);
                    Answer_4.setVisible(true);
                    Choice_4_correct.setVisible(true);

                } else if(Question_5.isVisible() == false)
                {
                    Question_5.setVisible(true);
                    Answer_5.setVisible(true);
                    Choice_5_correct.setVisible(true);

                } else if(Question_6.isVisible() == false)
                {
                    Question_6.setVisible(true);
                    Answer_6.setVisible(true);
                    Choice_6_correct.setVisible(true);
                }
            }
        });

        Clear_Question_Text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Question_Title_Text.setText("");
                Question_0.setText("");
                Answer_0.setText("");
                Question_1.setText("");
                Answer_1.setText("");
                Question_2.setText("");
                Answer_2.setText("");
                Question_3.setText("");
                Answer_3.setText("");
                Question_1.setVisible(false);
                Answer_1.setVisible(false);
                Question_2.setVisible(false);
                Answer_2.setVisible(false);
                Question_3.setVisible(false);
                Answer_3.setVisible(false);

                Choice_1_correct.setVisible(false);
                Choice_2_correct.setVisible(false);
                Choice_3_correct.setVisible(false);
                Choice_4_correct.setVisible(false);
                Choice_5_correct.setVisible(false);
                Choice_6_correct.setVisible(false);

                Choice_0_correct.setSelected(false);
                Choice_1_correct.setSelected(false);
                Choice_2_correct.setSelected(false);
                Choice_3_correct.setSelected(false);
                Choice_4_correct.setSelected(false);
                Choice_5_correct.setSelected(false);
                Choice_6_correct.setSelected(false);

            }
        });
        Create_Gift_Code.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Question_0.isVisible()){
                    if(Choice_0_correct.isSelected())
                    blank1="="+Question_0.getText().toString();
                    else
                        blank1="="+Question_0.getText().toString();

                    blank2="#"+Answer_0.getText().toString();
                }if(Question_1.isVisible()){
                    if(Choice_1_correct.isSelected())
                    blank3="="+Question_1.getText().toString();
                    else
                        blank3="~"+Question_1.getText().toString();

                    blank4="#"+Answer_1.getText().toString();
                }if(Question_2.isVisible()){
                    if(Choice_2_correct.isSelected())
                    blank5="="+Question_2.getText().toString();
                    else
                        blank5="~"+Question_2.getText().toString();

                    blank6="#"+Answer_2.getText().toString();
                }if(Question_3.isVisible()) {
                    if(Choice_3_correct.isSelected())
                    blank7="="+Question_3.getText().toString();
                    else
                        blank7="~"+Question_3.getText().toString();

                    blank8="#"+Answer_3.getText().toString();
                }if(Question_4.isVisible()) {
                    if(Choice_4_correct.isSelected())
                    blank9="="+Question_4.getText().toString();
                    else
                        blank9="~"+Question_4.getText().toString();
                    blank10="#"+Answer_4.getText().toString();
                }if(Question_5.isVisible()) {
                    if(Choice_4_correct.isSelected())
                    blank11="="+Question_5.getText().toString();
                    else
                        blank11="~"+Question_5.getText().toString();
                    blank12="#"+Answer_5.getText().toString();
                }if(Question_6.isVisible()) {
                    if(Choice_4_correct.isSelected())
                    blank13="="+Question_6.getText().toString();
                    else
                        blank13="~"+Question_6.getText().toString();
                    blank14 ="#"+Answer_6.getText().toString();
                }
                gift_code_output = "::"+Question_Title_Text.getText().toString()+"::"+Question_Text.getText().toString()
                        +"::{ "+blank1+blank2+"\n"+blank3+blank4+"\n"+blank5+blank6+"\n"+blank7+blank8+"\n"+"\n"+blank9
                        +blank10+"\n"+blank11+blank12+"\n"+blank13+blank14+" }";
                Gift_Output_Text.append(gift_code_output);

                Question_Title_Text.setText("");
                Question_Text.setText("");
                Question_0.setText("");
                Answer_0.setText("");
                Question_1.setText("");
                Answer_1.setText("");
                Question_2.setText("");
                Answer_2.setText("");
                Question_3.setText("");
                Answer_3.setText("");
                Question_4.setText("");
                Answer_4.setText("");
                Question_5.setText("");
                Answer_5.setText("");
                Question_6.setText("");
                Answer_6.setText("");
            }
        });
        Clear_Gift_List.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Gift_Output_Text.setText("");
            }
        });

    }
}

