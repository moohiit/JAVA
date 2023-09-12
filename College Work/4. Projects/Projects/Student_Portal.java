import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
class Login implements ActionListener{
    JFrame f1;
    JButton b1,reset;
    JTextField t1,t2;
    JLabel l1,l2;
    public Login(){
		
        f1=new JFrame("Login Page ");
        f1.setLayout(null);

        l1=new JLabel("Username :");
        l1.setBounds(100,50,100,30);
        f1.add(l1);

        l2=new JLabel("Password :");
        l2.setBounds(100,100,100,30);
        f1.add(l2);

        t1=new JTextField();
        t1.setBounds(200,50,100,30);
        f1.add(t1);

        t2=new JTextField();
        t2.setBounds(200,100,100,30);
        f1.add(t2);

        b1=new JButton("Login");
        b1.setBounds(130,150,70,30);
        f1.add(b1);
        b1.addActionListener(this);
        
        reset=new JButton("Reset");
        reset.setBounds(210,150,70,30);
        f1.add(reset);
        reset.addActionListener(this);

        f1.setSize(430,300);
        f1.setLayout(new BorderLayout());
        JLabel bg = new JLabel(new  ImageIcon("sky-dark-mix-blue.jpg"));
        f1.add(bg);
        f1.setVisible(true);
    }
    public void actionPerformed(ActionEvent e1){
        if(e1.getSource()==b1){
            String s1,s2;
            s1=t1.getText();
            s2=t2.getText();
            
            if(s1.equals("") && s2.equals("")){
                Home h1=new Home();
                JOptionPane.showMessageDialog(null,"Login Successful");
            }
            else{
                JOptionPane.showMessageDialog(null,"Login Denied");
            }
        }else if (e1.getSource() == reset) {
			String def = "";
			t1.setText(def);
			t2.setText(def);
		}	
    }
}
class Student_Portal{
    public static void main(String args[])
    {
    Login lg=new Login();
    }
}

