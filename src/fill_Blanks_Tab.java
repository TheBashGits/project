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
    String gift_code_output;
    String blank1 = "";
    String blank2 = "";
    String blank3 = "";
    String blank4 = "";
    String blank_output;
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Fill Blanks");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new fill_Blanks_Tab());
        frame.pack();
        frame.setVisible(true);
    }

    public fill_Blanks_Tab()
    {
        /*Fill_Blanks panel creation*/
        setPreferredSize(new Dimension(800,600));
        setLayout(null);
        setBorder(BorderFactory.createTitledBorder("Fill Blanks"));
        setLayout(new MigLayout("", "[] [] [] ","[] [] [] [] [] [] [] [] []"));

        /* Label definitions*/
        JLabel Question_Title = new JLabel("Queston title:");
        JLabel Question_Start = new JLabel("Queston start:");
        JLabel Blanks = new JLabel("Blanks:");
        JPanel Blank_panel = new JPanel();
        JPanel Blank_panel_1 = new JPanel();
        JPanel Blank_panel_2 = new JPanel();
        JLabel Question_End = new JLabel("Queston End:");
        JLabel Gift_Output = new JLabel("Gift Output:");

        /*panel component creation*/
        JTextField Question_Title_Text = new JTextField(20);
        JTextArea Question_Start_Text = new JTextArea(5,0);
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
        Blanks_Choice_0.setVisible(true);
        Choice_0_correct.setVisible(true);



        /*panel additions*/
        add(Question_Title, "right");
        add(Question_Title_Text, "pushx,growx,span");
        add(Question_Start, "right");
        add(Question_Start_Text, "pushx,growx,span");
        add(Blanks, "right");
        add(Blank_panel,"pushx,growx,wrap");
        Blank_panel.setPreferredSize(new Dimension(0,200));
        Blank_panel.setBorder(BorderFactory.createTitledBorder("Choice"));
        Blank_panel_2.setBorder(BorderFactory.createTitledBorder("Select"));
        Blank_panel.setLayout(new MigLayout("", "[grow] [] ","[] [] [] []"));
        Blank_panel_1.setLayout(new MigLayout("", "[]","[] [] [] []"));
        Blank_panel_2.setLayout(new MigLayout("", "[grow]","[] [] [] []"));
        Blank_panel.add(Blank_panel_1,"left,pushx,growx,spany");
        Blank_panel.add(Blank_panel_2,"spany");
        Blank_panel_1.add(Blanks_Choice_0, "left,pushx,growx,span");
        Blank_panel_1.add(Blanks_Choice_1, "left,sg 1,pushx,growx,span");
        Blank_panel_1.add(Blanks_Choice_2, "left,sg 1,pushx,growx,span");
        Blank_panel_1.add(Blanks_Choice_3, "left,sg 1,pushx,growx,span");
        Blank_panel_2.add(Choice_0_correct,"span");
        Blank_panel_2.add(Choice_1_correct,"sg 1,span");
        Blank_panel_2.add(Choice_2_correct,"sg 1,span");
        Blank_panel_2.add(Choice_3_correct,"sg 1,span");

        //Blanks_Choice_0.setVisible(false);
        //Choice_0_correct.setVisible(false);
        Blanks_Choice_1.setVisible(false);
        Choice_1_correct.setVisible(false);
        Blanks_Choice_2.setVisible(false);
        Choice_2_correct.setVisible(false);
        Blanks_Choice_3.setVisible(false);
        Choice_3_correct.setVisible(false);

        JLabel buttons = new JLabel(" ");
        JLabel buttons2 = new JLabel(" ");
        JLabel buttons3 = new JLabel(" ");
        JLabel buttons4 = new JLabel(" ");
        add(buttons);
        add(Remove_Blank, "right,sg 1,split 2");
        add(Add_Blank,"span,wrap");
        add(Question_End,"right");
        add(Question_End_Text, "pushx,growx,pushy,growy,span");
        add(buttons2);
        add(Clear_Question_Text,"right,sg 1,span");
        add(buttons3);
        add(Create_Gift_Code,"right,sg 1,span");
        add(Gift_Output, "right");
        add(Gift_Output_Text, "pushx,growx,pushy,growy,span");
        add(buttons4);
        add(Clear_Gift_List,"right,pushx,growx");

        /*Creation of the button action listeners*/
        Remove_Blank.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(press_Cnt == 0)
                {
                    Blanks_Choice_1.setVisible(false);
                    Choice_1_correct.setVisible(false);
                    press_Cnt--;
                    Blank_panel.repaint();
                }else if(press_Cnt == 1)
                {
                    Blanks_Choice_2.setVisible(false);
                    Choice_2_correct.setVisible(false);
                    press_Cnt--;
                    Blank_panel.repaint();
                }else if(press_Cnt == 2)
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

              if(press_Cnt == 0)
                {
                    Blanks_Choice_1.setVisible(true);
                    Choice_1_correct.setVisible(true);
                    press_Cnt++;
                    Blank_panel.repaint();
                }else if(press_Cnt == 1)
                {
                    Blanks_Choice_2.setVisible(true);
                    Choice_2_correct.setVisible(true);
                    press_Cnt++;
                    Blank_panel.repaint();
                }else if(press_Cnt == 2)
                {
                    Blanks_Choice_3.setVisible(true);
                    Choice_3_correct.setVisible(true);
                    Blank_panel.repaint();
                }
            }
        });

        Clear_Question_Text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Question_Title_Text.setText("");
                Question_Start_Text.setText("");
                Blanks_Choice_0.setText("");
                Blanks_Choice_1.setText("");
                Blanks_Choice_2.setText("");
                Blanks_Choice_3.setText("");
                Blanks_Choice_0.setText("");
                Blanks_Choice_1.setVisible(false);
                Blanks_Choice_2.setVisible(false);
                Blanks_Choice_3.setVisible(false);
                Choice_0_correct.setSelected(false);
                Choice_1_correct.setSelected(false);;
                Choice_2_correct.setSelected(false);;
                Choice_3_correct.setSelected(false);;
                Question_End_Text.setText("");
            }
        });
        Create_Gift_Code.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Blanks_Choice_0.isVisible()){
                    if(Choice_0_correct.isSelected())
                        blank1="="+Blanks_Choice_0.getText().toString();
                    else
                        blank1="~"+Blanks_Choice_0.getText().toString();
                }if(Blanks_Choice_1.isVisible()){
                    if(Choice_1_correct.isSelected())
                        blank2="="+Blanks_Choice_1.getText().toString();
                    else
                        blank2="~"+Blanks_Choice_1.getText().toString();
                }if(Blanks_Choice_2.isVisible()){
                    if(Choice_2_correct.isSelected())
                        blank3="="+Blanks_Choice_2.getText().toString();
                    else
                        blank3="~"+Blanks_Choice_2.getText().toString();
                }if(Blanks_Choice_3.isVisible())
                {
                    if(Choice_3_correct.isSelected())
                        blank4="="+Blanks_Choice_3.getText().toString();
                    else
                        blank4="~"+Blanks_Choice_3.getText().toString();
                }
                 gift_code_output = "::"+Question_Title_Text.getText().toString()
                        +"::"+Question_Start_Text.getText().toString()
                        +" {"+blank1+blank2+blank3+blank4+" }"+Question_End_Text.getText().toString();
                Gift_Output_Text.setText(gift_code_output);

                Question_Title_Text.setText("");
                Question_Start_Text.setText("");
                Blanks_Choice_0.setText("");
                Blanks_Choice_1.setText("");
                Blanks_Choice_2.setText("");
                Blanks_Choice_3.setText("");
                Choice_0_correct.setSelected(false);
                Choice_1_correct.setSelected(false);;
                Choice_2_correct.setSelected(false);;
                Choice_3_correct.setSelected(false);;
                Question_End_Text.setText("");



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

