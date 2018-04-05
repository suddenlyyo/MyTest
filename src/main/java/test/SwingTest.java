package test;

import javax.swing.*;

/**
 * FileName: SwingTest   定义一个简单的窗口
 *
 * @author: zhouxun
 * Date:     2018-03-23 12:58
 */
public class SwingTest {
    static final  int WIDTH=300;
    static final  int HEIGHT=200;

    public static void main(String[] args) {
        //定义窗口的名字
        JFrame frame = new JFrame("SwingTest");
        //设置窗口的大小
        frame.setSize(WIDTH,HEIGHT);
        //使窗口上的最小化 最大化 关闭起作用
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //自动调节子组件到最合适的大小
        frame.pack();
        //如何为true就让前面的窗口显示出来
        frame.setVisible(true);
    }
}
