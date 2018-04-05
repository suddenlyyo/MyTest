package test;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * FileName: Test3
 *
 * @author: zhouxun
 * Date:     2018-03-25 18:52
 */
public class Test3 {
    static final int WIDTH=300;
    static final int HEIGHT=200;

    public static void main(String[] args) {
        JFrame frame = new JFrame("测试程序");
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
      final   JTextField field1 = new JTextField(10);
      final   JTextField field2 = new JTextField(10);
      final   JTextField field3 = new JTextField(10);
        JLabel label = new JLabel("*");
        JPanel panel = new JPanel();
        frame.setContentPane(panel);
        JButton button = new JButton("=");
        panel.add(field1);
        panel.add(label);
        panel.add(field2);
        panel.add(button);
        panel.add(field3);
        button.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                 Double aDouble1 = Double.parseDouble(field1.getText());
                 Double aDouble2 = Double.parseDouble(field2.getText());
                 field3.setText(String.valueOf((aDouble1*aDouble2)));

            }
        });

    }
}
