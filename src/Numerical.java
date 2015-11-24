import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kev on 22/11/2015.
 */


public class Numerical extends JPanel
{

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("multiple_choice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Numerical());
        frame.pack();
        frame.setVisible(true);
    }

    public Numerical()
    {
        /*Matching panel creation*/
        setPreferredSize(new Dimension(800,600));
        setLayout(null);
        setBorder(BorderFactory.createTitledBorder("multiple_choice"));
        setLayout(new MigLayout("", "[] ","[] [] [] [] [] "));

        /* Label definitions*/
        JLabel Question_Type = new JLabel("Question Type");
        JLabel Question_Title = new JLabel("Queston title:");
        JLabel Question = new JLabel("Question");
        JPanel Q_panel_0 = new JPanel();
        JPanel Blank_panel_1 = new JPanel();
        JPanel Blank_panel_2 = new JPanel();
        JLabel Gift_Output = new JLabel("Gift Output:");
        JLabel Answer = new JLabel("Answer");


        /*panel component creation*/
        JTextArea Question_Title_Text = new JTextArea(2,20);
        JTextArea Question_Text = new JTextArea(8,20);

        JTextArea Question_0 = new JTextArea();
        JTextArea Answer_0 = new JTextArea();

        JLabel dummy1 = new JLabel(" ");
        JLabel dummy2 = new JLabel(" ");

        JButton Clear_Question_Text = new JButton("Clear Question");
        JButton Create_Gift_Code = new JButton("Create Gift Code");
        JButton Clear_Gift_List = new JButton("Clear Gift List");
        JTextArea Gift_Output_Text = new JTextArea();
        Question_0.setVisible(true);

        String[] ComBox = {"Answer (+/-) Set Range","Second"};
        JComboBox jmb = new JComboBox(ComBox);


        /*panel additions*/
        add(Question_Type,"left,sg 2,split 2,span");
        add(jmb,"left,wrap");
        add(Question_Title, "right,sg 2,split 2,span");
        add(Question_Title_Text, "pushx,growx,wrap");
        add(Question,"right,sg 2,split 2,span");
        add(Question_Text,"pushx,growx,wrap");
        add(Answer, "right,sg 2,split 2,span");
         add(Q_panel_0,"pushx,growx,span");
        Q_panel_0.setPreferredSize(new Dimension(0, 40));
        Q_panel_0.setBorder(BorderFactory.createTitledBorder(""));
        Q_panel_0.setLayout(new MigLayout("", "[] [] [] []", "[] [] [] []"));




        Q_panel_0.add(new JLabel("Answer"), "left,pushx,growx");
        Q_panel_0.add(new JLabel("Feedback"), "pushx,growx,wrap");
        Q_panel_0.add(Question_0, "left,pushx,growx");
        Q_panel_0.add(Answer_0, "left,sg 1,pushx,growx");

        Blank_panel_1.setLayout(new MigLayout("", "[]", "[]"));
        Blank_panel_1.setBorder(BorderFactory.createTitledBorder("Range Options"));
        Blank_panel_2.setLayout(new MigLayout("", "[grow]", "[] []"));
        add(dummy1,"left,sg 2,split 2");
        add(Blank_panel_1, "sg 1,left,span, grow");
        add(Blank_panel_2, "right,span");


        //Range options values

        JLabel range= new JLabel("Range(+/-)");
        JSpinner spin = new JSpinner();
        JLabel rangeend = new JLabel("Range End");
        JSpinner spinend = new JSpinner();
        Answer_0.setEnabled(false);
        spinend.setEnabled(false);

        Blank_panel_1.add(range);
        Blank_panel_1.add(spin,"pushx,growx,pushy,growy");
        Blank_panel_1.add(rangeend);
        Blank_panel_1.add(spinend,"pushx,growx,pushy,growy");
        Blank_panel_2.add(Clear_Question_Text,"right,sg 1,wrap");
        Blank_panel_2.add(Create_Gift_Code, "right,sg 1,span");

        add(Gift_Output, "right,sg 2,split 2,span");
        add(Gift_Output_Text, "pushx,growx,pushy,growy,wrap");
        add(dummy2, "right,sg 2,split 2,span");
        add(Clear_Gift_List, "right,wrap");



        jmb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (jmb.getSelectedIndex() == 0) {
                    Answer_0.setEnabled(false);
                    spinend.setEnabled(false);
                } else if (jmb.getSelectedIndex() == 1) {
                    Answer_0.setEnabled(true);
                    spinend.setEnabled(true);
                }

            }
        });


        Clear_Question_Text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                Question_Title_Text.setText("");
                Question_0.setText("");
                Answer_0.setText("");
                spin.setValue(0);
                spinend.setValue(0);

            }
        });
        Create_Gift_Code.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String total;
                String title = Question_Title_Text.getText().toString();
                String question = Question_Text.getText().toString();
                String combo = jmb.getSelectedItem().toString();
                total = "#Question Type'" + combo + "'\n";
                total += "::" + title + "::" + question + "{";
                total += "#" + Question_0.getText().toString();
                total += spin.getValue().toString() + "::";
                total += spinend.getValue().toString() + "}";

                total += "\n";
                Gift_Output_Text.append(total);

                Question_Title_Text.setText("");
                Question_Text.setText("");
                Question_0.setText("");
                Answer_0.setText("");

                spin.setValue(0);
                spinend.setValue(0);


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