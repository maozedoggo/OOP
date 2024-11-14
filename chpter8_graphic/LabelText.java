import java.awt.*
import javax.swing.*;

public class LabelText extends JFrame{
    private JLabel label1,;

    public LabelText(){
        super ("testing JLabel");
        Container container = getContentPanel();
        container.setLayout(new FlowLayout());
        label1 = new JLabel("Label with text");
        //label1.setToolTipText("this is label1");
        container.add(label1);
        setSize(275,200);
        setVisible(true);

        Icon rabbit = new ImageIcon("rabbit.gif");
        label2 = new JLabel("Label with tesx and Icon",
        rabbit,SwingCOnstant.LEFT);
        Label2.setTooltipText("This is an animated rabbit");
        container.add(label2);

        cb1 = new JCheckBox("C");
        cb2 = new JCheckBox("JAVA");
        c1.setBounds(20,20,200,50);
        c2.setBounds(20,70,200,50);
        add(c1);
        add(c2);

    }
    public static void main (String[]args){
        LabelTest application = new LabelTest();
        application.setDefaultCloseOperation(JFrame.Exit_ON_CLOSE);
    }

}