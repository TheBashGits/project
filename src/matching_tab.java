import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aonghus on 22/11/2015.
 */


public class matching_tab  extends JPanel
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
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Matching");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new matching_tab());
        frame.pack();
        frame.setVisible(true);
    }

    public matching_tab()
    {
        /*Matching panel creation*/
        setPreferredSize(new Dimension(800,600));
        setLayout(null);
        setBorder(BorderFactory.createTitledBorder("Matching"));
        setLayout(new MigLayout("", "[] ","[] [] [] [] [] "));

        /* Label definitions*/
        JLabel Question_Title = new JLabel("Queston title:");
        JPanel Q_panel_0 = new JPanel();
        JPanel Blank_panel_1 = new JPanel();
        JPanel Blank_panel_2 = new JPanel();
        JLabel Gift_Output = new JLabel("Gift Output:");
        JLabel Question = new JLabel("Question");
        JLabel Answer = new JLabel("Answer");
        /*panel component creation*/
        JTextArea Question_Title_Text = new JTextArea(2,20);
        JTextArea Question_0 = new JTextArea();
        JTextArea Answer_0 = new JTextArea();
        JTextArea Question_1 = new JTextArea();
        JTextArea Answer_1 = new JTextArea();
        JTextArea Question_2 = new JTextArea();
        JTextArea Answer_2 = new JTextArea();
        JTextArea Question_3 = new JTextArea();
        JTextArea Answer_3 = new JTextArea();

        JCheckBox Delete_0 = new JCheckBox("Delete");
        JCheckBox Delete_1 = new JCheckBox("Delete");
        JCheckBox Delete_2 = new JCheckBox("Delete");
        JCheckBox Delete_3 = new JCheckBox("Delete");

        JLabel buttons = new JLabel(" ");
        JLabel buttons2 = new JLabel(" ");
        JLabel buttons3 = new JLabel(" ");
        JLabel buttons4 = new JLabel(" ");
        JLabel dummy = new JLabel(" ");
        JLabel dummy1 = new JLabel(" ");
        JLabel dummy2 = new JLabel(" ");
        JLabel dummy3 = new JLabel(" ");


        JButton Remove = new JButton("Remove");
        JButton Add_Q_A = new JButton("Add Q&A");
        JButton Clear_Question_Text = new JButton("Clear Question");
        JButton Create_Gift_Code = new JButton("Create Gift Code");
        JButton Clear_Gift_List = new JButton("Clear Gift List");
        JTextArea Gift_Output_Text = new JTextArea();
        Question_0.setVisible(true);
        Delete_0.setVisible(true);



        /*panel additions*/
        add(Question_Title,"right,sg 2,split 2,span");
        add(Question_Title_Text, "pushx,growx,wrap");
        add(dummy,"right,sg 2,split 2,span");
        add(Q_panel_0,"pushx,growx,span");
        Q_panel_0.setPreferredSize(new Dimension(0,200));
        Q_panel_0.setBorder(BorderFactory.createTitledBorder(""));
        Q_panel_0.setLayout(new MigLayout("", "[] [] [] []","[] [] [] []"));
        Q_panel_0.add(buttons2);
        Q_panel_0.add(Question,"left");
        Q_panel_0.add(Answer,"left,span");
        Q_panel_0.add(Add_Q_A,"left");
        Q_panel_0.add(Question_0, "left,pushx,growx");
        Q_panel_0.add(Answer_0, "left,sg 1,pushx,growx");
        Q_panel_0.add(Delete_0,"wrap");
        Q_panel_0.add(buttons);
        Q_panel_0.add(Question_1, "left,sg 1,pushx,growx");
        Q_panel_0.add(Answer_1, "left,sg 1,pushx,growx");
        Q_panel_0.add(Delete_1,"wrap");
        Q_panel_0.add(buttons3);
        Q_panel_0.add(Question_2,"left,sg 1,pushx,growx");
        Q_panel_0.add(Answer_2,"left,sg 1,pushx,growx");
        Q_panel_0.add(Delete_2,"wrap");
        Q_panel_0.add(buttons4);
        Q_panel_0.add(Question_3,"left,sg 1,pushx,growx");
        Q_panel_0.add(Answer_3,"left,sg 1,pushx,growx");
        Q_panel_0.add(Delete_3,"wrap");

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
        Delete_1.setVisible(false);
        Delete_2.setVisible(false);
        Delete_3.setVisible(false);

        Blank_panel_1.add(Remove,"left,sg 1");
        Blank_panel_2.add(Clear_Question_Text,"right,sg 1,wrap");
        Blank_panel_2.add(Create_Gift_Code,"right,sg 1,span");
        add(Gift_Output,"right,sg 2,split 2,span");
        add(Gift_Output_Text, "pushx,growx,pushy,growy,wrap");
        add(dummy2,"right,sg 2,split 2,span");
        add(Clear_Gift_List,"right,wrap");

        /*Creation of the button action listeners*/
        Remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(Delete_0.isSelected())
                {
                    Answer_0.setVisible(false);
                    Question_0.setVisible(false);
                    Delete_0.setVisible(false);
                    Delete_0.setSelected(false);
                }

                if(Delete_1.isSelected())
                {
                    Answer_1.setVisible(false);
                    Question_1.setVisible(false);
                    Delete_1.setVisible(false);
                    Delete_1.setSelected(false);
                }
                if(Delete_2.isSelected())
                {
                    Question_2.setVisible(false);
                    Answer_2.setVisible(false);
                    Delete_2.setVisible(false);
                    Delete_2.setSelected(false);
                }
                if(Delete_3.isSelected())
                {
                    Question_3.setVisible(false);
                    Answer_3.setVisible(false);
                    Delete_3.setVisible(false);
                    Delete_3.setSelected(false);
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
                    Delete_0.setVisible(true);
                }else if(Question_1.isVisible() == false)
                {
                    Answer_1.setVisible(true);
                    Question_1.setVisible(true);
                    Delete_1.setVisible(true);
                }else if(Question_2.isVisible() == false)
                {
                    Question_2.setVisible(true);
                    Answer_2.setVisible(true);
                    Delete_2.setVisible(true);
                }else if(Question_3.isVisible() == false)
                {
                    Question_3.setVisible(true);
                    Answer_3.setVisible(true);
                    Delete_3.setVisible(true);

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

                Delete_1.setVisible(false);
                Delete_2.setVisible(false);
                Delete_3.setVisible(false);

                Delete_0.setSelected(false);
                Delete_1.setSelected(false);
                Delete_2.setSelected(false);
                Delete_3.setSelected(false);

            }
        });
        Create_Gift_Code.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Question_0.isVisible()){
                    blank1="="+Question_0.getText().toString();
                    blank2="->"+Answer_0.getText().toString();
                }if(Question_1.isVisible()){
                    blank3="="+Question_1.getText().toString();
                    blank4="->"+Answer_1.getText().toString();
                }if(Question_2.isVisible()){
                    blank5="="+Question_2.getText().toString();
                    blank6="->"+Answer_2.getText().toString();
                }if(Question_3.isVisible()) {
                    blank7="="+Question_3.getText().toString();
                    blank8="->"+Answer_3.getText().toString();
                }
                gift_code_output = "::"+Question_Title_Text.getText().toString()
                        +"::{ "+blank1+blank2+"\n"+blank3+blank4+"\n"+blank5+blank6+"\n"+blank7+blank8+" }";
                Gift_Output_Text.append(gift_code_output);

                Question_Title_Text.setText("");
                Question_0.setText("");
                Answer_0.setText("");
                Question_1.setText("");
                Answer_1.setText("");
                Question_2.setText("");
                Answer_2.setText("");
                Question_3.setText("");
                Answer_3.setText("");
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