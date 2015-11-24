import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kev on 22/11/2015.
 */


public class Multiple_Choice_Advanced  extends JPanel
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
        frame.getContentPane().add(new Multiple_Choice_Advanced());
        frame.pack();
        frame.setVisible(true);
    }

    public Multiple_Choice_Advanced()
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

        JSpinner Spinner_0 = new JSpinner();
        JSpinner Spinner_1 = new JSpinner();
        JSpinner Spinner_2 = new JSpinner();
        JSpinner Spinner_3 = new JSpinner();
        JSpinner Spinner_4 = new JSpinner();
        JSpinner Spinner_5 = new JSpinner();
        JSpinner Spinner_6 = new JSpinner();
        JSpinner Spinner_7 = new JSpinner();



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
        add(Question_Title, "right,sg 2,split 2,span");
        add(Question_Title_Text, "pushx,growx,wrap");
        add(Question,"right,sg 2,split 2,span");
        add(Question_Text,"pushx,growx,wrap");
        add(Answer, "right,sg 2,split 2,span");
        JScrollPane panelPane = new JScrollPane(Q_panel_0);
        panelPane.setPreferredSize(new Dimension(0, 80));
        add(panelPane, "pushx,growx,span");
        // add(Q_panel_0,"pushx,growx,span");
        Q_panel_0.setPreferredSize(new Dimension(0, 200));
        Q_panel_0.setBorder(BorderFactory.createTitledBorder(""));
        Q_panel_0.setLayout(new MigLayout("", "[] [] [] []", "[] [] [] []"));



        Q_panel_0.add(new JLabel("Answer"), "left,pushx,growx");
        Q_panel_0.add(new JLabel("Feedback"), "pushx,growx,wrap");
        Q_panel_0.add(Question_0, "left,pushx,growx");
        Q_panel_0.add(Answer_0, "left,sg 1,pushx,growx");
        Q_panel_0.add(Spinner_0,"wrap");

        Q_panel_0.add(Question_1, "left,sg 1,pushx,growx");
        Q_panel_0.add(Answer_1, "left,sg 1,pushx,growx");
        Q_panel_0.add(Spinner_1,"wrap");

        Q_panel_0.add(Question_2,"left,sg 1,pushx,growx");
        Q_panel_0.add(Answer_2,"left,sg 1,pushx,growx");
        Q_panel_0.add(Spinner_2,"wrap");

        Q_panel_0.add(Question_3,"left,sg 1,pushx,growx");
        Q_panel_0.add(Answer_3,"left,sg 1,pushx,growx");
        Q_panel_0.add(Spinner_3,"wrap");

        Q_panel_0.add(Question_4,"left,sg 1,pushx,growx");
        Q_panel_0.add(Answer_4,"left,sg 1,pushx,growx");
        Q_panel_0.add(Spinner_4,"wrap");

        Q_panel_0.add(Question_5,"left,sg 1,pushx,growx");
        Q_panel_0.add(Answer_5,"left,sg 1,pushx,growx");
        Q_panel_0.add(Spinner_5,"wrap");

        Q_panel_0.add(Question_6,"left,sg 1,pushx,growx");
        Q_panel_0.add(Answer_6, "left,sg 1,pushx,growx");
        Q_panel_0.add(Spinner_6, "wrap");


        Blank_panel_1.setLayout(new MigLayout("", "[]", "[]"));
        Blank_panel_1.setBorder(BorderFactory.createTitledBorder("Remove Selected"));
        Blank_panel_2.setLayout(new MigLayout("", "[grow]", "[] []"));
        add(dummy1, "left,sg 2,split 2");
        add(Blank_panel_1, "left,sg 1");
        add(Blank_panel_2, "right,sg 1,span");

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
        Spinner_1.setVisible(false);
        Spinner_2.setVisible(false);
        Spinner_3.setVisible(false);
        Spinner_4.setVisible(false);
        Spinner_5.setVisible(false);
        Spinner_6.setVisible(false);


        Blank_panel_1.add(Add_Q_A,"left,sg 1,span");
        Blank_panel_1.add(Remove,"left,sg 1");
        Blank_panel_2.add(Clear_Question_Text,"right,sg 1,wrap");
        Blank_panel_2.add(Create_Gift_Code, "right,sg 1,span");
        add(Gift_Output,"right,sg 2,split 2,span");
        add(Gift_Output_Text, "pushx,growx,pushy,growy,wrap");
        add(dummy2,"right,sg 2,split 2,span");
        add(Clear_Gift_List, "right,wrap");

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
                    Spinner_6.setVisible(false);
                   Spinner_6.setValue(0);
                }else if(Question_5.isVisible() == true) {
                    Question_5.setVisible(false);
                    Answer_5.setVisible(false);
                    Spinner_5.setVisible(false);
                    Spinner_5.setValue(0);
                }else if(Question_4.isVisible() == true) {
                    Question_4.setVisible(false);
                    Answer_4.setVisible(false);
                    Spinner_4.setVisible(false);
                    Spinner_4.setValue(0);
                }else if(Question_3.isVisible() == true) {
                    Question_3.setVisible(false);
                    Answer_3.setVisible(false);
                    Spinner_3.setVisible(false);
                    Spinner_3.setValue(0);
                } else if(Question_2.isVisible() == true) {
                    Question_2.setVisible(false);
                    Answer_2.setVisible(false);
                    Spinner_2.setVisible(false);
                    Spinner_2.setValue(0);
                } else if(Question_1.isVisible() == true) {
                    Question_1.setVisible(false);
                    Answer_1.setVisible(false);
                    Spinner_1.setVisible(false);
                    Spinner_1.setValue(0);
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
                    Spinner_0.setVisible(true);
                }else if(Question_1.isVisible() == false)
                {
                    Answer_1.setVisible(true);
                    Question_1.setVisible(true);
                    Spinner_1.setVisible(true);
                }else if(Question_2.isVisible() == false)
                {
                    Question_2.setVisible(true);
                    Answer_2.setVisible(true);
                    Spinner_2.setVisible(true);
                }else if(Question_3.isVisible() == false)
                {
                    Question_3.setVisible(true);
                    Answer_3.setVisible(true);
                    Spinner_3.setVisible(true);
                } else if(Question_4.isVisible() == false)
                {
                    Question_4.setVisible(true);
                    Answer_4.setVisible(true);
                    Spinner_4.setVisible(true);

                } else if(Question_5.isVisible() == false)
                {
                    Question_5.setVisible(true);
                    Answer_5.setVisible(true);
                    Spinner_5.setVisible(true);

                } else if(Question_6.isVisible() == false)
                {
                    Question_6.setVisible(true);
                    Answer_6.setVisible(true);
                    Spinner_6.setVisible(true);
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

                Spinner_1.setVisible(false);
                Spinner_2.setVisible(false);
                Spinner_3.setVisible(false);
                Spinner_4.setVisible(false);
                Spinner_5.setVisible(false);
                Spinner_6.setVisible(false);

                Spinner_1.setValue(0);
                Spinner_2.setValue(0);
                Spinner_3.setValue(0);
                Spinner_4.setValue(0);
                Spinner_5.setValue(0);
                Spinner_6.setValue(0);
                Spinner_7.setValue(0);

            }
        });
        Create_Gift_Code.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String total;
                String title = Question_Title_Text.getText().toString();
                String question = Question_Text.getText().toString();
                total = "::"+title+"::"+question+"?{\n";

                if(Question_0.isVisible()) {
                    int spi = Integer.parseInt(Spinner_0.getValue().toString());
                    String qs = Question_0.getText().toString();
                    total += "~%" + spi + "%" + qs + "\n";
                    total += "#" + Answer_0.getText().toString()+"\n";

                  //  blank2 = "#" + Answer_0.getText().toString();
                }if(Question_1.isVisible()){
                    int spi = Integer.parseInt(Spinner_1.getValue().toString());
                    String qs = Question_1.getText().toString();
                    total += "~%" + spi + "%" + qs + "\n";
                    total += "#" + Answer_1.getText().toString()+"\n";
                }if(Question_2.isVisible()){
                    int spi = Integer.parseInt(Spinner_2.getValue().toString());
                    String qs = Question_2.getText().toString();
                    total += "~%" + spi + "%" + qs + "\n";
                    total += "#" + Answer_2.getText().toString()+"\n";
                }if(Question_3.isVisible()) {
                    int spi = Integer.parseInt(Spinner_3.getValue().toString());
                    String qs = Question_3.getText().toString();
                    total += "~%" + spi + "%" + qs + "\n";
                    total += "#" + Answer_3.getText().toString()+"\n";
                }if(Question_4.isVisible()) {
                    int spi = Integer.parseInt(Spinner_4.getValue().toString());
                    String qs = Question_4.getText().toString();
                    total += "~%" + spi + "%" + qs + "\n";
                    total += "#" + Answer_4.getText().toString()+"\n";
                }if(Question_5.isVisible()) {
                    int spi = Integer.parseInt(Spinner_5.getValue().toString());
                    String qs = Question_5.getText().toString();
                    total += "~%" + spi + "%" + qs + "\n";
                    total += "#" + Answer_5.getText().toString()+"\n";
                }if(Question_6.isVisible()) {
                    int spi = Integer.parseInt(Spinner_6.getValue().toString());
                    String qs = Question_6.getText().toString();
                    total += "~%" + spi + "%" + qs + "\n";
                    total += "#" + Answer_6.getText().toString();
                }
                total+="\n}";
                Gift_Output_Text.append(total);

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
                Spinner_1.setValue(0);
                Spinner_2.setValue(0);
                Spinner_3.setValue(0);
                Spinner_4.setValue(0);
                Spinner_5.setValue(0);
                Spinner_6.setValue(0);
                Spinner_7.setValue(0);
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