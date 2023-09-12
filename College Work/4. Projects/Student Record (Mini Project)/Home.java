import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Home implements ActionListener{
    JFrame f1;
    JButton b1,b2,b3,b4;
    JLabel bg1,bg2,bg3,bg4;

    public Home(){
        f1=new JFrame("Student Management System");
        f1.setLayout(null);
       

        b1=new JButton("Register");
        b1.setBounds(30,35,120,30);
        bg1 = new JLabel(new  ImageIcon("sky-dark-mix-blue.jpg"));
        bg1.setBounds(0, 0, 500, 100);
        f1.add(bg1); 
        f1.add(b1);
        b1.addActionListener(this);

        b2=new JButton("Courses");
        b2.setBounds(30,135,120,30);
        bg2 = new JLabel(new  ImageIcon("sky-dark-mix-blue.jpg"));
        bg2.setBounds(0, 100, 500, 100);
        f1.add(bg2);
        f1.add(b2);
        b2.addActionListener(this);

        b3=new JButton("Attendence");
        b3.setBounds(30,235,120,30);
        bg3 = new JLabel(new  ImageIcon("sky-dark-mix-blue.jpg"));
        bg3.setBounds(0, 200, 500, 100);
        f1.add(bg3);
        f1.add(b3);
        b3.addActionListener(this);

        b4=new JButton("Fees");
        b4.setBounds(30,335,120,30);
        bg4 = new JLabel(new  ImageIcon("sky-dark-mix-blue.jpg"));
        bg4.setBounds(0, 300, 500, 100);
        f1.add(bg4);
        f1.add(b4);
        b4.addActionListener(this);

        f1.setSize(400,450);
        f1.setVisible(true);
    }
    public void actionPerformed(ActionEvent e2){
        if(e2.getSource()==b1){   
            // Functionality of Button1          
            Registration rg = new Registration();
        }else if(e2.getSource()==b2){
            // Functionality of Button2
            Courses cs = new Courses();
        }else if(e2.getSource()==b3){
            // Functionality of Button3
            Attendence ad = new Attendence();
        }else if(e2.getSource()==b4){
            // Functionality of Button4
            FeeStructure fee = new FeeStructure();

        }	
    }
}
