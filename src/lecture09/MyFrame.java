package lecture09;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        super("타이틀문자열");
//        setTitle("타이틀문자열");
//        setTitle("300x300 스윙 프레임 만들기");
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        Container c = frame.getContentPane();
        JButton b = new JButton("Click");
        c.add(b);
        JPanel p = new JPanel();
        frame.setContentPane(p);

    }
}
