import java.awt.*;
import javax.swing.*;
class Traffic_Light{
    JFrame f1;
    JButton b1,b2,b3;
    JLabel l1,l2,l3,bg;
    JRadioButton rb1,rb2,rb3;
    ButtonGroup bgp;

    public Traffic_Light(){
        f1 = new JFrame("Traffic Light System ");
        f1.setLayout(null);

        b1 = new JButton("Red");
        b1.setBounds(50,50,80,30);
        f1.add(b1);
        b2 = new JButton("Yellow");
        b2.setBounds(150,50,80,30);
        f1.add(b2);
        b3 = new JButton("Green");
        b3.setBounds(250,50,80,30);
        f1.add(b3);

        rb1 = new JRadioButton("Red");
        rb1.setBounds(50,100,80,30);
        f1.add(rb1);
        rb2 = new JRadioButton("Yellow");
        rb2.setBounds(150,100,80,30);
        f1.add(rb2);
        rb3 = new JRadioButton("Blue");
        rb3.setBounds(250,100,80,30);
        f1.add(rb3);

        bgp = new ButtonGroup();
        bgp.add(rb1);
        bgp.add(rb2);
        bgp.add(rb3);

        f1.setLayout(new BorderLayout());
        bg = new JLabel(new ImageIcon("light-skyblue-yellow.jpg"));
        f1.add(bg);
        f1.setSize(400,500);
        f1.setVisible(true);
    }
}


public class Traffic_Lights {
    public static void main(String[] args) {
        Traffic_Light tl = new Traffic_Light();
    }
}
