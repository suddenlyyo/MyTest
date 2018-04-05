package test;

import javax.swing.*;

/**
 * FileName: HelloWorld3
 *
 * @author: zhouxun
 * Date:     2018-03-25 16:03
 */
public class HelloWorld3 {
    static final int WIDTH = 300;
    static final int HEIGHT = 200;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("学生管理系统");
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar jMenuBar = new JMenuBar();
        //框架添加菜单栏
        frame.setJMenuBar(jMenuBar);
        //设置菜单组件
        JMenu jMenu1 = new JMenu("文件");
        JMenu jMenu2 = new JMenu("编辑");
        JMenu jMenu3 = new JMenu("视图");
        JMenu jMenu4 = new JMenu("帮助");
        jMenuBar.add(jMenu1);
        jMenuBar.add(jMenu2);
        jMenuBar.add(jMenu3);
        jMenuBar.add(jMenu4);
        //创建菜单项组件
        JMenuItem jMenuItem1 = new JMenuItem("打开");
        JMenuItem jMenuItem2 = new JMenuItem("保存");
        JMenuItem jMenuItem3 = new JMenuItem("打印");
        JMenuItem jMenuItem4 = new JMenuItem("退出");
        jMenu1.add(jMenuItem1);
        jMenu1.addSeparator();
        jMenu1.add(jMenuItem2);
        //添加分隔符
        jMenu1.addSeparator();
        jMenu1.add(jMenuItem3);
        jMenu1.addSeparator();
        jMenu1.add(jMenuItem4);
        frame.setVisible(true);
        JButton button = new JButton("这是个按钮");
        JPanel jPanel = new JPanel();
        jPanel.add(button);
        frame.setContentPane(jPanel);
    }
}
