package test;

import org.junit.Test;

import javax.swing.*;

/**
 * FileName: HellloWorld
 *
 * @author: zhouxun
 * Date:     2018-03-25 15:07
 */
public class HelloWorld1 {
    //设置整个顶层框架的宽度
    static final int WIDTH = 300;
    //设置整个顶层框架的高度
    static final int HEIGHT = 150;

    public static void main(String[] args) {

            JFrame frame = new JFrame("测试窗口");
            frame.setSize(WIDTH,HEIGHT);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            JPanel jPanel = new JPanel();

            JButton jButton = new JButton("按钮");
            jPanel.add(jButton);
            frame.setContentPane(jPanel);




    }
}
