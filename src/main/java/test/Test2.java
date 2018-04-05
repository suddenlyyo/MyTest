package test;

import javax.swing.*;

/**
 * FileName: Test2
 *
 * @author: zhouxun
 * Date:     2018-03-25 17:34
 */
public class Test2 {
    static final  int WIDTH=300;
    static final  int HEIGHT=200;

    public static void main(String[] args) {
        JFrame frame = new JFrame("菜单测试");
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar jMenuBar = new JMenuBar();
        frame.setJMenuBar(jMenuBar);
        JMenu menu1 = new JMenu("菜单一");
        JMenu menu2 = new JMenu("菜单二");
        JMenu menu3 = new JMenu("菜单三");
        JMenu menu4 = new JMenu("菜单四");
        jMenuBar.add(menu1);
        jMenuBar.add(menu2);
        jMenuBar.add(menu3);
        jMenuBar.add(menu4);
        JMenuItem jMenuItem1 = new JMenuItem("菜单项一");
        JMenuItem jMenuItem2 = new JMenuItem("菜单项二");
        JMenuItem jMenuItem3 = new JMenuItem("菜单项三");
        JMenuItem jMenuItem4 = new JMenuItem("菜单项四");
        menu1.add(jMenuItem1);
        menu1.addSeparator();
        menu1.add(jMenuItem2);
        menu1.addSeparator();
        menu1.add(jMenuItem3);
        menu1.addSeparator();
        menu1.add(jMenuItem4);
        JLabel jLabel = new JLabel("标签一");
        JLabel jLabe2 = new JLabel("标签二");
        JLabel jLabe3 = new JLabel("标签三");
        JLabel jLabe4 = new JLabel("标签四");
        JPanel jPanel = new JPanel();
         frame.setContentPane(jPanel);
         jPanel.add(jLabel);
         jPanel.add(jLabe2);
         jPanel.add(jLabe3);
         jPanel.add(jLabe4);
        frame.setVisible(true);

    }
}
