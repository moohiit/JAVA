import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class _1_loginPage implements ActionListener
{
    JFrame f1;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1;
    public _1_loginPage()
    {
        f1=new JFrame("login");
        f1.setLayout(null);
        f1.getContentPane().setBackground(Color.PINK);

        l1=new JLabel("Enter your name");
        l2=new JLabel("Enter your password");
        l1.setBounds(40,40,120,30);
        l2.setBounds(40,90,120,30);

        t1=new JTextField();
        t2=new JPasswordField();
        t1.setBounds(200,40,120,30);
        t2.setBounds(200,90,120,30);

        b1=new JButton("Login");
        b1.setBounds(150,150,90,30);
        f1.add(l1);
        f1.add(l2);
        f1.add(t1);
        f1.add(t2);
        f1.add(b1);

        b1.addActionListener(this);



        f1.setSize(600,300);
        f1.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        JOptionPane.showMessageDialog(b1,"welcome");
    }
    public static void main(String args[])
    {
        _1_loginPage m1=new _1_loginPage();
    }
}