package test;

import javax.swing.*;

/**
 * FileName: Test1
 *
 * @author: zhouxun
 * Date:     2018-03-25 17:28
 */
public class Test1 {
    static final  int WIDTH=300;
    static final  int HEIGHT=200;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("测试");
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.setContentPane(panel);
        JButton button1 = new JButton("按钮1");
        JButton button2 = new JButton("按钮2");
        JButton button3 = new JButton("按钮3");
        JButton button4 = new JButton("按钮4");
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        JLabel label = new JLabel("标签");
        panel.add(label);
        frame.setVisible(true);


    }
}
