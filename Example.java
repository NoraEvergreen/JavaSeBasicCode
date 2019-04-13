package swing_test;

import javax.swing.*;
import java.awt.*;

public class Example extends JFrame {       //定义一个类继承JFrame

    public void CreateJFrame(String title){     //定义一个CreateJFrame方法

        JFrame jFrame=new JFrame(title);        //实例化JFrame对象
        Container container= jFrame.getContentPane();       //获取一个容器
        JLabel ji=new JLabel("这是一个JFrame窗体");       //创建一个JLabel标签

        ji.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(ji);                      //将标签添加到容器中
        container.setBackground(Color.white);   //设置容器的背景颜色

        jFrame.setVisible(true);        //使窗口可视

        jFrame.setSize(200,150);        //设置窗口大小
        jFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

    }
    public static void main(String[] args){
        new Example().CreateJFrame("创建一个Jframe窗体");     //在主方法中调用CreateJFrame
    }
}
