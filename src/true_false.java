import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class true_false  extends JPanel
{
    String gift_code_output;
    String blank1 = "";
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("True/False");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new true_false());
        frame.pack();
        frame.setVisible(true);
    }

    public true_false()
    {
        /*Matching panel creation*/
        setPreferredSize(new Dimension(800,600));
        setLayout(null);
        setBorder(BorderFactory.createTitledBorder("True/False"));
        setLayout(new MigLayout("", "[] ","[] [] [] [] [] "));

        /* Label definitions*/
        JLabel Question_Title = new JLabel("Queston title:");
        JLabel Question = new JLabel("Question");
        JPanel Blank_panel_1 = new JPanel();
        JPanel Blank_panel_2 = new JPanel();
        JLabel Gift_Output = new JLabel("Gift Output:");

        /*panel component creation*/
        JTextArea Question_Title_Text = new JTextArea(2,20);
        JTextArea Question_Text = new JTextArea(8,20);
        JLabel dummy1 = new JLabel(" ");
        JLabel dummy2 = new JLabel(" ");
        JRadioButton Choice_0_correct = new JRadioButton("true");
        JRadioButton Choice_1_correct = new JRadioButton("false");
        JButton Clear_Question_Text = new JButton("Clear Question");
        JButton Create_Gift_Code = new JButton("Create Gift Code");
        JButton Clear_Gift_List = new JButton("Clear Gift List");
        JTextArea Gift_Output_Text = new JTextArea();


        /*panel additions*/
        add(Question_Title,"right,sg 2,split 2,span");
        add(Question_Title_Text, "pushx,growx,wrap");
        add(Question,"right,sg 2,split 2,span");
        add(Question_Text,"pushx,growx,wrap");

        Blank_panel_1.setLayout(new MigLayout("", "[]","[]"));
        Blank_panel_1.setBorder(BorderFactory.createTitledBorder("Select"));
        Blank_panel_2.setLayout(new MigLayout("", "[grow]","[] []"));
        add(dummy1,"left,sg 2,split 2");
        add(Blank_panel_1,"left,sg 1");
        add(Blank_panel_2,"right,sg 1,span");
        Blank_panel_1.add(Choice_0_correct,"left,sg 1,split 2");
        Blank_panel_1.add(Choice_1_correct,"left,sg 1,wrap");
        Blank_panel_2.add(Clear_Question_Text,"right,sg 1,wrap");
        Blank_panel_2.add(Create_Gift_Code,"right,sg 1,span");
        add(Gift_Output,"right,sg 2,split 2,span");
        add(Gift_Output_Text, "pushx,growx,pushy,growy,wrap");
        add(dummy2,"right,sg 2,split 2,span");
        add(Clear_Gift_List,"right,wrap");

        /*Creation of the button action listeners*/
        Clear_Question_Text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Question_Title_Text.setText("");
                Question_Text.setText("");
                Choice_0_correct.setSelected(false);
                Choice_1_correct.setSelected(false);
            }
        });
        Create_Gift_Code.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Choice_0_correct.isSelected()){
                    blank1="(T)";
                }if(Choice_1_correct.isSelected()) {
                    blank1="(F)";
                }
                gift_code_output = "::"+Question_Title_Text.getText().toString()
                        +"::"+Question_Text.getText().toString()+blank1;
                Gift_Output_Text.setText(gift_code_output);

                Question_Title_Text.setText("");
                Question_Text.setText("");
                Choice_0_correct.setSelected(false);
                Choice_1_correct.setSelected(false);
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