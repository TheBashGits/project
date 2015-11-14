/**
 * Created by Aonghus on 14/11/2015.
 */
import javax.swing.*;
import net.miginfocom.swing.MigLayout;
public class fill_Blanks_Tab
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Fill Blanks");
        frame.setSize(200,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*Fill_Blanks panel creation*/
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Fill Blanks"));
        frame.add(panel);


        /* Label definitions*/
        JLabel Question_Title = new JLabel("Queston title:");
        JLabel Question_Start = new JLabel("Queston title:");
        JLabel Blanks = new JLabel("Blanks:");
        JLabel Question_End = new JLabel("Queston End:");
        JLabel Gift_Output = new JLabel("Gift Output:");

        /*panel component creation*/
        JTextField Question_Title_Text = new JTextField(20);
        JTextField Question_Start_Text = new JTextField(20);
        JTextField Blanks_Text = new JTextField(60);


        /*panel additions*/
        panel.add(Question_Title, "left, sg 1,split 2");
        panel.add(Question_Title_Text,"pushx,growx,wrap");
        panel.add(Question_Start, "left, sg 1,split 2");
        panel.add(Question_Start_Text,"pushx,growx,wrap");
        panel.add(Question_End, "left, sg 1,split 2");
        panel.add(Question_Title_Text,"pushx,growx,wrap");




    }
}
