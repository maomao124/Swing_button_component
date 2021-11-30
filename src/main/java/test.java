import javax.swing.*;
import java.awt.*;

/**
 * Project name(项目名称)：Swing按钮组件
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/30
 * Time(创建时间)： 20:34
 * Version(版本): 1.0
 * Description(描述)：Swing JButton：按钮组件
 * JButton()：创建一个无标签文本、无图标的按钮。
 * JButton(Icon icon)：创建一个无标签文本、有图标的按钮。
 * JButton(String text)：创建一个有标签文本、无图标的按钮。
 * JButton(String text,Icon icon)：创建一个有标签文本、有图标的按钮。
 * JButton类的常用方法
 * 方法名称	说明
 * addActionListener(ActionListener listener)	为按担组件注册 ActionListener 监听
 * void setIcon(Icon icon)	设置按钮的默认图标
 * void setText(String text)	设置按鈕的文本
 * void setMargin(Insets m)	设置按钮边框和标签之间的空白
 * void setMnemonic(int nmemonic)	设置按钮的键盘快捷键，所设置的快捷键在实际操作时需要结合
 * Alt 键进行实现
 * void setPressedIcon(Icon icon)	设置按下按钮时的图标
 * void setSelectedIcon(Icon icon)	设置选择按鈕时的图标
 * void setRolloveiicon(Icon icon)	设置鼠标移动到按扭区域时的图标
 * void setDisabledIcon(Icon icon)	设置按钮无效状态下的图标
 * void setVerticalAlignment(int alig)	设置图标和文本的垂直对齐方式
 * void setHorizontalAlignment(int alig)	设置图标和文本的水平对齐方式
 * void setEnable(boolean flag)	启用或禁用按扭
 * void setVerticalTextPosition(int textPosition)	设置文本相对于图标的垂直位置
 * void setHorizontalTextPosition(int textPosition)	设置文本相对于图标的水平位置
 */

public class test
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame("按钮测试");
        jFrame.setSize(640, 480);
        jFrame.setLocation(200, 200);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();
        JButton JButton1 = new JButton("按钮1，普通按钮");
        JButton JButton2 = new JButton("按钮2，带颜色");
        JButton JButton3 = new JButton("按钮3，不可用");
        JButton JButton4 = new JButton("按钮4，底部对齐");
        JButton jButton5 = new JButton("设置按下按钮时的图标");
        JButton jButton6 = new JButton("设置选择按鈕时的图标");
        JButton jButton7 = new JButton("设置鼠标移动到按扭区域时的图标");
        ImageIcon imageIcon = new ImageIcon("t.png");
        //ImageIcon imageIcon1 = new ImageIcon("t1.jpg");
        JLabel label = new JLabel("测试");
        label.setIcon(imageIcon);
        jButton6.setSelectedIcon(imageIcon);
        jButton5.setPressedIcon(imageIcon);
        jButton7.setRolloverIcon(imageIcon);
        jPanel.add(JButton1);
        JButton2.setBackground(Color.cyan);
        jPanel.add(JButton2);
        JButton3.setEnabled(false);
        jPanel.add(JButton3);
        Dimension preferredSize = new Dimension(160, 90);
        JButton4.setPreferredSize(preferredSize);
        JButton4.setVerticalAlignment(SwingConstants.BOTTOM);
        jPanel.add(JButton4);
        jPanel.add(jButton5);
        jPanel.add(jButton6);
        jPanel.add(jButton7);
        jPanel.add(label);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
