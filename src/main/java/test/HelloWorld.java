package test;

import org.junit.Test;

import javax.swing.*;
import java.awt.*;

/**
 * FileName: HelloWorld  这是一个登录类,可设计成继承容器的类
 *
 * @author: zhouxun
 * Date:     2018-03-23 23:41
 */
public class HelloWorld extends JPanel {
    //设置整个顶层框架的宽度
    static final int WIDTH = 300;
    //设置整个顶层框架的高度
    static final int HEIGHT = 150;

    JFrame loginFrame;
     /**此方法用户添加组件到容器中按照网格的方式布排列组件
      *@param x  指定控件位于第几列
      *@param y  指定控件位于第几行
      *@param  w  指定控件占几列
      *@param h  指定控件占几行
      * */
    public void add(Component c, GridBagConstraints constraints, int x, int y, int w, int h) {
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.gridwidth = w;
        constraints.gridheight = h;
        add(c, constraints);
    }

    public HelloWorld() {
        loginFrame=new JFrame("欢迎来到java世界");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);
        loginFrame.add(this,BorderLayout.WEST);
        loginFrame.setSize(WIDTH,HEIGHT);
        //获取默认工具包
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        //获取屏幕大小
        Dimension size = toolkit.getScreenSize();
        int width=size.width;
        int height=size.height;
        int x=(width-WIDTH)/2;
        int y=(height-HEIGHT)/2;
        loginFrame.setLocation(x,y);
        JButton ok = new JButton("登录");
        JButton cancel = new JButton("取消");
        JLabel jLabel = new JLabel("欢迎进入java世界");
        JLabel name= new JLabel("用户名");
        JLabel password = new JLabel("密码");
        //设置指定长度的输入框
       final JTextField nameInput = new JTextField(15);
       final JTextField passwordInput = new JTextField(15);
        GridBagConstraints constraints = new GridBagConstraints();

        //当组件的显示区域大于它所请求的显示区域的大小时使用此字段
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.EAST;
        constraints.weightx=3;
        constraints.weighty=4;
        add(jLabel,constraints,0,0,3,1);
        add(name,constraints,0,1,2,1);
        add(password,constraints,0,2,1,1);
        add(nameInput,constraints,2,1,1,1);
        add(passwordInput,constraints,2,2,1,1);
        add(ok,constraints,0,3,1,1);
        add(cancel,constraints,3,3,1,1);
        loginFrame.setResizable(false);
        loginFrame.setVisible(true);


    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();

    }



}
