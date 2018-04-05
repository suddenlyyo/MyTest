package test;

import javax.swing.*;
import java.awt.*;

/**
 * FileName: HelloWorld4
 *
 * @author: zhouxun
 * Date:     2018-03-25 16:56
 */
public class HelloWorld4 {
    static final int WIDTH=300;
    static final int HEIGTH=200;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("添加内容面板测试程序");
        jFrame.setSize(WIDTH,HEIGTH);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        JPanel jPanel = new JPanel();
        jFrame.setContentPane(jPanel);
        JButton jButton = new JButton("确定");
        JButton jButton1 = new JButton("取消");
        jPanel.add(jButton);
        jPanel.add(jButton1);
        //为组件设置工具提示功能   鼠标悬停会有提示语
        jButton.setToolTipText("这是一个确定按钮");
        jButton1.setToolTipText("这是一个取消按钮");
        //设置按钮组件的边框
        jButton.setBorder(BorderFactory.createLineBorder(Color.red));
        jButton1.setBorder(BorderFactory.createLineBorder(Color.red));
    }
}
