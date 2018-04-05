package test;

import javax.swing.*;
import java.awt.*;

/**
 * FileName: HelloWorld2
 *
 * @author: zhouxun
 * Date:     2018-03-25 15:16
 */
public class HelloWorld2 extends JTabbedPane {
    private static final Long serialVersionUID=1L;
    static final int WIDTH=600;
    static final int HEIGHT=400;
    public HelloWorld2(){
        JFrame jFrame = new JFrame("测试窗口");
        JPanel jPanel = new JPanel();
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
        //设置此容器的布局管理器
        setLayout(new BorderLayout());
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        JPanel jPanel4 = new JPanel();
        JPanel jPanel5 = new JPanel();
        jPanel1.setLayout(new BorderLayout());
        addTab("jPanel1",jPanel1);
        setEnabledAt(0,true);
        setTitleAt(0,"测试页 1");
        addTab("jPanel2",jPanel2);
        setEnabledAt(1,true);
        setTitleAt(1,"测试页 2");
        addTab("jPanel3",jPanel3);
        setEnabledAt(2,true);
        setTitleAt(2,"测试页 3");
        addTab("jPanel4",jPanel4);
        setEnabledAt(3,true);
        setTitleAt(3,"测试页 4");
        addTab("jPanel5",jPanel5);
        setEnabledAt(4,true);
        setTitleAt(4,"测试页 5");
        //设置此组件的首选大小
        setPreferredSize(new Dimension(500,200));
        //设置此选项卡窗格的选项卡布局
        setTabPlacement(JTabbedPane.TOP);
        //设置一次运行中不能放入所有选项卡时,选项卡窗格对选项卡布局的安排策略
        setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        //将此组件添加到容器中
        jPanel.add("Center",this);
        //使组件显示
        setVisible(true);
    }

    public static void main(String[] args) {
        HelloWorld2 helloWorld2 = new HelloWorld2();

    }
}
