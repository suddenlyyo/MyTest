import javax.swing.*;
import java.awt.*;

/**
 * FileName: Form
 *
 * @author: zhouxun
 * Date:     2018-03-21 14:46
 */
public class Form {
    private JFrame jFrame=new JFrame();
    private  JButton jButton;
    private  JPanel jPanel=new JPanel();

    public static void main(String[] args) {
        JFrame form = new JFrame("Form");
        form.setContentPane(new Form().jPanel);
        new Form().jFrame.setBackground(Color.red);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.pack();
        form.setVisible(true);
    }



}
