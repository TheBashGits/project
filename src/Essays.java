import net.miginfocom.swing.MigLayout;
//Test
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kev on 14/11/2015.
 */
public class Essays  extends JPanel
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Essay");
        //frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Essays());
        frame.pack();
        //frame.setLocation(300, 300);
        frame.setVisible(true);
    }

    public Essays()
    {
        /*Fill_Blanks panel creation*/
        //JPanel panel = new JPanel();
        setPreferredSize(new Dimension(800,600));
        setLayout(null);
        setBorder(BorderFactory.createTitledBorder("Essay"));

        setLayout(new MigLayout("","[]10[] ","[] [] [] []"));

        /* Label definitions*/
        JLabel questionTitle = new JLabel("Queston title:");    //label top left
        JLabel question = new JLabel("Queston:");               //label 2nd left
        JLabel giftOutput = new JLabel("Gift Output:");         //label bottom feft

        /*panel component creation*/
        JTextArea questionTitleText = new JTextArea(5,20);
        JTextArea questionText = new JTextArea(5,20);
        JTextArea giftOutputText = new JTextArea(5,20);

        JButton Clear_Question_Text = new JButton("Clear Question Text");   //button middle right
        JButton Create_Gift_Code = new JButton("Create Gift Code");        //button 2nd middle right
        JButton Clear_Gift_List = new JButton("Clear Output List");        //button bottom right


        /*panel additions*/
       // questionTitle.setBounds(500, 400, 80, 80);
        add(questionTitle, "left, sg 1,split 2");
        add(questionTitleText, "pushx,growx,wrap");

        add(question, "top, sg 1,split 2");
        add(questionText, "pushx,growx,pushy,growy,span 2 2,wrap");

        add(Clear_Question_Text, "right,sg 2,wrap ");
        add(Create_Gift_Code, "right,sg 2,wrap ");



        add(giftOutput, "top,sg 1,split 2");
        add(giftOutputText, "pushx,growx,growy,pushy,wrap");
        add(Clear_Gift_List, "right,sg 2, wrap ");

        Clear_Question_Text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                questionText.setText("");


            }
        });
        Create_Gift_Code.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = questionTitleText.getText();
                String question = questionText.getText();
                String gift = "::"+title+"::"+question+"{}\n";
                giftOutputText.append(gift);
            }
        });





        Clear_Gift_List.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                giftOutputText.setText("");
            }
        });

    }
}



