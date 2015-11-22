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
    String blank_output;
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Matching");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new fill_Blanks_Tab());
        frame.pack();
        frame.setVisible(true);
    }

    public matching_tab()
    {
        /*Matching panel creation*/
        setPreferredSize(new Dimension(800,600));
        setLayout(null);
        setBorder(BorderFactory.createTitledBorder("Matching"));
        setLayout(new MigLayout("", "[] [] [] ","[] [] [] [] [] "));

        /* Label definitions*/
        JLabel Question_Title = new JLabel("Queston title:");
        JPanel Q_panel_0 = new JPanel();
        JPanel Blank_panel_1 = new JPanel();
        JPanel Blank_panel_2 = new JPanel();

        JLabel Gift_Output = new JLabel("Gift Output:");

        /*panel component creation*/
        JTextField Question_Title_Text = new JTextField(20);
        JTextField Question_0 = new JTextField(20);
        JTextField Answer_0 = new JTextField(20);
        JTextField Question_1 = new JTextField(20);
        JTextField Answer_1 = new JTextField(20);
        JTextField Question_2 = new JTextField(20);
        JTextField Answer_2 = new JTextField(20);
        JTextField Question_3 = new JTextField(20);
        JTextField Answer_3 = new JTextField(20);

        JCheckBox Delete_0 = new JCheckBox("Delete");
        JCheckBox Delete_1 = new JCheckBox("Delete");
        JCheckBox Delete_2 = new JCheckBox("Delete");
        JCheckBox Delete_3 = new JCheckBox("Delete");


        JButton Remove = new JButton("Remove");
        JButton Add_Q_A = new JButton("Add Q&A");
        JButton Clear_Question_Text = new JButton("Clear Question");
        JButton Create_Gift_Code = new JButton("Create Gift Code");
        JButton Clear_Gift_List = new JButton("Clear Gift List");
        JTextField Gift_Output_Text = new JTextField(20);
        Question_0.setVisible(true);
        Delete_0.setVisible(true);



        /*panel additions*/
        // add(Question_Title, "right");
        add(Question_Title_Text, "pushx,growx,span");

        add(Q_panel_0,"pushx,growx,wrap");
        Q_panel_0.setPreferredSize(new Dimension(0,200));
        Q_panel_0.setBorder(BorderFactory.createTitledBorder("Choice"));
        Blank_panel_2.setBorder(BorderFactory.createTitledBorder("Select"));
        Q_panel_0.setLayout(new MigLayout("", "[grow] [] ","[] [] [] []"));
        Blank_panel_1.setLayout(new MigLayout("", "[]","[] [] [] []"));
        Blank_panel_2.setLayout(new MigLayout("", "[grow]","[] [] [] []"));
        Q_panel_0.add(Blank_panel_1,"left,pushx,growx,spany");
        Q_panel_0.add(Blank_panel_2,"spany");
        Blank_panel_1.add(Question_0, "left,pushx,growx,span");
        Blank_panel_1.add(Answer_0, "left,sg 1,pushx,growx,span");
        Blank_panel_1.add(Question_1, "left,sg 1,pushx,growx,span");
        Blank_panel_1.add(Answer_1, "left,sg 1,pushx,growx,span");
        Blank_panel_1.add(Question_2,"span");
        Blank_panel_1.add(Answer_2,"sg 1,span");
        Blank_panel_1.add(Question_3,"sg 1,span");
        Blank_panel_1.add(Answer_3,"sg 1,span");
        Blank_panel_2.add(Delete_0);

        //Question_0.setVisible(false);
        // Answer_0.setVisible(false);
        Question_1.setVisible(false);
        Answer_1.setVisible(false);
        Question_2.setVisible(false);
        Answer_2.setVisible(false);
        Question_3.setVisible(false);
        Answer_3.setVisible(false);

        JLabel buttons = new JLabel(" ");
        JLabel buttons2 = new JLabel(" ");
        JLabel buttons3 = new JLabel(" ");
        JLabel buttons4 = new JLabel(" ");
        add(buttons);
        add(Remove, "right,sg 1,split 2");
        add(Add_Q_A,"span,wrap");
        add(buttons2);
        add(Clear_Question_Text,"right,sg 1,span");
        add(buttons3);
        add(Create_Gift_Code,"right,sg 1,span");
        add(Gift_Output, "right");
        add(Gift_Output_Text, "pushx,growx,pushy,growy,span");
        add(buttons4);
        add(Clear_Gift_List,"right,pushx,growx");

        /*Creation of the button action listeners*/
        Remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(press_Cnt == 0)
                {
                    Answer_1.setVisible(false);
                    Question_1.setVisible(false);
                    press_Cnt--;
                    Q_panel_0.repaint();
                }else if(press_Cnt == 1)
                {
                    Question_2.setVisible(false);
                    Answer_2.setVisible(false);
                    press_Cnt--;
                    Q_panel_0.repaint();
                }else if(press_Cnt == 2)
                {
                    Question_3.setVisible(false);
                    Answer_3.setVisible(false);
                    press_Cnt--;
                    Q_panel_0.repaint();
                }


            }
        });
        Add_Q_A.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                if(press_Cnt == 0)
                {
                    Answer_1.setVisible(true);
                    Question_1.setVisible(true);
                    Delete_1.setVisible(true);
                    press_Cnt++;
                    Q_panel_0.repaint();
                }else if(press_Cnt == 1)
                {
                    Question_2.setVisible(true);
                    Answer_2.setVisible(true);
                    Delete_2.setVisible(true);
                    press_Cnt++;
                    Q_panel_0.repaint();
                }else if(press_Cnt == 2)
                {
                    Question_3.setVisible(true);
                    Answer_3.setVisible(true);
                    Delete_3.setVisible(true);
                    Q_panel_0.repaint();
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
                Delete_0.setVisible(false);
                Delete_1.setVisible(false);
                Delete_2.setVisible(false);
                Delete_3.setVisible(false);

            }
        });
        Create_Gift_Code.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Question_0.isVisible()){
                    blank1="="+Question_0.getText().toString();
                    blank2="->"+Answer_0;
                }if(Question_1.isVisible()){
                    blank3="~"+Question_1.getText().toString();
                    blank4="->"+Answer_1.getText().toString();
                }if(Question_2.isVisible()){
                    blank5="~"+Question_1.getText().toString();
                    blank6="->"+Answer_1.getText().toString();
                }if(Question_3.isVisible()) {
                    blank7="~"+Question_1.getText().toString();
                    blank8="->"+Answer_1.getText().toString();
                }
                gift_code_output = "::"+Question_Title_Text.getText().toString()
                        +"::{\n"+blank1+blank2+"\n"+blank3+blank4+"\n"+blank5+blank6+"\n"+blank7+blank8+" }";
                Gift_Output_Text.setText(gift_code_output);

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

